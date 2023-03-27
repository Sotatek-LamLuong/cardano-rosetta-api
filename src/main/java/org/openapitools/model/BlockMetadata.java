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
 * BlockMetadata
 */

@JsonTypeName("Block_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class BlockMetadata {

  @JsonProperty("transactionsCount")
  private BigDecimal transactionsCount;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("size")
  private BigDecimal size;

  @JsonProperty("epochNo")
  private BigDecimal epochNo;

  @JsonProperty("slotNo")
  private BigDecimal slotNo;

  public BlockMetadata transactionsCount(BigDecimal transactionsCount) {
    this.transactionsCount = transactionsCount;
    return this;
  }

  /**
   * Get transactionsCount
   * @return transactionsCount
  */
  @Valid 
  @Schema(name = "transactionsCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getTransactionsCount() {
    return transactionsCount;
  }

  public void setTransactionsCount(BigDecimal transactionsCount) {
    this.transactionsCount = transactionsCount;
  }

  public BlockMetadata createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public BlockMetadata size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @Valid 
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public BlockMetadata epochNo(BigDecimal epochNo) {
    this.epochNo = epochNo;
    return this;
  }

  /**
   * Get epochNo
   * @return epochNo
  */
  @Valid 
  @Schema(name = "epochNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getEpochNo() {
    return epochNo;
  }

  public void setEpochNo(BigDecimal epochNo) {
    this.epochNo = epochNo;
  }

  public BlockMetadata slotNo(BigDecimal slotNo) {
    this.slotNo = slotNo;
    return this;
  }

  /**
   * Get slotNo
   * @return slotNo
  */
  @Valid 
  @Schema(name = "slotNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getSlotNo() {
    return slotNo;
  }

  public void setSlotNo(BigDecimal slotNo) {
    this.slotNo = slotNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockMetadata blockMetadata = (BlockMetadata) o;
    return Objects.equals(this.transactionsCount, blockMetadata.transactionsCount) &&
        Objects.equals(this.createdBy, blockMetadata.createdBy) &&
        Objects.equals(this.size, blockMetadata.size) &&
        Objects.equals(this.epochNo, blockMetadata.epochNo) &&
        Objects.equals(this.slotNo, blockMetadata.slotNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionsCount, createdBy, size, epochNo, slotNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockMetadata {\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    epochNo: ").append(toIndentedString(epochNo)).append("\n");
    sb.append("    slotNo: ").append(toIndentedString(slotNo)).append("\n");
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

