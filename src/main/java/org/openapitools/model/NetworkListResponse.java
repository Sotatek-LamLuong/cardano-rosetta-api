package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * A NetworkListResponse contains all NetworkIdentifiers that the node can serve information for.
 */

@Schema(name = "NetworkListResponse", description = "A NetworkListResponse contains all NetworkIdentifiers that the node can serve information for.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class NetworkListResponse {

  @JsonProperty("network_identifiers")
  @Valid
  private List<NetworkIdentifier> networkIdentifiers = new ArrayList<>();

  public NetworkListResponse networkIdentifiers(List<NetworkIdentifier> networkIdentifiers) {
    this.networkIdentifiers = networkIdentifiers;
    return this;
  }

  public NetworkListResponse addNetworkIdentifiersItem(NetworkIdentifier networkIdentifiersItem) {
    this.networkIdentifiers.add(networkIdentifiersItem);
    return this;
  }

  /**
   * Get networkIdentifiers
   * @return networkIdentifiers
  */
  @NotNull @Valid 
  @Schema(name = "network_identifiers", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<NetworkIdentifier> getNetworkIdentifiers() {
    return networkIdentifiers;
  }

  public void setNetworkIdentifiers(List<NetworkIdentifier> networkIdentifiers) {
    this.networkIdentifiers = networkIdentifiers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkListResponse networkListResponse = (NetworkListResponse) o;
    return Objects.equals(this.networkIdentifiers, networkListResponse.networkIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkListResponse {\n");
    sb.append("    networkIdentifiers: ").append(toIndentedString(networkIdentifiers)).append("\n");
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

