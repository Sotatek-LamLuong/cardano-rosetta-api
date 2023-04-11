package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Currency is composed of a canonical Symbol and Decimals. This Decimals value is used to convert an Amount.Value from atomic units (Satoshis) to standard units (Bitcoins).
 */

@Schema(name = "Currency", description = "Currency is composed of a canonical Symbol and Decimals. This Decimals value is used to convert an Amount.Value from atomic units (Satoshis) to standard units (Bitcoins).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Currency {

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("decimals")
  private Integer decimals;

  @JsonProperty("metadata")
  private JsonNullable<Object> metadata = JsonNullable.undefined();

  public Currency symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Canonical symbol associated with a currency.
   * @return symbol
  */
  @NotNull 
  @Schema(name = "symbol", example = "BTC", description = "Canonical symbol associated with a currency.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Currency decimals(Integer decimals) {
    this.decimals = decimals;
    return this;
  }

  /**
   * Number of decimal places in the standard unit representation of the amount. For example, BTC has 8 decimals. Note that it is not possible to represent the value of some currency in atomic units that is not base 10.
   * minimum: 0
   * @return decimals
  */
  @NotNull @Min(0) 
  @Schema(name = "decimals", example = "8", description = "Number of decimal places in the standard unit representation of the amount. For example, BTC has 8 decimals. Note that it is not possible to represent the value of some currency in atomic units that is not base 10.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getDecimals() {
    return decimals;
  }

  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }

  public Currency metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
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
    Currency currency = (Currency) o;
    return Objects.equals(this.symbol, currency.symbol) &&
        Objects.equals(this.decimals, currency.decimals) &&
        equalsNullable(this.metadata, currency.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, decimals, hashCodeNullable(metadata));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
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

