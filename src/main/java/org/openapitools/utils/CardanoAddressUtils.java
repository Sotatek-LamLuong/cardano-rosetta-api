package org.openapitools.utils;


import com.bloxbean.cardano.client.address.Address;
import com.bloxbean.cardano.client.address.ByronAddress;
import org.openapitools.common.constants.Constants;
import org.openapitools.common.enumeration.EraAddressType;
import org.openapitools.common.enumeration.StakeAddressPrefix;

import java.util.Arrays;

public class CardanoAddressUtils {
    public static EraAddressType getEraAddressType(String address) {
        if (address == null)
            return null;

        if (address.startsWith("addr") || address.startsWith("stake")) { //Shelley address
            Address addressObj = new Address(address);
            return EraAddressType.SHELLEY;
        } else { //Try for byron address
            ByronAddress byronAddress = new ByronAddress(address);
            return EraAddressType.BYRON;
        }

    }

    public static boolean isStakeAddress(String address) {
        String addressPrefix = address.substring(0, Constants.PREFIX_LENGTH);
        String[] types = {StakeAddressPrefix.MAIN.toString(), StakeAddressPrefix.TEST.toString()};

        return Arrays.stream(types)
                .anyMatch(type -> addressPrefix.contains(type));
    }
}
