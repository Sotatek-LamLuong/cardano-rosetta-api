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
 * Blocks contain an array of Transactions that occurred at a particular BlockIdentifier. A hard requirement for blocks returned by Rosetta implementations is that they MUST be _inalterable_: once a client has requested and received a block identified by a specific BlockIndentifier, all future calls for that same BlockIdentifier must return the same block contents.
 */

@Schema(name = "Block", description = "Blocks contain an array of Transactions that occurred at a particular BlockIdentifier. A hard requirement for blocks returned by Rosetta implementations is that they MUST be _inalterable_: once a client has requested and received a block identified by a specific BlockIndentifier, all future calls for that same BlockIdentifier must return the same block contents.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Block {

  @JsonProperty("block_identifier")
  private BlockIdentifier blockIdentifier;

  @JsonProperty("parent_block_identifier")
  private BlockIdentifier parentBlockIdentifier;

  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = new ArrayList<>();

  @JsonProperty("metadata")
  private BlockMetadata metadata;

  public Block blockIdentifier(BlockIdentifier blockIdentifier) {
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

  public Block parentBlockIdentifier(BlockIdentifier parentBlockIdentifier) {
    this.parentBlockIdentifier = parentBlockIdentifier;
    return this;
  }

  /**
   * Get parentBlockIdentifier
   * @return parentBlockIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "parent_block_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public BlockIdentifier getParentBlockIdentifier() {
    return parentBlockIdentifier;
  }

  public void setParentBlockIdentifier(BlockIdentifier parentBlockIdentifier) {
    this.parentBlockIdentifier = parentBlockIdentifier;
  }

  public Block timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp of the block in milliseconds since the Unix Epoch. The timestamp is stored in milliseconds because some blockchains produce blocks more often than once a second.
   * minimum: 0
   * @return timestamp
  */
  @NotNull @Min(0L) 
  @Schema(name = "timestamp", example = "1582833600000", description = "The timestamp of the block in milliseconds since the Unix Epoch. The timestamp is stored in milliseconds because some blockchains produce blocks more often than once a second.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Block transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Block addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  */
  @NotNull @Valid 
  @Schema(name = "transactions", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  public Block metadata(BlockMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BlockMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(BlockMetadata metadata) {
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
    Block block = (Block) o;
    return Objects.equals(this.blockIdentifier, block.blockIdentifier) &&
        Objects.equals(this.parentBlockIdentifier, block.parentBlockIdentifier) &&
        Objects.equals(this.timestamp, block.timestamp) &&
        Objects.equals(this.transactions, block.transactions) &&
        Objects.equals(this.metadata, block.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIdentifier, parentBlockIdentifier, timestamp, transactions, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    sb.append("    blockIdentifier: ").append(toIndentedString(blockIdentifier)).append("\n");
    sb.append("    parentBlockIdentifier: ").append(toIndentedString(parentBlockIdentifier)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

