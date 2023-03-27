package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.NetworkIdentifier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConstructionParseRequest is the input to the &#x60;/construction/parse&#x60; endpoint. It allows the caller to parse either an unsigned or signed transaction.
 */

@Schema(name = "ConstructionParseRequest", description = "ConstructionParseRequest is the input to the `/construction/parse` endpoint. It allows the caller to parse either an unsigned or signed transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class ConstructionParseRequest {

  @JsonProperty("network_identifier")
  private NetworkIdentifier networkIdentifier;

  @JsonProperty("signed")
  private Boolean signed;

  @JsonProperty("transaction")
  private String transaction;

  public ConstructionParseRequest networkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
    return this;
  }

  /**
   * Get networkIdentifier
   * @return networkIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "network_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public NetworkIdentifier getNetworkIdentifier() {
    return networkIdentifier;
  }

  public void setNetworkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
  }

  public ConstructionParseRequest signed(Boolean signed) {
    this.signed = signed;
    return this;
  }

  /**
   * Signed is a boolean indicating whether the transaction is signed.
   * @return signed
  */
  @NotNull 
  @Schema(name = "signed", description = "Signed is a boolean indicating whether the transaction is signed.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getSigned() {
    return signed;
  }

  public void setSigned(Boolean signed) {
    this.signed = signed;
  }

  public ConstructionParseRequest transaction(String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * This must be either the unsigned transaction blob returned by `/construction/payloads` or the signed transaction blob returned by `/construction/combine`.
   * @return transaction
  */
  @NotNull 
  @Schema(name = "transaction", description = "This must be either the unsigned transaction blob returned by `/construction/payloads` or the signed transaction blob returned by `/construction/combine`.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getTransaction() {
    return transaction;
  }

  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionParseRequest constructionParseRequest = (ConstructionParseRequest) o;
    return Objects.equals(this.networkIdentifier, constructionParseRequest.networkIdentifier) &&
        Objects.equals(this.signed, constructionParseRequest.signed) &&
        Objects.equals(this.transaction, constructionParseRequest.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, signed, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionParseRequest {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

