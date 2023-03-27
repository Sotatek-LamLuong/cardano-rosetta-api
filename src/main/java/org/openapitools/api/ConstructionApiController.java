package org.openapitools.api;

import org.openapitools.model.ConstructionCombineRequest;
import org.openapitools.model.ConstructionCombineResponse;
import org.openapitools.model.ConstructionDeriveRequest;
import org.openapitools.model.ConstructionDeriveResponse;
import org.openapitools.model.ConstructionHashRequest;
import org.openapitools.model.ConstructionMetadataRequest;
import org.openapitools.model.ConstructionMetadataResponse;
import org.openapitools.model.ConstructionParseRequest;
import org.openapitools.model.ConstructionParseResponse;
import org.openapitools.model.ConstructionPayloadsRequest;
import org.openapitools.model.ConstructionPayloadsResponse;
import org.openapitools.model.ConstructionPreprocessRequest;
import org.openapitools.model.ConstructionPreprocessResponse;
import org.openapitools.model.ConstructionSubmitRequest;
import org.openapitools.model.Error;
import org.openapitools.model.TransactionIdentifierResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
@Controller
@RequestMapping("${openapi.rosetta.base-path:}")
public class ConstructionApiController implements ConstructionApi {

    private final NativeWebRequest request;

    @Autowired
    public ConstructionApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
