package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * The block_identifier uniquely identifies a block in a particular network.
 */

@Schema(name = "BlockIdentifier", description = "The block_identifier uniquely identifies a block in a particular network.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class BlockIdentifier {

  @JsonProperty("index")
  private Long index;

  @JsonProperty("hash")
  private String hash;

  public BlockIdentifier index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * This is also known as the block height.
   * @return index
  */
  @NotNull 
  @Schema(name = "index", example = "1123941", description = "This is also known as the block height.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public BlockIdentifier hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  */
  @NotNull 
  @Schema(name = "hash", example = "0x1f2cc6c5027d2f201a5453ad1119574d2aed23a392654742ac3c78783c071f85", requiredMode = Schema.RequiredMode.REQUIRED)
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
    BlockIdentifier blockIdentifier = (BlockIdentifier) o;
    return Objects.equals(this.index, blockIdentifier.index) &&
        Objects.equals(this.hash, blockIdentifier.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockIdentifier {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

