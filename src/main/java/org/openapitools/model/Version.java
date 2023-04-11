package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * The Version object is utilized to inform the client of the versions of different components of the Rosetta implementation.
 */

@Schema(name = "Version", description = "The Version object is utilized to inform the client of the versions of different components of the Rosetta implementation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Version {

  @JsonProperty("rosetta_version")
  private String rosettaVersion;

  @JsonProperty("node_version")
  private String nodeVersion;

  @JsonProperty("middleware_version")
  private String middlewareVersion;

  @JsonProperty("metadata")
  private Object metadata;

  public Version rosettaVersion(String rosettaVersion) {
    this.rosettaVersion = rosettaVersion;
    return this;
  }

  /**
   * The rosetta_version is the version of the Rosetta interface the implementation adheres to. This can be useful for clients looking to reliably parse responses.
   * @return rosettaVersion
  */
  @NotNull 
  @Schema(name = "rosetta_version", example = "1.2.5", description = "The rosetta_version is the version of the Rosetta interface the implementation adheres to. This can be useful for clients looking to reliably parse responses.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getRosettaVersion() {
    return rosettaVersion;
  }

  public void setRosettaVersion(String rosettaVersion) {
    this.rosettaVersion = rosettaVersion;
  }

  public Version nodeVersion(String nodeVersion) {
    this.nodeVersion = nodeVersion;
    return this;
  }

  /**
   * The node_version is the canonical version of the node runtime. This can help clients manage deployments.
   * @return nodeVersion
  */
  @NotNull 
  @Schema(name = "node_version", example = "1.0.2", description = "The node_version is the canonical version of the node runtime. This can help clients manage deployments.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getNodeVersion() {
    return nodeVersion;
  }

  public void setNodeVersion(String nodeVersion) {
    this.nodeVersion = nodeVersion;
  }

  public Version middlewareVersion(String middlewareVersion) {
    this.middlewareVersion = middlewareVersion;
    return this;
  }

  /**
   * When a middleware server is used to adhere to the Rosetta interface, it should return its version here. This can help clients manage deployments.
   * @return middlewareVersion
  */
  
  @Schema(name = "middleware_version", example = "0.2.7", description = "When a middleware server is used to adhere to the Rosetta interface, it should return its version here. This can help clients manage deployments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMiddlewareVersion() {
    return middlewareVersion;
  }

  public void setMiddlewareVersion(String middlewareVersion) {
    this.middlewareVersion = middlewareVersion;
  }

  public Version metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Any other information that may be useful about versioning of dependent services should be returned here.
   * @return metadata
  */
  
  @Schema(name = "metadata", description = "Any other information that may be useful about versioning of dependent services should be returned here.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
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
    Version version = (Version) o;
    return Objects.equals(this.rosettaVersion, version.rosettaVersion) &&
        Objects.equals(this.nodeVersion, version.nodeVersion) &&
        Objects.equals(this.middlewareVersion, version.middlewareVersion) &&
        Objects.equals(this.metadata, version.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rosettaVersion, nodeVersion, middlewareVersion, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    rosettaVersion: ").append(toIndentedString(rosettaVersion)).append("\n");
    sb.append("    nodeVersion: ").append(toIndentedString(nodeVersion)).append("\n");
    sb.append("    middlewareVersion: ").append(toIndentedString(middlewareVersion)).append("\n");
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

