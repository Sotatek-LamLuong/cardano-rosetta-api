package org.openapitools.common.enumeration;

public enum StakeAddressPrefix {
    MAIN("stake"),
    TEST("stake_test");

    private String prefix;

    StakeAddressPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}