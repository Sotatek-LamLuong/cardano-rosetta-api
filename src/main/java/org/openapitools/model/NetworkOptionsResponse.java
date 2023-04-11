package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * NetworkOptionsResponse contains information about the versioning of the node and the allowed operation statuses, operation types, and errors.
 */

@Schema(name = "NetworkOptionsResponse", description = "NetworkOptionsResponse contains information about the versioning of the node and the allowed operation statuses, operation types, and errors.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class NetworkOptionsResponse {

  @JsonProperty("version")
  private Version version;

  @JsonProperty("allow")
  private Allow allow;

  public NetworkOptionsResponse version(Version version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @NotNull @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public NetworkOptionsResponse allow(Allow allow) {
    this.allow = allow;
    return this;
  }

  /**
   * Get allow
   * @return allow
  */
  @NotNull @Valid 
  @Schema(name = "allow", requiredMode = Schema.RequiredMode.REQUIRED)
  public Allow getAllow() {
    return allow;
  }

  public void setAllow(Allow allow) {
    this.allow = allow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkOptionsResponse networkOptionsResponse = (NetworkOptionsResponse) o;
    return Objects.equals(this.version, networkOptionsResponse.version) &&
        Objects.equals(this.allow, networkOptionsResponse.allow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, allow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkOptionsResponse {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
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

