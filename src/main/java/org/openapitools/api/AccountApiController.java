package org.openapitools.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.openapitools.model.AccountBalanceRequest;
import org.openapitools.model.AccountBalanceResponse;
import org.openapitools.model.Error;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
@Controller
@RequestMapping("${openapi.rosetta.base-path:}")
public class AccountApiController implements AccountApi {

    private final NativeWebRequest request;

    @Autowired
    public AccountApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Operation(
            operationId = "accountBalance",
            summary = "Get an Account's Balance",
            description = "Get an array of all AccountBalances for an AccountIdentifier and the BlockIdentifier at which the balance lookup was performed. The BlockIdentifier must always be returned because some consumers of account balance data need to know specifically at which block the balance was calculated to compare balances they compute from operations with the balance returned by the node. It is important to note that making a balance request for an account without populating the SubAccountIdentifier should not result in the balance of all possible SubAccountIdentifiers being returned. Rather, it should result in the balance pertaining to no SubAccountIdentifiers being returned (sometimes called the liquid balance). To get all balances associated with an account, it may be necessary to perform multiple balance requests with unique AccountIdentifiers. It is also possible to perform a historical balance lookup (if the server supports it) by passing in an optional BlockIdentifier.",
            tags = { "Account" },
            responses = {
                    @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = AccountBalanceResponse.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "unexpected error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/account/balance",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<AccountBalanceResponse> accountBalance(
            @Parameter(name = "AccountBalanceRequest", description = "", required = true)
            @Valid @RequestBody AccountBalanceRequest accountBalanceRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {

            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
