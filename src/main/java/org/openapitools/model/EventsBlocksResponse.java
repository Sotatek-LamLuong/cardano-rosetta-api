package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BlockEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EventsBlocksResponse contains an ordered collection of BlockEvents and the max retrievable sequence.
 */

@Schema(name = "EventsBlocksResponse", description = "EventsBlocksResponse contains an ordered collection of BlockEvents and the max retrievable sequence.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class EventsBlocksResponse {

  @JsonProperty("max_sequence")
  private Long maxSequence;

  @JsonProperty("events")
  @Valid
  private List<BlockEvent> events = new ArrayList<>();

  public EventsBlocksResponse maxSequence(Long maxSequence) {
    this.maxSequence = maxSequence;
    return this;
  }

  /**
   * max_sequence is the maximum available sequence number to fetch.
   * minimum: 0
   * @return maxSequence
  */
  @NotNull @Min(0L) 
  @Schema(name = "max_sequence", example = "5", description = "max_sequence is the maximum available sequence number to fetch.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getMaxSequence() {
    return maxSequence;
  }

  public void setMaxSequence(Long maxSequence) {
    this.maxSequence = maxSequence;
  }

  public EventsBlocksResponse events(List<BlockEvent> events) {
    this.events = events;
    return this;
  }

  public EventsBlocksResponse addEventsItem(BlockEvent eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

  /**
   * events is an array of BlockEvents indicating the order to add and remove blocks to maintain a canonical view of blockchain state. Lightweight clients can use this event stream to update state without implementing their own block syncing logic.
   * @return events
  */
  @NotNull @Valid 
  @Schema(name = "events", description = "events is an array of BlockEvents indicating the order to add and remove blocks to maintain a canonical view of blockchain state. Lightweight clients can use this event stream to update state without implementing their own block syncing logic.", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<BlockEvent> getEvents() {
    return events;
  }

  public void setEvents(List<BlockEvent> events) {
    this.events = events;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsBlocksResponse eventsBlocksResponse = (EventsBlocksResponse) o;
    return Objects.equals(this.maxSequence, eventsBlocksResponse.maxSequence) &&
        Objects.equals(this.events, eventsBlocksResponse.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSequence, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsBlocksResponse {\n");
    sb.append("    maxSequence: ").append(toIndentedString(maxSequence)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

