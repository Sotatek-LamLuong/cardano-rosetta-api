package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * An AccountBalanceResponse is returned on the /account/balance endpoint. If an account has a balance for each AccountIdentifier describing it (ex: an ERC-20 token balance on a few smart contracts), an account balance request must be made with each AccountIdentifier. The &#x60;coins&#x60; field was removed and replaced by by &#x60;/account/coins&#x60; in &#x60;v1.4.7&#x60;.
 */

@Schema(name = "AccountBalanceResponse", description = "An AccountBalanceResponse is returned on the /account/balance endpoint. If an account has a balance for each AccountIdentifier describing it (ex: an ERC-20 token balance on a few smart contracts), an account balance request must be made with each AccountIdentifier. The `coins` field was removed and replaced by by `/account/coins` in `v1.4.7`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class AccountBalanceResponse {

  @JsonProperty("block_identifier")
  private BlockIdentifier blockIdentifier;

  @JsonProperty("balances")
  @Valid
  private List<Amount> balances = new ArrayList<>();

  @JsonProperty("metadata")
  private Object metadata;

  public AccountBalanceResponse blockIdentifier(BlockIdentifier blockIdentifier) {
    this.blockIdentifier = blockIdentifier;
    return this;
  }

  /**
   * Get blockIdentifier
   * @return blockIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "block_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public BlockIdentifier getBlockIdentifier() {
    return blockIdentifier;
  }

  public void setBlockIdentifier(BlockIdentifier blockIdentifier) {
    this.blockIdentifier = blockIdentifier;
  }

  public AccountBalanceResponse balances(List<Amount> balances) {
    this.balances = balances;
    return this;
  }

  public AccountBalanceResponse addBalancesItem(Amount balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * A single account may have a balance in multiple currencies.
   * @return balances
  */
  @NotNull @Valid 
  @Schema(name = "balances", description = "A single account may have a balance in multiple currencies.", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<Amount> getBalances() {
    return balances;
  }

  public void setBalances(List<Amount> balances) {
    this.balances = balances;
  }

  public AccountBalanceResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Account-based blockchains that utilize a nonce or sequence number should include that number in the metadata. This number could be unique to the identifier or global across the account address.
   * @return metadata
  */
  
  @Schema(name = "metadata", example = "{\"sequence_number\":23}", description = "Account-based blockchains that utilize a nonce or sequence number should include that number in the metadata. This number could be unique to the identifier or global across the account address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalanceResponse accountBalanceResponse = (AccountBalanceResponse) o;
    return Objects.equals(this.blockIdentifier, accountBalanceResponse.blockIdentifier) &&
        Objects.equals(this.balances, accountBalanceResponse.balances) &&
        Objects.equals(this.metadata, accountBalanceResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIdentifier, balances, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalanceResponse {\n");
    sb.append("    blockIdentifier: ").append(toIndentedString(blockIdentifier)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

