package org.openapitools.service;

import org.openapitools.utils.CardanoAddressUtils;
import org.openapitools.common.enumeration.EraAddressType;
import org.springframework.stereotype.Component;

@Component
public class CardanoService {
    public EraAddressType getEraAddressType(String address){
        try {
            return CardanoAddressUtils.getEraAddressType(address);
        }catch (Exception e){
            return null;
        }
    }
    public boolean isStakeAddress(String address) {
        return CardanoAddressUtils.isStakeAddress(address);
    }
}
