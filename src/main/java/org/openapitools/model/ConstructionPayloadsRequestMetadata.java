package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ProtocolParameters;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConstructionPayloadsRequestMetadata
 */

@JsonTypeName("ConstructionPayloadsRequest_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class ConstructionPayloadsRequestMetadata {

  @JsonProperty("ttl")
  private String ttl;

  @JsonProperty("protocol_parameters")
  private ProtocolParameters protocolParameters;

  public ConstructionPayloadsRequestMetadata ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Get ttl
   * @return ttl
  */
  @NotNull 
  @Schema(name = "ttl", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }

  public ConstructionPayloadsRequestMetadata protocolParameters(ProtocolParameters protocolParameters) {
    this.protocolParameters = protocolParameters;
    return this;
  }

  /**
   * Get protocolParameters
   * @return protocolParameters
  */
  @NotNull @Valid 
  @Schema(name = "protocol_parameters", requiredMode = Schema.RequiredMode.REQUIRED)
  public ProtocolParameters getProtocolParameters() {
    return protocolParameters;
  }

  public void setProtocolParameters(ProtocolParameters protocolParameters) {
    this.protocolParameters = protocolParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionPayloadsRequestMetadata constructionPayloadsRequestMetadata = (ConstructionPayloadsRequestMetadata) o;
    return Objects.equals(this.ttl, constructionPayloadsRequestMetadata.ttl) &&
        Objects.equals(this.protocolParameters, constructionPayloadsRequestMetadata.protocolParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttl, protocolParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionPayloadsRequestMetadata {\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    protocolParameters: ").append(toIndentedString(protocolParameters)).append("\n");
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

