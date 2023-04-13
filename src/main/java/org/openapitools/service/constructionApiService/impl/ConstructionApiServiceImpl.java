package org.openapitools.service.constructionApiService.impl;

import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.decoder.ByteStringDecoder;
import co.nstant.in.cbor.model.ByteString;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.openapitools.addedenum.AddressType;
import org.openapitools.addedenum.NetworkIdentifierEnum;
import org.openapitools.consotant.Const;
import org.openapitools.model.*;
import org.openapitools.service.constructionApiService.ConstructionApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Service
@Slf4j
public class ConstructionApiServiceImpl implements ConstructionApiService {

    @Autowired
    CardanoServiceImpl cardanoService;
    @Override
    public ConstructionDeriveResponse constructionDeriveService(ConstructionDeriveRequest constructionDeriveRequest) throws IllegalAccessException {
        PublicKey publicKey = constructionDeriveRequest.getPublicKey();
        NetworkIdentifierEnum networkIdentifier = getNetworkIdentifierByRequestParameters(constructionDeriveRequest.getNetworkIdentifier());

        log.info("[constructionDerive] About to check if public key has valid length and curve type");
        if (!isKeyValid(publicKey.getHexBytes(), publicKey.getCurveType().getValue())) {
            log.info("[constructionDerive] Public key has an invalid format");
            throw new IllegalArgumentException("invalidPublicKeyFormat");
        }
        log.info("[constructionDerive] Public key has a valid format");

        // eslint-disable-next-line camelcase
        PublicKey stakingCredential = ObjectUtils.isEmpty(constructionDeriveRequest.getMetadata()) ?null:constructionDeriveRequest.getMetadata().getStakingCredential();
        if (!ObjectUtils.isEmpty(stakingCredential)) {
            log.info("[constructionDerive] About to check if staking credential has valid length and curve type");
            if (!isKeyValid(stakingCredential.getHexBytes(), stakingCredential.getCurveType().getValue())) {
                log.info("[constructionDerive] Staking credential has an invalid format");
                throw new IllegalArgumentException("invalidStakingKeyFormat");
            }
            log.info("[constructionDerive] Staking credential key has a valid format");
        }

        // eslint-disable-next-line camelcase
        String addressType = ObjectUtils.isEmpty(constructionDeriveRequest.getMetadata()) ?null:constructionDeriveRequest.getMetadata().getAddressType();
        if (addressType!=null) {
            log.info("[constructionDerive] About to check if address type is valid");
            if (!isAddressTypeValid(addressType)) {
                log.info("[constructionDerive] Address type has an invalid value");
                throw new IllegalArgumentException("invalidAddressTypeError");
            }
            log.info("[constructionDerive] Address type has a valid value");
        }

        log.info("[constructionDerive] About to generate address");
        String address = cardanoService.generateAddress(
                networkIdentifier,
                publicKey.getHexBytes(),
                // eslint-disable-next-line camelcase
                stakingCredential.getHexBytes(),
                AddressType.findByValue(addressType)
        );
        if (address!=null) {
            log.error("[constructionDerive] There was an error generating address");
            throw new IllegalArgumentException("addressGenerationError");
        }
        log.info("[constructionDerive] new address is {}",address);
        return new ConstructionDeriveResponse(new AccountIdentifier(address));
    }

    @Override
    public ConstructionDeriveResponse constructionHashService(ConstructionHashRequest constructionHashRequest) throws IllegalAccessException, IOException, CborException {
        InputStream inputStream= new ByteArrayInputStream(constructionHashRequest.getSignedTransaction().getBytes());
        ByteStringDecoder byteStringDecoder = new ByteStringDecoder(new CborDecoder(inputStream),inputStream);
        ByteString byteString= byteStringDecoder.decode(inputStream.read());
        String signedTransaction = new String(byteString.getBytes(), StandardCharsets.UTF_8);

//        log.info("[constructionHash] About to get hash of signed transaction");
//        const transactionHash = cardanoService.getHashOfSignedTransaction(logger, signedTransaction);
//        log.info("[constructionHash] About to return hash of signed transaction");
//        // eslint-disable-next-line camelcase
//        return mapToConstructionHashResponse(transactionHash);
        return null;
    }

    @Override
    public NetworkIdentifierEnum getNetworkIdentifierByRequestParameters(NetworkIdentifier networkRequestParameters) {
        if (networkRequestParameters.getNetwork().equals(Const.MAINNET)) {
            return NetworkIdentifierEnum.CARDANO_MAINNET_NETWORK;
        }
        return NetworkIdentifierEnum.CARDANO_MAINNET_NETWORK;
    }

    @Override
    public boolean isKeyValid(String publicKeyBytes, String curveType) {
        return publicKeyBytes.length()==Const.PUBLIC_KEY_BYTES_LENGTH && curveType.equals(Const.VALID_CURVE_TYPE);
    }

    @Override
    public boolean isAddressTypeValid(String type) {
        return Arrays.stream(AddressType.values()).anyMatch(a->a.getValue().equals(type))||type.equals("")||type==null;
    }



}
