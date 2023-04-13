package org.openapitools.service.constructionApiService.impl;

import com.bloxbean.cardano.client.address.Address;
import com.bloxbean.cardano.client.address.AddressProvider;
import com.bloxbean.cardano.client.backend.blockfrost.service.http.CardanoLedgerApi;
import com.bloxbean.cardano.client.common.CardanoConstants;
import com.bloxbean.cardano.client.common.model.Network;
import com.bloxbean.cardano.client.crypto.bip32.key.HdKey;
import com.bloxbean.cardano.client.crypto.bip32.key.HdPublicKey;
import com.bloxbean.cardano.client.transaction.spec.cert.StakeCredential;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.openapitools.addedClass.AutoFree;
import org.openapitools.addedClass.ManagedFreeableScope;
import org.openapitools.addedFunctionalInterface.Functional;
import org.openapitools.addedenum.AddressType;
import org.openapitools.addedenum.NetworkIdentifierEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CardanoServiceImpl{

    public String generateAddress(NetworkIdentifierEnum networkIdentifierEnum, String publicKeyString, String stakingCredentialString, AddressType type) throws IllegalAccessException {
        log.info("[generateAddress] About to generate address from public key {} and network identifier {}",publicKeyString,networkIdentifierEnum);
        {
            byte[] pub = publicKeyString.getBytes();
            HdPublicKey paymentCredential = HdPublicKey.fromBytes(pub);

            if (type.getValue().equals(AddressType.REWARD.getValue())) {
                return generateRewardAddress(networkIdentifierEnum, paymentCredential);
            }

            if (type.getValue().equals(AddressType.BASE.getValue())) {
                if (stakingCredentialString!=null) {
                    log.error("[constructionDerive] No staking key was provided for base address creation");
                    throw new IllegalArgumentException("missingStakingKeyError");
                }
        StakeCredential stakingCredential = StakeCredential.fromKeyHash(stakingCredentialString.getBytes());

                return generateBaseAddress( networkIdentifierEnum,paymentCredential, HdPublicKey.fromBytes(stakingCredentialString.getBytes()));
            }

            return generateEnterpriseAddress(paymentCredential, networkIdentifierEnum);
        }
    }

    public String generateRewardAddress(NetworkIdentifierEnum networkIdentifierEnum,HdPublicKey paymentCredential){
        log.info("[generateRewardAddress] Deriving cardano reward address from valid public staking key");
    Address rewardAddress = AddressProvider.getRewardAddress(paymentCredential, new Network(networkIdentifierEnum.getValue(),networkIdentifierEnum.getProtocolMagic()));
        log.info("[generateRewardAddress] reward address is ${bech32address}");
        return rewardAddress.toBech32();
    }

    public String generateBaseAddress(NetworkIdentifierEnum networkIdentifierEnum,HdPublicKey paymentCredential,HdPublicKey stakingCredential){
        log.info("[generateAddress] Deriving cardano address from valid public key and staking key");
        Address baseAddress = AddressProvider.getBaseAddress(paymentCredential,stakingCredential,new Network(networkIdentifierEnum.getValue(),networkIdentifierEnum.getProtocolMagic()));
       log.info("generateAddress] base address is ${bech32address}");
        return baseAddress.toBech32();
    }

    public String generateEnterpriseAddress(HdPublicKey paymentCredential,NetworkIdentifierEnum networkIdentifierEnum){
        log.info("[generateAddress] Deriving cardano address from valid public key and staking key");
        Address entAddress = AddressProvider.getEntAddress(paymentCredential,new Network(networkIdentifierEnum.getValue(),networkIdentifierEnum.getProtocolMagic()));
        log.info("generateAddress] base address is ${bech32address}");
        return entAddress.toBech32();
    }

    public String getHashOfSignedTransaction(String signedTransaction){
//        try {
//            log.info("[getHashOfSignedTransaction] About to hash signed transaction {}",signedTransaction);
//        byte[] signedTransactionBytes = signedTransaction.getBytes();
//            log.info("[getHashOfSignedTransaction] About to parse transaction from signed transaction bytes");
//        var parsed = CardanoWasm.Transaction.from_bytes(signedTransactionBytes);
//            log.info("[getHashOfSignedTransaction] Returning transaction hash");
//        const body = parsed.body();
//        const hashBuffer = parsed && body && Buffer.from(CardanoWasm.hash_transaction(body).to_bytes());
//            return hexFormatter(hashBuffer);
//        } catch (Exception error) {
//            log.error("{} [getHashOfSignedTransaction] There was an error parsing signed transaction",error);
//            throw new IllegalArgumentException("parseSignedTransactionError");
//        }
//    }
return null;
}
}
