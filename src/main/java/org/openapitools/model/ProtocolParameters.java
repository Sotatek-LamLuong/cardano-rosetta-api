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
 * ProtocolParameters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class ProtocolParameters {

  @JsonProperty("coinsPerUtxoSize")
  private String coinsPerUtxoSize;

  @JsonProperty("maxTxSize")
  private BigDecimal maxTxSize;

  @JsonProperty("maxValSize")
  private BigDecimal maxValSize;

  @JsonProperty("keyDeposit")
  private String keyDeposit;

  @JsonProperty("maxCollateralInputs")
  private BigDecimal maxCollateralInputs;

  @JsonProperty("minFeeCoefficient")
  private BigDecimal minFeeCoefficient;

  @JsonProperty("minFeeConstant")
  private BigDecimal minFeeConstant;

  @JsonProperty("minPoolCost")
  private String minPoolCost;

  @JsonProperty("poolDeposit")
  private String poolDeposit;

  @JsonProperty("protocol")
  private Integer protocol;

  public ProtocolParameters coinsPerUtxoSize(String coinsPerUtxoSize) {
    this.coinsPerUtxoSize = coinsPerUtxoSize;
    return this;
  }

  /**
   * Get coinsPerUtxoSize
   * @return coinsPerUtxoSize
  */
  @NotNull 
  @Schema(name = "coinsPerUtxoSize", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getCoinsPerUtxoSize() {
    return coinsPerUtxoSize;
  }

  public void setCoinsPerUtxoSize(String coinsPerUtxoSize) {
    this.coinsPerUtxoSize = coinsPerUtxoSize;
  }

  public ProtocolParameters maxTxSize(BigDecimal maxTxSize) {
    this.maxTxSize = maxTxSize;
    return this;
  }

  /**
   * Get maxTxSize
   * @return maxTxSize
  */
  @NotNull @Valid 
  @Schema(name = "maxTxSize", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getMaxTxSize() {
    return maxTxSize;
  }

  public void setMaxTxSize(BigDecimal maxTxSize) {
    this.maxTxSize = maxTxSize;
  }

  public ProtocolParameters maxValSize(BigDecimal maxValSize) {
    this.maxValSize = maxValSize;
    return this;
  }

  /**
   * Get maxValSize
   * @return maxValSize
  */
  @NotNull @Valid 
  @Schema(name = "maxValSize", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getMaxValSize() {
    return maxValSize;
  }

  public void setMaxValSize(BigDecimal maxValSize) {
    this.maxValSize = maxValSize;
  }

  public ProtocolParameters keyDeposit(String keyDeposit) {
    this.keyDeposit = keyDeposit;
    return this;
  }

  /**
   * key registration cost in Lovelace
   * @return keyDeposit
  */
  @NotNull 
  @Schema(name = "keyDeposit", description = "key registration cost in Lovelace", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getKeyDeposit() {
    return keyDeposit;
  }

  public void setKeyDeposit(String keyDeposit) {
    this.keyDeposit = keyDeposit;
  }

  public ProtocolParameters maxCollateralInputs(BigDecimal maxCollateralInputs) {
    this.maxCollateralInputs = maxCollateralInputs;
    return this;
  }

  /**
   * Get maxCollateralInputs
   * @return maxCollateralInputs
  */
  @NotNull @Valid 
  @Schema(name = "maxCollateralInputs", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getMaxCollateralInputs() {
    return maxCollateralInputs;
  }

  public void setMaxCollateralInputs(BigDecimal maxCollateralInputs) {
    this.maxCollateralInputs = maxCollateralInputs;
  }

  public ProtocolParameters minFeeCoefficient(BigDecimal minFeeCoefficient) {
    this.minFeeCoefficient = minFeeCoefficient;
    return this;
  }

  /**
   * Get minFeeCoefficient
   * @return minFeeCoefficient
  */
  @NotNull @Valid 
  @Schema(name = "minFeeCoefficient", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getMinFeeCoefficient() {
    return minFeeCoefficient;
  }

  public void setMinFeeCoefficient(BigDecimal minFeeCoefficient) {
    this.minFeeCoefficient = minFeeCoefficient;
  }

  public ProtocolParameters minFeeConstant(BigDecimal minFeeConstant) {
    this.minFeeConstant = minFeeConstant;
    return this;
  }

  /**
   * Get minFeeConstant
   * @return minFeeConstant
  */
  @NotNull @Valid 
  @Schema(name = "minFeeConstant", requiredMode = Schema.RequiredMode.REQUIRED)
  public BigDecimal getMinFeeConstant() {
    return minFeeConstant;
  }

  public void setMinFeeConstant(BigDecimal minFeeConstant) {
    this.minFeeConstant = minFeeConstant;
  }

  public ProtocolParameters minPoolCost(String minPoolCost) {
    this.minPoolCost = minPoolCost;
    return this;
  }

  /**
   * Get minPoolCost
   * @return minPoolCost
  */
  @NotNull 
  @Schema(name = "minPoolCost", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getMinPoolCost() {
    return minPoolCost;
  }

  public void setMinPoolCost(String minPoolCost) {
    this.minPoolCost = minPoolCost;
  }

  public ProtocolParameters poolDeposit(String poolDeposit) {
    this.poolDeposit = poolDeposit;
    return this;
  }

  /**
   * pool registration cost in Lovelace
   * @return poolDeposit
  */
  @NotNull 
  @Schema(name = "poolDeposit", description = "pool registration cost in Lovelace", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPoolDeposit() {
    return poolDeposit;
  }

  public void setPoolDeposit(String poolDeposit) {
    this.poolDeposit = poolDeposit;
  }

  public ProtocolParameters protocol(Integer protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  */
  @NotNull 
  @Schema(name = "protocol", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getProtocol() {
    return protocol;
  }

  public void setProtocol(Integer protocol) {
    this.protocol = protocol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtocolParameters protocolParameters = (ProtocolParameters) o;
    return Objects.equals(this.coinsPerUtxoSize, protocolParameters.coinsPerUtxoSize) &&
        Objects.equals(this.maxTxSize, protocolParameters.maxTxSize) &&
        Objects.equals(this.maxValSize, protocolParameters.maxValSize) &&
        Objects.equals(this.keyDeposit, protocolParameters.keyDeposit) &&
        Objects.equals(this.maxCollateralInputs, protocolParameters.maxCollateralInputs) &&
        Objects.equals(this.minFeeCoefficient, protocolParameters.minFeeCoefficient) &&
        Objects.equals(this.minFeeConstant, protocolParameters.minFeeConstant) &&
        Objects.equals(this.minPoolCost, protocolParameters.minPoolCost) &&
        Objects.equals(this.poolDeposit, protocolParameters.poolDeposit) &&
        Objects.equals(this.protocol, protocolParameters.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coinsPerUtxoSize, maxTxSize, maxValSize, keyDeposit, maxCollateralInputs, minFeeCoefficient, minFeeConstant, minPoolCost, poolDeposit, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolParameters {\n");
    sb.append("    coinsPerUtxoSize: ").append(toIndentedString(coinsPerUtxoSize)).append("\n");
    sb.append("    maxTxSize: ").append(toIndentedString(maxTxSize)).append("\n");
    sb.append("    maxValSize: ").append(toIndentedString(maxValSize)).append("\n");
    sb.append("    keyDeposit: ").append(toIndentedString(keyDeposit)).append("\n");
    sb.append("    maxCollateralInputs: ").append(toIndentedString(maxCollateralInputs)).append("\n");
    sb.append("    minFeeCoefficient: ").append(toIndentedString(minFeeCoefficient)).append("\n");
    sb.append("    minFeeConstant: ").append(toIndentedString(minFeeConstant)).append("\n");
    sb.append("    minPoolCost: ").append(toIndentedString(minPoolCost)).append("\n");
    sb.append("    poolDeposit: ").append(toIndentedString(poolDeposit)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

