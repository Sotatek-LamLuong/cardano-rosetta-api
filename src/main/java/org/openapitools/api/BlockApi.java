/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.BlockRequest;
import org.openapitools.model.BlockResponse;
import org.openapitools.model.BlockTransactionRequest;
import org.openapitools.model.BlockTransactionResponse;
import org.openapitools.model.Error;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
@Validated
@Tag(name = "block", description = "the block API")
public interface BlockApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /block : Get a Block
     * Get a block by its Block Identifier. If transactions are returned in the same call to the node as fetching the block, the response should include these transactions in the Block object. If not, an array of Transaction Identifiers should be returned so /block/transaction fetches can be done to get all transaction information. When requesting a block by the hash component of the BlockIdentifier, this request MUST be idempotent: repeated invocations for the same hash-identified block must return the exact same block contents. No such restriction is imposed when requesting a block by height, given that a chain reorg event might cause the specific block at height &#x60;n&#x60; to be set to a different one.
     *
     * @param blockRequest  (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 500)
     */
    @Operation(
        operationId = "block",
        summary = "Get a Block",
        description = "Get a block by its Block Identifier. If transactions are returned in the same call to the node as fetching the block, the response should include these transactions in the Block object. If not, an array of Transaction Identifiers should be returned so /block/transaction fetches can be done to get all transaction information. When requesting a block by the hash component of the BlockIdentifier, this request MUST be idempotent: repeated invocations for the same hash-identified block must return the exact same block contents. No such restriction is imposed when requesting a block by height, given that a chain reorg event might cause the specific block at height `n` to be set to a different one.",
        tags = { "Block" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BlockResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/block",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BlockResponse> block(
        @Parameter(name = "BlockRequest", description = "", required = true) @Valid @RequestBody BlockRequest blockRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"block\" : { \"metadata\" : { \"transactions_root\" : \"0x1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347\", \"difficulty\" : \"123891724987128947\" }, \"parent_block_identifier\" : { \"index\" : 1123941, \"hash\" : \"0x1f2cc6c5027d2f201a5453ad1119574d2aed23a392654742ac3c78783c071f85\" }, \"transactions\" : [ { \"metadata\" : { \"size\" : 12378, \"lockTime\" : 1582272577 }, \"operations\" : [ { \"amount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"metadata\" : { \"depositAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"tokenBundle\" : [ { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] }, { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] } ], \"poolRegistrationParams\" : { \"vrfKeyHash\" : \"vrfKeyHash\", \"margin\" : { \"numerator\" : \"numerator\", \"denominator\" : \"denominator\" }, \"margin_percentage\" : \"margin_percentage\", \"cost\" : \"cost\", \"rewardAddress\" : \"rewardAddress\", \"relays\" : [ { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" }, { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" } ], \"pledge\" : \"pledge\", \"poolMetadata\" : { \"url\" : \"url\", \"hash\" : \"hash\" }, \"poolOwners\" : [ \"poolOwners\", \"poolOwners\" ] }, \"staking_credential\" : { \"hex_bytes\" : \"hex_bytes\" }, \"withdrawalAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"poolRegistrationCert\" : \"poolRegistrationCert\", \"voteRegistrationMetadata\" : { \"votingKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"rewardAddress\" : \"rewardAddress\", \"stakeKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"votingNonce\" : 6.027456183070403, \"votingSignature\" : \"votingSignature\" }, \"epoch\" : 0.8008281904610115, \"pool_key_hash\" : \"pool_key_hash\", \"refundAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } }, \"related_operations\" : [ { \"index\" : 1 }, { \"index\" : 2 } ], \"type\" : \"Transfer\", \"coin_change\" : { \"coin_identifier\" : { \"identifier\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f:1\" } }, \"account\" : { \"metadata\" : { \"chain_code\" : \"chain_code\" }, \"address\" : \"0x3a065000ab4183c6bf581dc1e55a605455fc6d61\", \"sub_account\" : { \"metadata\" : \"{}\", \"address\" : \"0x6b175474e89094c44da98b954eedeac495271d0f\" } }, \"operation_identifier\" : { \"index\" : 5, \"network_index\" : 0 }, \"status\" : \"Reverted\" }, { \"amount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"metadata\" : { \"depositAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"tokenBundle\" : [ { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] }, { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] } ], \"poolRegistrationParams\" : { \"vrfKeyHash\" : \"vrfKeyHash\", \"margin\" : { \"numerator\" : \"numerator\", \"denominator\" : \"denominator\" }, \"margin_percentage\" : \"margin_percentage\", \"cost\" : \"cost\", \"rewardAddress\" : \"rewardAddress\", \"relays\" : [ { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" }, { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" } ], \"pledge\" : \"pledge\", \"poolMetadata\" : { \"url\" : \"url\", \"hash\" : \"hash\" }, \"poolOwners\" : [ \"poolOwners\", \"poolOwners\" ] }, \"staking_credential\" : { \"hex_bytes\" : \"hex_bytes\" }, \"withdrawalAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"poolRegistrationCert\" : \"poolRegistrationCert\", \"voteRegistrationMetadata\" : { \"votingKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"rewardAddress\" : \"rewardAddress\", \"stakeKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"votingNonce\" : 6.027456183070403, \"votingSignature\" : \"votingSignature\" }, \"epoch\" : 0.8008281904610115, \"pool_key_hash\" : \"pool_key_hash\", \"refundAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } }, \"related_operations\" : [ { \"index\" : 1 }, { \"index\" : 2 } ], \"type\" : \"Transfer\", \"coin_change\" : { \"coin_identifier\" : { \"identifier\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f:1\" } }, \"account\" : { \"metadata\" : { \"chain_code\" : \"chain_code\" }, \"address\" : \"0x3a065000ab4183c6bf581dc1e55a605455fc6d61\", \"sub_account\" : { \"metadata\" : \"{}\", \"address\" : \"0x6b175474e89094c44da98b954eedeac495271d0f\" } }, \"operation_identifier\" : { \"index\" : 5, \"network_index\" : 0 }, \"status\" : \"Reverted\" } ], \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"related_transactions\" : [ { \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"network_identifier\" : { \"blockchain\" : \"bitcoin\", \"sub_network_identifier\" : { \"metadata\" : { \"producer\" : \"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\" }, \"network\" : \"shard 1\" }, \"network\" : \"mainnet\" } }, { \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"network_identifier\" : { \"blockchain\" : \"bitcoin\", \"sub_network_identifier\" : { \"metadata\" : { \"producer\" : \"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\" }, \"network\" : \"shard 1\" }, \"network\" : \"mainnet\" } } ] }, { \"metadata\" : { \"size\" : 12378, \"lockTime\" : 1582272577 }, \"operations\" : [ { \"amount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"metadata\" : { \"depositAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"tokenBundle\" : [ { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] }, { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] } ], \"poolRegistrationParams\" : { \"vrfKeyHash\" : \"vrfKeyHash\", \"margin\" : { \"numerator\" : \"numerator\", \"denominator\" : \"denominator\" }, \"margin_percentage\" : \"margin_percentage\", \"cost\" : \"cost\", \"rewardAddress\" : \"rewardAddress\", \"relays\" : [ { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" }, { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" } ], \"pledge\" : \"pledge\", \"poolMetadata\" : { \"url\" : \"url\", \"hash\" : \"hash\" }, \"poolOwners\" : [ \"poolOwners\", \"poolOwners\" ] }, \"staking_credential\" : { \"hex_bytes\" : \"hex_bytes\" }, \"withdrawalAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"poolRegistrationCert\" : \"poolRegistrationCert\", \"voteRegistrationMetadata\" : { \"votingKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"rewardAddress\" : \"rewardAddress\", \"stakeKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"votingNonce\" : 6.027456183070403, \"votingSignature\" : \"votingSignature\" }, \"epoch\" : 0.8008281904610115, \"pool_key_hash\" : \"pool_key_hash\", \"refundAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } }, \"related_operations\" : [ { \"index\" : 1 }, { \"index\" : 2 } ], \"type\" : \"Transfer\", \"coin_change\" : { \"coin_identifier\" : { \"identifier\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f:1\" } }, \"account\" : { \"metadata\" : { \"chain_code\" : \"chain_code\" }, \"address\" : \"0x3a065000ab4183c6bf581dc1e55a605455fc6d61\", \"sub_account\" : { \"metadata\" : \"{}\", \"address\" : \"0x6b175474e89094c44da98b954eedeac495271d0f\" } }, \"operation_identifier\" : { \"index\" : 5, \"network_index\" : 0 }, \"status\" : \"Reverted\" }, { \"amount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"metadata\" : { \"depositAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"tokenBundle\" : [ { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] }, { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] } ], \"poolRegistrationParams\" : { \"vrfKeyHash\" : \"vrfKeyHash\", \"margin\" : { \"numerator\" : \"numerator\", \"denominator\" : \"denominator\" }, \"margin_percentage\" : \"margin_percentage\", \"cost\" : \"cost\", \"rewardAddress\" : \"rewardAddress\", \"relays\" : [ { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" }, { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" } ], \"pledge\" : \"pledge\", \"poolMetadata\" : { \"url\" : \"url\", \"hash\" : \"hash\" }, \"poolOwners\" : [ \"poolOwners\", \"poolOwners\" ] }, \"staking_credential\" : { \"hex_bytes\" : \"hex_bytes\" }, \"withdrawalAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"poolRegistrationCert\" : \"poolRegistrationCert\", \"voteRegistrationMetadata\" : { \"votingKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"rewardAddress\" : \"rewardAddress\", \"stakeKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"votingNonce\" : 6.027456183070403, \"votingSignature\" : \"votingSignature\" }, \"epoch\" : 0.8008281904610115, \"pool_key_hash\" : \"pool_key_hash\", \"refundAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } }, \"related_operations\" : [ { \"index\" : 1 }, { \"index\" : 2 } ], \"type\" : \"Transfer\", \"coin_change\" : { \"coin_identifier\" : { \"identifier\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f:1\" } }, \"account\" : { \"metadata\" : { \"chain_code\" : \"chain_code\" }, \"address\" : \"0x3a065000ab4183c6bf581dc1e55a605455fc6d61\", \"sub_account\" : { \"metadata\" : \"{}\", \"address\" : \"0x6b175474e89094c44da98b954eedeac495271d0f\" } }, \"operation_identifier\" : { \"index\" : 5, \"network_index\" : 0 }, \"status\" : \"Reverted\" } ], \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"related_transactions\" : [ { \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"network_identifier\" : { \"blockchain\" : \"bitcoin\", \"sub_network_identifier\" : { \"metadata\" : { \"producer\" : \"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\" }, \"network\" : \"shard 1\" }, \"network\" : \"mainnet\" } }, { \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"network_identifier\" : { \"blockchain\" : \"bitcoin\", \"sub_network_identifier\" : { \"metadata\" : { \"producer\" : \"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\" }, \"network\" : \"shard 1\" }, \"network\" : \"mainnet\" } } ] } ], \"block_identifier\" : { \"index\" : 1123941, \"hash\" : \"0x1f2cc6c5027d2f201a5453ad1119574d2aed23a392654742ac3c78783c071f85\" }, \"timestamp\" : 1582833600000 }, \"other_transactions\" : [ { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /block/transaction : Get a Block Transaction
     * Get a transaction in a block by its Transaction Identifier. This endpoint should only be used when querying a node for a block does not return all transactions contained within it. All transactions returned by this endpoint must be appended to any transactions returned by the /block method by consumers of this data. Fetching a transaction by hash is considered an Explorer Method (which is classified under the Future Work section). This method can be used to let consumers to paginate results when the  block trasactions count is too big to be returned in a single BlockResponse. Calling this endpoint requires reference to a BlockIdentifier because transaction parsing can change depending on which block contains the transaction. For example, in Bitcoin it is necessary to know which block contains a transaction to determine the destination of fee payments. Without specifying a block identifier, the node would have to infer which block to use (which could change during a re-org). Implementations that require fetching previous transactions to populate the response (ex: Previous UTXOs in Bitcoin) may find it useful to run a cache within the Rosetta server in the /data directory (on a path that does not conflict with the node).
     *
     * @param blockTransactionRequest  (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 500)
     */
    @Operation(
        operationId = "blockTransaction",
        summary = "Get a Block Transaction",
        description = "Get a transaction in a block by its Transaction Identifier. This endpoint should only be used when querying a node for a block does not return all transactions contained within it. All transactions returned by this endpoint must be appended to any transactions returned by the /block method by consumers of this data. Fetching a transaction by hash is considered an Explorer Method (which is classified under the Future Work section). This method can be used to let consumers to paginate results when the  block trasactions count is too big to be returned in a single BlockResponse. Calling this endpoint requires reference to a BlockIdentifier because transaction parsing can change depending on which block contains the transaction. For example, in Bitcoin it is necessary to know which block contains a transaction to determine the destination of fee payments. Without specifying a block identifier, the node would have to infer which block to use (which could change during a re-org). Implementations that require fetching previous transactions to populate the response (ex: Previous UTXOs in Bitcoin) may find it useful to run a cache within the Rosetta server in the /data directory (on a path that does not conflict with the node).",
        tags = { "Block" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BlockTransactionResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/block/transaction",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BlockTransactionResponse> blockTransaction(
        @Parameter(name = "BlockTransactionRequest", description = "", required = true) @Valid @RequestBody BlockTransactionRequest blockTransactionRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"transaction\" : { \"metadata\" : { \"size\" : 12378, \"lockTime\" : 1582272577 }, \"operations\" : [ { \"amount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"metadata\" : { \"depositAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"tokenBundle\" : [ { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] }, { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] } ], \"poolRegistrationParams\" : { \"vrfKeyHash\" : \"vrfKeyHash\", \"margin\" : { \"numerator\" : \"numerator\", \"denominator\" : \"denominator\" }, \"margin_percentage\" : \"margin_percentage\", \"cost\" : \"cost\", \"rewardAddress\" : \"rewardAddress\", \"relays\" : [ { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" }, { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" } ], \"pledge\" : \"pledge\", \"poolMetadata\" : { \"url\" : \"url\", \"hash\" : \"hash\" }, \"poolOwners\" : [ \"poolOwners\", \"poolOwners\" ] }, \"staking_credential\" : { \"hex_bytes\" : \"hex_bytes\" }, \"withdrawalAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"poolRegistrationCert\" : \"poolRegistrationCert\", \"voteRegistrationMetadata\" : { \"votingKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"rewardAddress\" : \"rewardAddress\", \"stakeKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"votingNonce\" : 6.027456183070403, \"votingSignature\" : \"votingSignature\" }, \"epoch\" : 0.8008281904610115, \"pool_key_hash\" : \"pool_key_hash\", \"refundAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } }, \"related_operations\" : [ { \"index\" : 1 }, { \"index\" : 2 } ], \"type\" : \"Transfer\", \"coin_change\" : { \"coin_identifier\" : { \"identifier\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f:1\" } }, \"account\" : { \"metadata\" : { \"chain_code\" : \"chain_code\" }, \"address\" : \"0x3a065000ab4183c6bf581dc1e55a605455fc6d61\", \"sub_account\" : { \"metadata\" : \"{}\", \"address\" : \"0x6b175474e89094c44da98b954eedeac495271d0f\" } }, \"operation_identifier\" : { \"index\" : 5, \"network_index\" : 0 }, \"status\" : \"Reverted\" }, { \"amount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"metadata\" : { \"depositAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"tokenBundle\" : [ { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] }, { \"policyId\" : \"policyId\", \"tokens\" : [ { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } ] } ], \"poolRegistrationParams\" : { \"vrfKeyHash\" : \"vrfKeyHash\", \"margin\" : { \"numerator\" : \"numerator\", \"denominator\" : \"denominator\" }, \"margin_percentage\" : \"margin_percentage\", \"cost\" : \"cost\", \"rewardAddress\" : \"rewardAddress\", \"relays\" : [ { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" }, { \"ipv4\" : \"127.0.0.1\", \"port\" : \"port\", \"ipv6\" : \"2345:0425:2ca1:0000:0000:0567:5673:23b5\", \"dnsName\" : \"dnsName\", \"type\" : \"type\" } ], \"pledge\" : \"pledge\", \"poolMetadata\" : { \"url\" : \"url\", \"hash\" : \"hash\" }, \"poolOwners\" : [ \"poolOwners\", \"poolOwners\" ] }, \"staking_credential\" : { \"hex_bytes\" : \"hex_bytes\" }, \"withdrawalAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" }, \"poolRegistrationCert\" : \"poolRegistrationCert\", \"voteRegistrationMetadata\" : { \"votingKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"rewardAddress\" : \"rewardAddress\", \"stakeKey\" : { \"hex_bytes\" : \"hex_bytes\" }, \"votingNonce\" : 6.027456183070403, \"votingSignature\" : \"votingSignature\" }, \"epoch\" : 0.8008281904610115, \"pool_key_hash\" : \"pool_key_hash\", \"refundAmount\" : { \"metadata\" : \"{}\", \"currency\" : { \"symbol\" : \"BTC\", \"metadata\" : \"\", \"decimals\" : 8 }, \"value\" : \"1238089899992\" } }, \"related_operations\" : [ { \"index\" : 1 }, { \"index\" : 2 } ], \"type\" : \"Transfer\", \"coin_change\" : { \"coin_identifier\" : { \"identifier\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f:1\" } }, \"account\" : { \"metadata\" : { \"chain_code\" : \"chain_code\" }, \"address\" : \"0x3a065000ab4183c6bf581dc1e55a605455fc6d61\", \"sub_account\" : { \"metadata\" : \"{}\", \"address\" : \"0x6b175474e89094c44da98b954eedeac495271d0f\" } }, \"operation_identifier\" : { \"index\" : 5, \"network_index\" : 0 }, \"status\" : \"Reverted\" } ], \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"related_transactions\" : [ { \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"network_identifier\" : { \"blockchain\" : \"bitcoin\", \"sub_network_identifier\" : { \"metadata\" : { \"producer\" : \"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\" }, \"network\" : \"shard 1\" }, \"network\" : \"mainnet\" } }, { \"transaction_identifier\" : { \"hash\" : \"0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f\" }, \"network_identifier\" : { \"blockchain\" : \"bitcoin\", \"sub_network_identifier\" : { \"metadata\" : { \"producer\" : \"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\" }, \"network\" : \"shard 1\" }, \"network\" : \"mainnet\" } } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
