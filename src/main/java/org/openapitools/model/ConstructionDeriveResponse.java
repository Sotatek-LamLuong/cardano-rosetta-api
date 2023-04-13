package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountIdentifier;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConstructionDeriveResponse is returned by the &#x60;/construction/derive&#x60; endpoint.
 */

@Schema(name = "ConstructionDeriveResponse", description = "ConstructionDeriveResponse is returned by the `/construction/derive` endpoint.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class ConstructionDeriveResponse {

  @JsonProperty("address")
  private String address;

  @JsonProperty("account_identifier")
  private AccountIdentifier accountIdentifier;

  @JsonProperty("metadata")
  private Object metadata;

  public ConstructionDeriveResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * [DEPRECATED by `account_identifier` in `v1.4.4`] Address in network-specific format.
   * @return address
  */
  
  @Schema(name = "address", description = "[DEPRECATED by `account_identifier` in `v1.4.4`] Address in network-specific format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ConstructionDeriveResponse(AccountIdentifier accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  /**
   * Get accountIdentifier
   * @return accountIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "account_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public AccountIdentifier getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(AccountIdentifier accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public ConstructionDeriveResponse metadata(Object metadata) {
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
    ConstructionDeriveResponse constructionDeriveResponse = (ConstructionDeriveResponse) o;
    return Objects.equals(this.address, constructionDeriveResponse.address) &&
        Objects.equals(this.accountIdentifier, constructionDeriveResponse.accountIdentifier) &&
        Objects.equals(this.metadata, constructionDeriveResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, accountIdentifier, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionDeriveResponse {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
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

