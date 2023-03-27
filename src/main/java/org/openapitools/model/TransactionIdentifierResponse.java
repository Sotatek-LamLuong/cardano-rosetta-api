package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TransactionIdentifier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TransactionIdentifierResponse contains the transaction_identifier of a transaction that was submitted to either &#x60;/construction/hash&#x60; or &#x60;/construction/submit&#x60;.
 */

@Schema(name = "TransactionIdentifierResponse", description = "TransactionIdentifierResponse contains the transaction_identifier of a transaction that was submitted to either `/construction/hash` or `/construction/submit`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class TransactionIdentifierResponse {

  @JsonProperty("transaction_identifier")
  private TransactionIdentifier transactionIdentifier;

  @JsonProperty("metadata")
  private Object metadata;

  public TransactionIdentifierResponse transactionIdentifier(TransactionIdentifier transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
    return this;
  }

  /**
   * Get transactionIdentifier
   * @return transactionIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "transaction_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public TransactionIdentifier getTransactionIdentifier() {
    return transactionIdentifier;
  }

  public void setTransactionIdentifier(TransactionIdentifier transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }

  public TransactionIdentifierResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TransactionIdentifierResponse transactionIdentifierResponse = (TransactionIdentifierResponse) o;
    return Objects.equals(this.transactionIdentifier, transactionIdentifierResponse.transactionIdentifier) &&
        Objects.equals(this.metadata, transactionIdentifierResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdentifier, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIdentifierResponse {\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
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

