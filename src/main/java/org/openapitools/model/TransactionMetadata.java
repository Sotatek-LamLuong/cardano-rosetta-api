package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Transactions that are related to other transactions (like a cross-shard transaction) should include the tranaction_identifier of these transactions in the metadata.
 */

@Schema(name = "Transaction_metadata", description = "Transactions that are related to other transactions (like a cross-shard transaction) should include the tranaction_identifier of these transactions in the metadata.")
@JsonTypeName("Transaction_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class TransactionMetadata {

  @JsonProperty("size")
  private BigDecimal size;

  @JsonProperty("scriptSize")
  private BigDecimal scriptSize;

  public TransactionMetadata size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @NotNull @Valid 
  @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public TransactionMetadata scriptSize(BigDecimal scriptSize) {
    this.scriptSize = scriptSize;
    return this;
  }

  /**
   * Get scriptSize
   * @return scriptSize
  */
  @NotNull @Valid 
  @Schema(name = "scriptSize", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getScriptSize() {
    return scriptSize;
  }

  public void setScriptSize(BigDecimal scriptSize) {
    this.scriptSize = scriptSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionMetadata transactionMetadata = (TransactionMetadata) o;
    return Objects.equals(this.size, transactionMetadata.size) &&
        Objects.equals(this.scriptSize, transactionMetadata.scriptSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, scriptSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionMetadata {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    scriptSize: ").append(toIndentedString(scriptSize)).append("\n");
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

