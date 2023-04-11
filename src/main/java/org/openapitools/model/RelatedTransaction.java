package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * The related_transaction allows implementations to link together multiple transactions. An unpopulated network identifier indicates that the related transaction is on the same network.
 */

@Schema(name = "RelatedTransaction", description = "The related_transaction allows implementations to link together multiple transactions. An unpopulated network identifier indicates that the related transaction is on the same network.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class RelatedTransaction {

  @JsonProperty("network_identifier")
  private NetworkIdentifier networkIdentifier;

  @JsonProperty("transaction_identifier")
  private TransactionIdentifier transactionIdentifier;

  @JsonProperty("direction")
  private Direction direction;

  public RelatedTransaction networkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
    return this;
  }

  /**
   * Get networkIdentifier
   * @return networkIdentifier
  */
  @Valid 
  @Schema(name = "network_identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public NetworkIdentifier getNetworkIdentifier() {
    return networkIdentifier;
  }

  public void setNetworkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
  }

  public RelatedTransaction transactionIdentifier(TransactionIdentifier transactionIdentifier) {
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

  public RelatedTransaction direction(Direction direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @NotNull @Valid 
  @Schema(name = "direction", requiredMode = Schema.RequiredMode.REQUIRED)
  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTransaction relatedTransaction = (RelatedTransaction) o;
    return Objects.equals(this.networkIdentifier, relatedTransaction.networkIdentifier) &&
        Objects.equals(this.transactionIdentifier, relatedTransaction.transactionIdentifier) &&
        Objects.equals(this.direction, relatedTransaction.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, transactionIdentifier, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTransaction {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

