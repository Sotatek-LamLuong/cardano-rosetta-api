package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * When fetching data by BlockIdentifier, it may be possible to only specify the index or hash. If neither property is specified, it is assumed that the client is making a request at the current block.
 */

@Schema(name = "PartialBlockIdentifier", description = "When fetching data by BlockIdentifier, it may be possible to only specify the index or hash. If neither property is specified, it is assumed that the client is making a request at the current block.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class PartialBlockIdentifier {

  @JsonProperty("index")
  private Long index;

  @JsonProperty("hash")
  private String hash;

  public PartialBlockIdentifier index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  */
  
  @Schema(name = "index", example = "1123941", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public PartialBlockIdentifier hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  */
  
  @Schema(name = "hash", example = "0x1f2cc6c5027d2f201a5453ad1119574d2aed23a392654742ac3c78783c071f85", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PartialBlockIdentifier partialBlockIdentifier = (PartialBlockIdentifier) o;
    return Objects.equals(this.index, partialBlockIdentifier.index) &&
        Objects.equals(this.hash, partialBlockIdentifier.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialBlockIdentifier {\n");
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

