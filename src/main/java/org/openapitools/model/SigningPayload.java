package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * SigningPayload is signed by the client with the keypair associated with an AccountIdentifier using the specified SignatureType. SignatureType can be optionally populated if there is a restriction on the signature scheme that can be used to sign the payload.
 */

@Schema(name = "SigningPayload", description = "SigningPayload is signed by the client with the keypair associated with an AccountIdentifier using the specified SignatureType. SignatureType can be optionally populated if there is a restriction on the signature scheme that can be used to sign the payload.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class SigningPayload {

  @JsonProperty("address")
  private String address;

  @JsonProperty("account_identifier")
  private AccountIdentifier accountIdentifier;

  @JsonProperty("hex_bytes")
  private String hexBytes;

  @JsonProperty("signature_type")
  private SignatureType signatureType;

  public SigningPayload address(String address) {
    this.address = address;
    return this;
  }

  /**
   * [DEPRECATED by `account_identifier` in `v1.4.4`] The network-specific address of the account that should sign the payload.
   * @return address
  */
  
  @Schema(name = "address", description = "[DEPRECATED by `account_identifier` in `v1.4.4`] The network-specific address of the account that should sign the payload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SigningPayload accountIdentifier(AccountIdentifier accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * Get accountIdentifier
   * @return accountIdentifier
  */
  @Valid 
  @Schema(name = "account_identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public AccountIdentifier getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(AccountIdentifier accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public SigningPayload hexBytes(String hexBytes) {
    this.hexBytes = hexBytes;
    return this;
  }

  /**
   * Get hexBytes
   * @return hexBytes
  */
  @NotNull 
  @Schema(name = "hex_bytes", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getHexBytes() {
    return hexBytes;
  }

  public void setHexBytes(String hexBytes) {
    this.hexBytes = hexBytes;
  }

  public SigningPayload signatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
    return this;
  }

  /**
   * Get signatureType
   * @return signatureType
  */
  @Valid 
  @Schema(name = "signature_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public SignatureType getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningPayload signingPayload = (SigningPayload) o;
    return Objects.equals(this.address, signingPayload.address) &&
        Objects.equals(this.accountIdentifier, signingPayload.accountIdentifier) &&
        Objects.equals(this.hexBytes, signingPayload.hexBytes) &&
        Objects.equals(this.signatureType, signingPayload.signatureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, accountIdentifier, hexBytes, signatureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningPayload {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    hexBytes: ").append(toIndentedString(hexBytes)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
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

