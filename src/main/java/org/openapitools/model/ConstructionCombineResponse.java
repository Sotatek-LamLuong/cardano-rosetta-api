package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * ConstructionCombineResponse is returned by &#x60;/construction/combine&#x60;. The network payload will be sent directly to the &#x60;construction/submit&#x60; endpoint.
 */

@Schema(name = "ConstructionCombineResponse", description = "ConstructionCombineResponse is returned by `/construction/combine`. The network payload will be sent directly to the `construction/submit` endpoint.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class ConstructionCombineResponse {

  @JsonProperty("signed_transaction")
  private String signedTransaction;

  public ConstructionCombineResponse signedTransaction(String signedTransaction) {
    this.signedTransaction = signedTransaction;
    return this;
  }

  /**
   * Get signedTransaction
   * @return signedTransaction
  */
  @NotNull 
  @Schema(name = "signed_transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSignedTransaction() {
    return signedTransaction;
  }

  public void setSignedTransaction(String signedTransaction) {
    this.signedTransaction = signedTransaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionCombineResponse constructionCombineResponse = (ConstructionCombineResponse) o;
    return Objects.equals(this.signedTransaction, constructionCombineResponse.signedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionCombineResponse {\n");
    sb.append("    signedTransaction: ").append(toIndentedString(signedTransaction)).append("\n");
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

