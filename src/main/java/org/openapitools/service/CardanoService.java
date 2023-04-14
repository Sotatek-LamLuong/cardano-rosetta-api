package org.openapitools.service;

import lombok.extern.slf4j.Slf4j;
import org.openapitools.projection.EpochParamProjection;
import org.openapitools.repository.EpochParamRepository;
import org.openapitools.utils.CardanoAddressUtils;
import org.openapitools.common.enumeration.EraAddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CardanoService {
    @Autowired
    EpochParamRepository epochParamRepository;
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
    public EpochParamProjection getProtocolParameters(){
        log.info("[getProtocolParameters] About to get protocol parameters");
        return epochParamRepository.findProtocolParameters(PageRequest.of(0,1)).getContent().get(0);
    }
}
