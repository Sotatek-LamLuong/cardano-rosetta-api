package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * A MempoolTransactionResponse contains an estimate of a mempool transaction. It may not be possible to know the full impact of a transaction in the mempool (ex: fee paid).
 */

@Schema(name = "MempoolTransactionResponse", description = "A MempoolTransactionResponse contains an estimate of a mempool transaction. It may not be possible to know the full impact of a transaction in the mempool (ex: fee paid).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class MempoolTransactionResponse {

  @JsonProperty("transaction")
  private Transaction transaction;

  @JsonProperty("metadata")
  private Object metadata;

  public MempoolTransactionResponse transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  */
  @NotNull @Valid 
  @Schema(name = "transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public MempoolTransactionResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", example = "{\"descendant_fees\":123923,\"ancestor_count\":2}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MempoolTransactionResponse mempoolTransactionResponse = (MempoolTransactionResponse) o;
    return Objects.equals(this.transaction, mempoolTransactionResponse.transaction) &&
        Objects.equals(this.metadata, mempoolTransactionResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MempoolTransactionResponse {\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

