package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * In blockchains with sharded state, the SubNetworkIdentifier is required to query some object on a specific shard. This identifier is optional for all non-sharded blockchains.
 */

@Schema(name = "SubNetworkIdentifier", description = "In blockchains with sharded state, the SubNetworkIdentifier is required to query some object on a specific shard. This identifier is optional for all non-sharded blockchains.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class SubNetworkIdentifier {

  @JsonProperty("network")
  private String network;

  @JsonProperty("metadata")
  private Object metadata;

  public SubNetworkIdentifier network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
  */
  @NotNull 
  @Schema(name = "network", example = "shard 1", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public SubNetworkIdentifier metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", example = "{\"producer\":\"0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SubNetworkIdentifier subNetworkIdentifier = (SubNetworkIdentifier) o;
    return Objects.equals(this.network, subNetworkIdentifier.network) &&
        Objects.equals(this.metadata, subNetworkIdentifier.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubNetworkIdentifier {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

