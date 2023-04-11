package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * BlockTransaction contains a populated Transaction and the BlockIdentifier that contains it.
 */

@Schema(name = "BlockTransaction", description = "BlockTransaction contains a populated Transaction and the BlockIdentifier that contains it.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class BlockTransaction {

  @JsonProperty("block_identifier")
  private BlockIdentifier blockIdentifier;

  @JsonProperty("transaction")
  private Transaction transaction;

  public BlockTransaction blockIdentifier(BlockIdentifier blockIdentifier) {
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

  public BlockTransaction transaction(Transaction transaction) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockTransaction blockTransaction = (BlockTransaction) o;
    return Objects.equals(this.blockIdentifier, blockTransaction.blockIdentifier) &&
        Objects.equals(this.transaction, blockTransaction.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIdentifier, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockTransaction {\n");
    sb.append("    blockIdentifier: ").append(toIndentedString(blockIdentifier)).append("\n");
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

