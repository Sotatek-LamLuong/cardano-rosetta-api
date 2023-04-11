package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * The transaction_identifier uniquely identifies a transaction in a particular network and block or in the mempool.
 */

@Schema(name = "TransactionIdentifier", description = "The transaction_identifier uniquely identifies a transaction in a particular network and block or in the mempool.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class TransactionIdentifier {

  @JsonProperty("hash")
  private String hash;

  public TransactionIdentifier hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Any transactions that are attributable only to a block (ex: a block event) should use the hash of the block as the identifier.
   * @return hash
  */
  @NotNull 
  @Schema(name = "hash", example = "0x2f23fd8cca835af21f3ac375bac601f97ead75f2e79143bdf71fe2c4be043e8f", description = "Any transactions that are attributable only to a block (ex: a block event) should use the hash of the block as the identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionIdentifier transactionIdentifier = (TransactionIdentifier) o;
    return Objects.equals(this.hash, transactionIdentifier.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIdentifier {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

