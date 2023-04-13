package org.openapitools.addedenum;

import com.fasterxml.jackson.annotation.JsonValue;

public enum NetworkIdentifierEnum {
    CARDANO_MAINNET_NETWORK(1,764824073L),
    CARDANO_TESTNET_NETWORK(0,1097911063L);
    private int value;
    private long protocolMagic;

    NetworkIdentifierEnum(int value,long protocolMagic) {
        this.value = value;
        this.protocolMagic = protocolMagic;
    }
    NetworkIdentifierEnum() {
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @JsonValue
    public long getProtocolMagic() {
        return protocolMagic;
    }


}
