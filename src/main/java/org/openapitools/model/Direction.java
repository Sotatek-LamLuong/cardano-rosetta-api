package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Used by RelatedTransaction to indicate the direction of the relation (i.e. cross-shard/cross-network sends may reference `backward` to an earlier transaction and async execution may reference `forward`). Can be used to indicate if a transaction relation is from child to parent or the reverse.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-21T15:54:41.273447600+07:00[Asia/Bangkok]")
public enum Direction {
  
  FORWARD("forward"),
  
  BACKWARD("backward");

  private String value;

  Direction(String value) {
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
  public static Direction fromValue(String value) {
    for (Direction b : Direction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

