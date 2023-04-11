package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Instead of utilizing HTTP status codes to describe node errors (which often do not have a good analog), rich errors are returned using this object. Both the code and message fields can be individually used to correctly identify an error. Implementations MUST use unique values for both fields.
 */

@Schema(name = "Error", description = "Instead of utilizing HTTP status codes to describe node errors (which often do not have a good analog), rich errors are returned using this object. Both the code and message fields can be individually used to correctly identify an error. Implementations MUST use unique values for both fields.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Error {

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("description")
  private String description;

  @JsonProperty("retriable")
  private Boolean retriable;

  @JsonProperty("details")
  private ErrorDetails details;

  public Error code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Code is a network-specific error code. If desired, this code can be equivalent to an HTTP status code.
   * minimum: 0
   * @return code
  */
  @NotNull @Min(0) 
  @Schema(name = "code", example = "12", description = "Code is a network-specific error code. If desired, this code can be equivalent to an HTTP status code.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message is a network-specific error message. The message MUST NOT change for a given code. In particular, this means that any contextual information should be included in the details field.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "Invalid account format", description = "Message is a network-specific error message. The message MUST NOT change for a given code. In particular, this means that any contextual information should be included in the details field.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description allows the implementer to optionally provide additional information about an error. In many cases, the content of this field will be a copy-and-paste from existing developer documentation. Description can ONLY be populated with generic information about a particular type of error. It MUST NOT be populated with information about a particular instantiation of an error (use `details` for this). Whereas the content of Error.Message should stay stable across releases, the content of Error.Description will likely change across releases (as implementers improve error documentation). For this reason, the content in this field is not part of any type assertion (unlike Error.Message).
   * @return description
  */
  
  @Schema(name = "description", example = "This error is returned when the requested AccountIdentifier is improperly formatted.", description = "Description allows the implementer to optionally provide additional information about an error. In many cases, the content of this field will be a copy-and-paste from existing developer documentation. Description can ONLY be populated with generic information about a particular type of error. It MUST NOT be populated with information about a particular instantiation of an error (use `details` for this). Whereas the content of Error.Message should stay stable across releases, the content of Error.Description will likely change across releases (as implementers improve error documentation). For this reason, the content in this field is not part of any type assertion (unlike Error.Message).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error retriable(Boolean retriable) {
    this.retriable = retriable;
    return this;
  }

  /**
   * An error is retriable if the same request may succeed if submitted again.
   * @return retriable
  */
  @NotNull 
  @Schema(name = "retriable", description = "An error is retriable if the same request may succeed if submitted again.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getRetriable() {
    return retriable;
  }

  public void setRetriable(Boolean retriable) {
    this.retriable = retriable;
  }

  public Error details(ErrorDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @Valid 
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ErrorDetails getDetails() {
    return details;
  }

  public void setDetails(ErrorDetails details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.retriable, error.retriable) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description, retriable, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    retriable: ").append(toIndentedString(retriable)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

