package org.openapitools.api;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.bloxbean.cardano.client.metadata.Metadata;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.openapitools.model.ConstructionDeriveRequest;
import org.openapitools.model.ConstructionDeriveRequestMetadata;
import org.openapitools.model.CurveType;
import org.openapitools.model.NetworkIdentifier;
import org.openapitools.model.PublicKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class ConstructionApiControllerTest {

  @Autowired
  private MockMvc mvc;

  private final String CONSTRUCTION_DERIVE_ENDPOINT = "/construction/derive";

  private ConstructionDeriveRequestMetadata generateMetadata(String addressType, String stakingKey, CurveType curveType) {
    ConstructionDeriveRequestMetadata metadata = new ConstructionDeriveRequestMetadata();
    if(addressType != null) {
      metadata.setAddressType(addressType);
    }

    if(stakingKey != null) {
      PublicKey publicKey = new PublicKey();
      publicKey.setHexBytes(stakingKey);
      publicKey.setCurveType(curveType != null ? curveType : CurveType.EDWARDS25519);
      metadata.setStakingCredential(publicKey);
    }
    return metadata;
  }

  private ConstructionDeriveRequest generatePayload(String blockchain, String network, String key, CurveType curveType, String type, String stakingKey) {
    ConstructionDeriveRequest constructionDeriveRequest = new ConstructionDeriveRequest();

    NetworkIdentifier networkIdentifier = new NetworkIdentifier();
    networkIdentifier.setBlockchain(blockchain);
    networkIdentifier.setNetwork(network);

    PublicKey publicKey = new PublicKey();
    publicKey.setHexBytes(key != null ? key : "1B400D60AAF34EAF6DCBAB9BBA46001A23497886CF11066F7846933D30E5AD3F");

    publicKey.setCurveType(curveType != null ? curveType : CurveType.EDWARDS25519);
    ConstructionDeriveRequestMetadata metadata = generateMetadata(type, stakingKey, curveType);

    constructionDeriveRequest.setMetadata(metadata);
    constructionDeriveRequest.setPublicKey(publicKey);
    constructionDeriveRequest.setNetworkIdentifier(networkIdentifier);
    return constructionDeriveRequest;
  }

  @Test
  void testConstructionDeriveOK() throws Exception {

    ConstructionDeriveRequest request = generatePayload("cardano", "mainnet", null, null, null, null);
    // Populate request object
    ObjectMapper objectMapper = new ObjectMapper();

    mvc.perform(post("http://localhost:8080/api/construction/derive")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(request)))
        .andExpect(status().isOk());

  }
}