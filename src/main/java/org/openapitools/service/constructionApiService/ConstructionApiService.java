package org.openapitools.service.constructionApiService;

import co.nstant.in.cbor.CborException;
import org.openapitools.addedenum.NetworkIdentifierEnum;
import org.openapitools.model.ConstructionDeriveRequest;
import org.openapitools.model.ConstructionDeriveResponse;
import org.openapitools.model.ConstructionHashRequest;
import org.openapitools.model.NetworkIdentifier;

import java.io.IOException;

public interface ConstructionApiService {
    //    <T,R> AccountIdentifier withNetworkValidation(NetworkIdentifier networkIdentifier,T parameters, );
    ConstructionDeriveResponse constructionDeriveService(ConstructionDeriveRequest constructionDeriveRequest) throws IllegalAccessException;

    ConstructionDeriveResponse constructionHashService(ConstructionHashRequest constructionHashRequest) throws IllegalAccessException, IOException, CborException;

    NetworkIdentifierEnum getNetworkIdentifierByRequestParameters(NetworkIdentifier networkRequestParameters);

    boolean isKeyValid(String publicKeyBytes,String curveType);

    boolean isAddressTypeValid(String type);
}
