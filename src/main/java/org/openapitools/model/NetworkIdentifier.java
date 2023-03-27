package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SubNetworkIdentifier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The network_identifier specifies which network a particular object is associated with.
 */

@Schema(name = "NetworkIdentifier", description = "The network_identifier specifies which network a particular object is associated with.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class NetworkIdentifier {

  @JsonProperty("blockchain")
  private String blockchain;

  @JsonProperty("network")
  private String network;

  @JsonProperty("sub_network_identifier")
  private SubNetworkIdentifier subNetworkIdentifier;

  public NetworkIdentifier blockchain(String blockchain) {
    this.blockchain = blockchain;
    return this;
  }

  /**
   * Get blockchain
   * @return blockchain
  */
  @NotNull 
  @Schema(name = "blockchain", example = "bitcoin", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getBlockchain() {
    return blockchain;
  }

  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }

  public NetworkIdentifier network(String network) {
    this.network = network;
    return this;
  }

  /**
   * If a blockchain has a specific chain-id or network identifier, it should go in this field. It is up to the client to determine which network-specific identifier is mainnet, preprod, or preview.
   * @return network
  */
  @NotNull 
  @Schema(name = "network", example = "mainnet", description = "If a blockchain has a specific chain-id or network identifier, it should go in this field. It is up to the client to determine which network-specific identifier is mainnet, preprod, or preview.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public NetworkIdentifier subNetworkIdentifier(SubNetworkIdentifier subNetworkIdentifier) {
    this.subNetworkIdentifier = subNetworkIdentifier;
    return this;
  }

  /**
   * Get subNetworkIdentifier
   * @return subNetworkIdentifier
  */
  @Valid 
  @Schema(name = "sub_network_identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public SubNetworkIdentifier getSubNetworkIdentifier() {
    return subNetworkIdentifier;
  }

  public void setSubNetworkIdentifier(SubNetworkIdentifier subNetworkIdentifier) {
    this.subNetworkIdentifier = subNetworkIdentifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkIdentifier networkIdentifier = (NetworkIdentifier) o;
    return Objects.equals(this.blockchain, networkIdentifier.blockchain) &&
        Objects.equals(this.network, networkIdentifier.network) &&
        Objects.equals(this.subNetworkIdentifier, networkIdentifier.subNetworkIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, subNetworkIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkIdentifier {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    subNetworkIdentifier: ").append(toIndentedString(subNetworkIdentifier)).append("\n");
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

