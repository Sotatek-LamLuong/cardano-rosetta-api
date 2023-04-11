package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ExemptionType is used to indicate if the live balance for an account subject to a BalanceExemption could increase above, decrease below, or equal the computed balance. * greater_or_equal: The live balance may increase above or equal the computed balance. This typically   occurs with staking rewards that accrue on each block. * less_or_equal: The live balance may decrease below or equal the computed balance. This typically   occurs as balance moves from locked to spendable on a vesting account. * dynamic: The live balance may increase above, decrease below, or equal the computed balance. This   typically occurs with tokens that have a dynamic supply.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public enum ExemptionType {
  
  GREATER_OR_EQUAL("greater_or_equal"),
  
  LESS_OR_EQUAL("less_or_equal"),
  
  DYNAMIC("dynamic");

  private String value;

  ExemptionType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExemptionType fromValue(String value) {
    for (ExemptionType b : ExemptionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

