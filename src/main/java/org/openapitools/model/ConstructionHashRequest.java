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
 * ConstructionHashRequest is the input to the &#x60;/construction/hash&#x60; endpoint.
 */

@Schema(name = "ConstructionHashRequest", description = "ConstructionHashRequest is the input to the `/construction/hash` endpoint.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class ConstructionHashRequest {

  @JsonProperty("network_identifier")
  private NetworkIdentifier networkIdentifier;

  @JsonProperty("signed_transaction")
  private String signedTransaction;

  public ConstructionHashRequest networkIdentifier(NetworkIdentifier networkIdentifier) {
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

  public ConstructionHashRequest signedTransaction(String signedTransaction) {
    this.signedTransaction = signedTransaction;
    return this;
  }

  /**
   * Get signedTransaction
   * @return signedTransaction
  */
  @NotNull 
  @Schema(name = "signed_transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSignedTransaction() {
    return signedTransaction;
  }

  public void setSignedTransaction(String signedTransaction) {
    this.signedTransaction = signedTransaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionHashRequest constructionHashRequest = (ConstructionHashRequest) o;
    return Objects.equals(this.networkIdentifier, constructionHashRequest.networkIdentifier) &&
        Objects.equals(this.signedTransaction, constructionHashRequest.signedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, signedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionHashRequest {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    signedTransaction: ").append(toIndentedString(signedTransaction)).append("\n");
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

