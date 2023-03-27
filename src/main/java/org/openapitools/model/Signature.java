package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PublicKey;
import org.openapitools.model.SignatureType;
import org.openapitools.model.SigningPayload;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Signature contains the payload that was signed, the public keys of the keypairs used to produce the signature, the signature (encoded in hex), and the SignatureType. PublicKey is often times not known during construction of the signing payloads but may be needed to combine signatures properly.
 */

@Schema(name = "Signature", description = "Signature contains the payload that was signed, the public keys of the keypairs used to produce the signature, the signature (encoded in hex), and the SignatureType. PublicKey is often times not known during construction of the signing payloads but may be needed to combine signatures properly.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class Signature {

  @JsonProperty("signing_payload")
  private SigningPayload signingPayload;

  @JsonProperty("public_key")
  private PublicKey publicKey;

  @JsonProperty("signature_type")
  private SignatureType signatureType;

  @JsonProperty("hex_bytes")
  private String hexBytes;

  public Signature signingPayload(SigningPayload signingPayload) {
    this.signingPayload = signingPayload;
    return this;
  }

  /**
   * Get signingPayload
   * @return signingPayload
  */
  @NotNull @Valid 
  @Schema(name = "signing_payload", requiredMode = Schema.RequiredMode.REQUIRED)
  public SigningPayload getSigningPayload() {
    return signingPayload;
  }

  public void setSigningPayload(SigningPayload signingPayload) {
    this.signingPayload = signingPayload;
  }

  public Signature publicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
  */
  @NotNull @Valid 
  @Schema(name = "public_key", requiredMode = Schema.RequiredMode.REQUIRED)
  public PublicKey getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  public Signature signatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
    return this;
  }

  /**
   * Get signatureType
   * @return signatureType
  */
  @NotNull @Valid 
  @Schema(name = "signature_type", requiredMode = Schema.RequiredMode.REQUIRED)
  public SignatureType getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
  }

  public Signature hexBytes(String hexBytes) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.signingPayload, signature.signingPayload) &&
        Objects.equals(this.publicKey, signature.publicKey) &&
        Objects.equals(this.signatureType, signature.signatureType) &&
        Objects.equals(this.hexBytes, signature.hexBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingPayload, publicKey, signatureType, hexBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    sb.append("    signingPayload: ").append(toIndentedString(signingPayload)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    hexBytes: ").append(toIndentedString(hexBytes)).append("\n");
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

