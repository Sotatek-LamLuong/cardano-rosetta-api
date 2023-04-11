package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * EventsBlocksRequest is utilized to fetch a sequence of BlockEvents indicating which blocks were added and removed from storage to reach the current state.
 */

@Schema(name = "EventsBlocksRequest", description = "EventsBlocksRequest is utilized to fetch a sequence of BlockEvents indicating which blocks were added and removed from storage to reach the current state.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class EventsBlocksRequest {

  @JsonProperty("network_identifier")
  private NetworkIdentifier networkIdentifier;

  @JsonProperty("offset")
  private Long offset;

  @JsonProperty("limit")
  private Long limit;

  public EventsBlocksRequest networkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
    return this;
  }

  /**
   * Get networkIdentifier
   * @return networkIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "network_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public NetworkIdentifier getNetworkIdentifier() {
    return networkIdentifier;
  }

  public void setNetworkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
  }

  public EventsBlocksRequest offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * offset is the offset into the event stream to sync events from. If this field is not populated, we return the limit events backwards from tip. If this is set to 0, we start from the beginning.
   * minimum: 0
   * @return offset
  */
  @Min(0L) 
  @Schema(name = "offset", example = "5", description = "offset is the offset into the event stream to sync events from. If this field is not populated, we return the limit events backwards from tip. If this is set to 0, we start from the beginning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public EventsBlocksRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * limit is the maximum number of events to fetch in one call. The implementation may return <= limit events.
   * minimum: 0
   * @return limit
  */
  @Min(0L) 
  @Schema(name = "limit", example = "5", description = "limit is the maximum number of events to fetch in one call. The implementation may return <= limit events.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsBlocksRequest eventsBlocksRequest = (EventsBlocksRequest) o;
    return Objects.equals(this.networkIdentifier, eventsBlocksRequest.networkIdentifier) &&
        Objects.equals(this.offset, eventsBlocksRequest.offset) &&
        Objects.equals(this.limit, eventsBlocksRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, offset, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsBlocksRequest {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

