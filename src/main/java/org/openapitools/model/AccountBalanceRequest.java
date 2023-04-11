package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * An AccountBalanceRequest is utilized to make a balance request on the /account/balance endpoint. If the block_identifier is populated, a historical balance query should be performed.
 */

@Schema(name = "AccountBalanceRequest", description = "An AccountBalanceRequest is utilized to make a balance request on the /account/balance endpoint. If the block_identifier is populated, a historical balance query should be performed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class AccountBalanceRequest {

  @JsonProperty("network_identifier")
  private NetworkIdentifier networkIdentifier;

  @JsonProperty("account_identifier")
  private AccountIdentifier accountIdentifier;

  @JsonProperty("block_identifier")
  private PartialBlockIdentifier blockIdentifier;

  @JsonProperty("currencies")
  @Valid
  private List<Currency> currencies = null;

  public AccountBalanceRequest networkIdentifier(NetworkIdentifier networkIdentifier) {
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

  public AccountBalanceRequest accountIdentifier(AccountIdentifier accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
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

  public AccountBalanceRequest blockIdentifier(PartialBlockIdentifier blockIdentifier) {
    this.blockIdentifier = blockIdentifier;
    return this;
  }

  /**
   * Get blockIdentifier
   * @return blockIdentifier
  */
  @Valid 
  @Schema(name = "block_identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public PartialBlockIdentifier getBlockIdentifier() {
    return blockIdentifier;
  }

  public void setBlockIdentifier(PartialBlockIdentifier blockIdentifier) {
    this.blockIdentifier = blockIdentifier;
  }

  public AccountBalanceRequest currencies(List<Currency> currencies) {
    this.currencies = currencies;
    return this;
  }

  public AccountBalanceRequest addCurrenciesItem(Currency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * In some cases, the caller may not want to retrieve all available balances for an AccountIdentifier. If the currencies field is populated, only balances for the specified currencies will be returned. If not populated, all available balances will be returned.
   * @return currencies
  */
  @Valid 
  @Schema(name = "currencies", description = "In some cases, the caller may not want to retrieve all available balances for an AccountIdentifier. If the currencies field is populated, only balances for the specified currencies will be returned. If not populated, all available balances will be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Currency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<Currency> currencies) {
    this.currencies = currencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalanceRequest accountBalanceRequest = (AccountBalanceRequest) o;
    return Objects.equals(this.networkIdentifier, accountBalanceRequest.networkIdentifier) &&
        Objects.equals(this.accountIdentifier, accountBalanceRequest.accountIdentifier) &&
        Objects.equals(this.blockIdentifier, accountBalanceRequest.blockIdentifier) &&
        Objects.equals(this.currencies, accountBalanceRequest.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, accountIdentifier, blockIdentifier, currencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalanceRequest {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    blockIdentifier: ").append(toIndentedString(blockIdentifier)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

