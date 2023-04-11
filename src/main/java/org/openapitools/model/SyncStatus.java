package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * SyncStatus is used to provide additional context about an implementation&#39;s sync status. This object is often used by implementations to indicate healthiness when block data cannot be queried until some sync phase completes or cannot be determined by comparing the timestamp of the most recent block with the current time.
 */

@Schema(name = "SyncStatus", description = "SyncStatus is used to provide additional context about an implementation's sync status. This object is often used by implementations to indicate healthiness when block data cannot be queried until some sync phase completes or cannot be determined by comparing the timestamp of the most recent block with the current time.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class SyncStatus {

  @JsonProperty("current_index")
  private Long currentIndex;

  @JsonProperty("target_index")
  private Long targetIndex;

  @JsonProperty("stage")
  private String stage;

  @JsonProperty("synced")
  private Boolean synced;

  public SyncStatus currentIndex(Long currentIndex) {
    this.currentIndex = currentIndex;
    return this;
  }

  /**
   * CurrentIndex is the index of the last synced block in the current stage. This is a separate field from current_block_identifier in NetworkStatusResponse because blocks with indices up to and including the current_index may not yet be queryable by the caller. To reiterate, all indices up to and including current_block_identifier in NetworkStatusResponse must be queryable via the /block endpoint (excluding indices less than oldest_block_identifier).
   * @return currentIndex
  */
  
  @Schema(name = "current_index", example = "100", description = "CurrentIndex is the index of the last synced block in the current stage. This is a separate field from current_block_identifier in NetworkStatusResponse because blocks with indices up to and including the current_index may not yet be queryable by the caller. To reiterate, all indices up to and including current_block_identifier in NetworkStatusResponse must be queryable via the /block endpoint (excluding indices less than oldest_block_identifier).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getCurrentIndex() {
    return currentIndex;
  }

  public void setCurrentIndex(Long currentIndex) {
    this.currentIndex = currentIndex;
  }

  public SyncStatus targetIndex(Long targetIndex) {
    this.targetIndex = targetIndex;
    return this;
  }

  /**
   * TargetIndex is the index of the block that the implementation is attempting to sync to in the current stage.
   * @return targetIndex
  */
  
  @Schema(name = "target_index", example = "150", description = "TargetIndex is the index of the block that the implementation is attempting to sync to in the current stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getTargetIndex() {
    return targetIndex;
  }

  public void setTargetIndex(Long targetIndex) {
    this.targetIndex = targetIndex;
  }

  public SyncStatus stage(String stage) {
    this.stage = stage;
    return this;
  }

  /**
   * Stage is the phase of the sync process.
   * @return stage
  */
  
  @Schema(name = "stage", example = "header sync", description = "Stage is the phase of the sync process.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public SyncStatus synced(Boolean synced) {
    this.synced = synced;
    return this;
  }

  /**
   * sycned is a boolean that indicates if an implementation has synced up to the most recent block. If this field is not populated, the caller should rely on a traditional tip timestamp comparison to determine if an implementation is synced. This field is particularly useful for quiescent blockchains (blocks only produced when there are pending transactions). In these blockchains, the most recent block could have a timestamp far behind the current time but the node could be healthy and at tip.
   * @return synced
  */
  
  @Schema(name = "synced", description = "sycned is a boolean that indicates if an implementation has synced up to the most recent block. If this field is not populated, the caller should rely on a traditional tip timestamp comparison to determine if an implementation is synced. This field is particularly useful for quiescent blockchains (blocks only produced when there are pending transactions). In these blockchains, the most recent block could have a timestamp far behind the current time but the node could be healthy and at tip.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getSynced() {
    return synced;
  }

  public void setSynced(Boolean synced) {
    this.synced = synced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncStatus syncStatus = (SyncStatus) o;
    return Objects.equals(this.currentIndex, syncStatus.currentIndex) &&
        Objects.equals(this.targetIndex, syncStatus.targetIndex) &&
        Objects.equals(this.stage, syncStatus.stage) &&
        Objects.equals(this.synced, syncStatus.synced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentIndex, targetIndex, stage, synced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncStatus {\n");
    sb.append("    currentIndex: ").append(toIndentedString(currentIndex)).append("\n");
    sb.append("    targetIndex: ").append(toIndentedString(targetIndex)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    synced: ").append(toIndentedString(synced)).append("\n");
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

