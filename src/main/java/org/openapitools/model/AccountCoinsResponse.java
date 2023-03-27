package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BlockIdentifier;
import org.openapitools.model.Coin;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountCoinsResponse is returned on the /account/coins endpoint and includes all unspent Coins owned by an AccountIdentifier.
 */

@Schema(name = "AccountCoinsResponse", description = "AccountCoinsResponse is returned on the /account/coins endpoint and includes all unspent Coins owned by an AccountIdentifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class AccountCoinsResponse {

  @JsonProperty("block_identifier")
  private BlockIdentifier blockIdentifier;

  @JsonProperty("coins")
  @Valid
  private List<Coin> coins = new ArrayList<>();

  @JsonProperty("metadata")
  private Object metadata;

  public AccountCoinsResponse blockIdentifier(BlockIdentifier blockIdentifier) {
    this.blockIdentifier = blockIdentifier;
    return this;
  }

  /**
   * Get blockIdentifier
   * @return blockIdentifier
  */
  @NotNull @Valid 
  @Schema(name = "block_identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  public BlockIdentifier getBlockIdentifier() {
    return blockIdentifier;
  }

  public void setBlockIdentifier(BlockIdentifier blockIdentifier) {
    this.blockIdentifier = blockIdentifier;
  }

  public AccountCoinsResponse coins(List<Coin> coins) {
    this.coins = coins;
    return this;
  }

  public AccountCoinsResponse addCoinsItem(Coin coinsItem) {
    this.coins.add(coinsItem);
    return this;
  }

  /**
   * If a blockchain is UTXO-based, all unspent Coins owned by an account_identifier should be returned alongside the balance. It is highly recommended to populate this field so that users of the Rosetta API implementation don't need to maintain their own indexer to track their UTXOs.
   * @return coins
  */
  @NotNull @Valid 
  @Schema(name = "coins", description = "If a blockchain is UTXO-based, all unspent Coins owned by an account_identifier should be returned alongside the balance. It is highly recommended to populate this field so that users of the Rosetta API implementation don't need to maintain their own indexer to track their UTXOs.", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<Coin> getCoins() {
    return coins;
  }

  public void setCoins(List<Coin> coins) {
    this.coins = coins;
  }

  public AccountCoinsResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Account-based blockchains that utilize a nonce or sequence number should include that number in the metadata. This number could be unique to the identifier or global across the account address.
   * @return metadata
  */
  
  @Schema(name = "metadata", example = "{\"sequence_number\":23}", description = "Account-based blockchains that utilize a nonce or sequence number should include that number in the metadata. This number could be unique to the identifier or global across the account address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AccountCoinsResponse accountCoinsResponse = (AccountCoinsResponse) o;
    return Objects.equals(this.blockIdentifier, accountCoinsResponse.blockIdentifier) &&
        Objects.equals(this.coins, accountCoinsResponse.coins) &&
        Objects.equals(this.metadata, accountCoinsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIdentifier, coins, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCoinsResponse {\n");
    sb.append("    blockIdentifier: ").append(toIndentedString(blockIdentifier)).append("\n");
    sb.append("    coins: ").append(toIndentedString(coins)).append("\n");
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

