package org.openapitools.api;

import org.openapitools.model.ConstructionDeriveRequest;
import org.openapitools.model.ConstructionDeriveResponse;


import org.openapitools.model.ConstructionHashRequest;
import org.openapitools.model.TransactionIdentifierResponse;
import org.openapitools.service.constructionApiService.ConstructionApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
@Controller
@RequestMapping("${openapi.rosetta.base-path:}")
public class ConstructionApiController implements ConstructionApi {

    private final NativeWebRequest request;

    private final ConstructionApiService constructionApiService;


    @Autowired
    public ConstructionApiController(NativeWebRequest request,ConstructionApiService constructionApiService1) {
        this.request = request;
        this.constructionApiService = constructionApiService1;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/construction/derive",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<ConstructionDeriveResponse> constructionDerive(@RequestBody ConstructionDeriveRequest constructionDeriveRequest) throws IllegalAccessException {
        return ResponseEntity.ok(constructionApiService.constructionDeriveService(constructionDeriveRequest));
    }

    @Override
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/construction/hash",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<TransactionIdentifierResponse> constructionHash(@RequestBody ConstructionHashRequest constructionHashRequest){
        return ConstructionApi.super.constructionHash(constructionHashRequest);
    }
}
