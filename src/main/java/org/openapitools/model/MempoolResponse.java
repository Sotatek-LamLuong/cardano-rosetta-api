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
 * A MempoolResponse contains all transaction identifiers in the mempool for a particular network_identifier.
 */

@Schema(name = "MempoolResponse", description = "A MempoolResponse contains all transaction identifiers in the mempool for a particular network_identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class MempoolResponse {

  @JsonProperty("transaction_identifiers")
  @Valid
  private List<TransactionIdentifier> transactionIdentifiers = new ArrayList<>();

  public MempoolResponse transactionIdentifiers(List<TransactionIdentifier> transactionIdentifiers) {
    this.transactionIdentifiers = transactionIdentifiers;
    return this;
  }

  public MempoolResponse addTransactionIdentifiersItem(TransactionIdentifier transactionIdentifiersItem) {
    this.transactionIdentifiers.add(transactionIdentifiersItem);
    return this;
  }

  /**
   * Get transactionIdentifiers
   * @return transactionIdentifiers
  */
  @NotNull @Valid 
  @Schema(name = "transaction_identifiers", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<TransactionIdentifier> getTransactionIdentifiers() {
    return transactionIdentifiers;
  }

  public void setTransactionIdentifiers(List<TransactionIdentifier> transactionIdentifiers) {
    this.transactionIdentifiers = transactionIdentifiers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MempoolResponse mempoolResponse = (MempoolResponse) o;
    return Objects.equals(this.transactionIdentifiers, mempoolResponse.transactionIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MempoolResponse {\n");
    sb.append("    transactionIdentifiers: ").append(toIndentedString(transactionIdentifiers)).append("\n");
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

