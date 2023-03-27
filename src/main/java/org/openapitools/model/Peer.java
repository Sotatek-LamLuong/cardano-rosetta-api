package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A Peer is a representation of a node&#39;s peer.
 */

@Schema(name = "Peer", description = "A Peer is a representation of a node's peer.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Peer {

  @JsonProperty("peer_id")
  private String peerId;

  @JsonProperty("metadata")
  private Object metadata;

  public Peer peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }

  /**
   * Get peerId
   * @return peerId
  */
  @NotNull 
  @Schema(name = "peer_id", example = "0x52bc44d5378309ee2abf1539bf71de1b7d7be3b5", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPeerId() {
    return peerId;
  }

  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  public Peer metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Peer peer = (Peer) o;
    return Objects.equals(this.peerId, peer.peerId) &&
        Objects.equals(this.metadata, peer.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peerId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peer {\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
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

