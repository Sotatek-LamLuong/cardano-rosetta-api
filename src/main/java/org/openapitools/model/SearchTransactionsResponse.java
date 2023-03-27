package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BlockTransaction;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SearchTransactionsResponse contains an ordered collection of BlockTransactions that match the query in SearchTransactionsRequest. These BlockTransactions are sorted from most recent block to oldest block.
 */

@Schema(name = "SearchTransactionsResponse", description = "SearchTransactionsResponse contains an ordered collection of BlockTransactions that match the query in SearchTransactionsRequest. These BlockTransactions are sorted from most recent block to oldest block.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public class SearchTransactionsResponse {

  @JsonProperty("transactions")
  @Valid
  private List<BlockTransaction> transactions = new ArrayList<>();

  @JsonProperty("total_count")
  private Long totalCount;

  @JsonProperty("next_offset")
  private Long nextOffset;

  public SearchTransactionsResponse transactions(List<BlockTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public SearchTransactionsResponse addTransactionsItem(BlockTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * transactions is an array of BlockTransactions sorted by most recent BlockIdentifier (meaning that transactions in recent blocks appear first). If there are many transactions for a particular search, transactions may not contain all matching transactions. It is up to the caller to paginate these transactions using the max_block field.
   * @return transactions
  */
  @NotNull @Valid 
  @Schema(name = "transactions", description = "transactions is an array of BlockTransactions sorted by most recent BlockIdentifier (meaning that transactions in recent blocks appear first). If there are many transactions for a particular search, transactions may not contain all matching transactions. It is up to the caller to paginate these transactions using the max_block field.", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<BlockTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<BlockTransaction> transactions) {
    this.transactions = transactions;
  }

  public SearchTransactionsResponse totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total_count is the number of results for a given search. Callers typically use this value to concurrently fetch results by offset or to display a virtual page number associated with results.
   * minimum: 0
   * @return totalCount
  */
  @NotNull @Min(0L) 
  @Schema(name = "total_count", example = "5", description = "total_count is the number of results for a given search. Callers typically use this value to concurrently fetch results by offset or to display a virtual page number associated with results.", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public SearchTransactionsResponse nextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  /**
   * next_offset is the next offset to use when paginating through transaction results. If this field is not populated, there are no more transactions to query.
   * minimum: 0
   * @return nextOffset
  */
  @Min(0L) 
  @Schema(name = "next_offset", example = "5", description = "next_offset is the next offset to use when paginating through transaction results. If this field is not populated, there are no more transactions to query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTransactionsResponse searchTransactionsResponse = (SearchTransactionsResponse) o;
    return Objects.equals(this.transactions, searchTransactionsResponse.transactions) &&
        Objects.equals(this.totalCount, searchTransactionsResponse.totalCount) &&
        Objects.equals(this.nextOffset, searchTransactionsResponse.nextOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, totalCount, nextOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTransactionsResponse {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
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

