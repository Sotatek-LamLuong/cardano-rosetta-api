package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Operation;
import org.openapitools.model.RelatedTransaction;
import org.openapitools.model.TransactionIdentifier;
import org.openapitools.model.TransactionMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Transactions contain an array of Operations that are attributable to the same TransactionIdentifier.
 */

@Schema(name = "Transaction", description = "Transactions contain an array of Operations that are attributable to the same TransactionIdentifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Transaction {

  @JsonProperty("transaction_identifier")
  private TransactionIdentifier transactionIdentifier;

  @JsonProperty("operations")
  @Valid
  private List<Operation> operations = new ArrayList<>();

  @JsonProperty("related_transactions")
  @Valid
  private List<RelatedTransaction> relatedTransactions = null;

  @JsonProperty("metadata")
  private TransactionMetadata metadata;

  public Transaction transactionIdentifier(TransactionIdentifier transactionIdentifier) {
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

  public Transaction operations(List<Operation> operations) {
    this.operations = operations;
    return this;
  }

  public Transaction addOperationsItem(Operation operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  */
  @NotNull @Valid 
  @Schema(name = "operations", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<Operation> getOperations() {
    return operations;
  }

  public void setOperations(List<Operation> operations) {
    this.operations = operations;
  }

  public Transaction relatedTransactions(List<RelatedTransaction> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
    return this;
  }

  public Transaction addRelatedTransactionsItem(RelatedTransaction relatedTransactionsItem) {
    if (this.relatedTransactions == null) {
      this.relatedTransactions = new ArrayList<>();
    }
    this.relatedTransactions.add(relatedTransactionsItem);
    return this;
  }

  /**
   * Get relatedTransactions
   * @return relatedTransactions
  */
  @Valid 
  @Schema(name = "related_transactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<RelatedTransaction> getRelatedTransactions() {
    return relatedTransactions;
  }

  public void setRelatedTransactions(List<RelatedTransaction> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
  }

  public Transaction metadata(TransactionMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public TransactionMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TransactionMetadata metadata) {
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionIdentifier, transaction.transactionIdentifier) &&
        Objects.equals(this.operations, transaction.operations) &&
        Objects.equals(this.relatedTransactions, transaction.relatedTransactions) &&
        Objects.equals(this.metadata, transaction.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionIdentifier, operations, relatedTransactions, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    relatedTransactions: ").append(toIndentedString(relatedTransactions)).append("\n");
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

