package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Unspent set for a given Account
 */

@Schema(name = "Utxo", description = "Unspent set for a given Account")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Utxo {

  @JsonProperty("value")
  private String value;

  @JsonProperty("index")
  private BigDecimal index;

  @JsonProperty("transactionHash")
  private String transactionHash;

  public Utxo value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Utxo index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  */
  @NotNull @Valid 
  @Schema(name = "index", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public Utxo transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

  /**
   * Get transactionHash
   * @return transactionHash
  */
  @NotNull 
  @Schema(name = "transactionHash", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utxo utxo = (Utxo) o;
    return Objects.equals(this.value, utxo.value) &&
        Objects.equals(this.index, utxo.index) &&
        Objects.equals(this.transactionHash, utxo.transactionHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, index, transactionHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utxo {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
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

