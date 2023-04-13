package org.openapitools.service;

import lombok.extern.slf4j.Slf4j;
import org.openapitools.projection.BlockProjection;
import org.openapitools.projection.GenesisBlockProjection;
import org.openapitools.repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
public class BlockService {
    @Autowired
    BlockRepository blockRepository;
    public BlockProjection findBlock(Integer number, String hash){
        boolean searchBlockZero;
        if(Objects.nonNull(number)){
            searchBlockZero = (number == 1);
        }else {
             searchBlockZero = false;
        }
        if (searchBlockZero) {
            log.info("[findBlock] Looking for genesis block");
            GenesisBlockProjection genesis = blockRepository.findGenesisBlock(
                    PageRequest.of(0,1))
                    .getContent()
                    .get(0);
            boolean isHashInvalidIfGiven = hash != null && !genesis.getHash().equals(hash);
            if (isHashInvalidIfGiven) {
                log.error("[findBlock] The requested block has an invalid block hash parameter");
//                throw new BlockNotFoundException();
            }
            if (Objects.nonNull(genesis)){
                return blockRepository.findBlock( null, genesis.getHash());
            }else {
                return blockRepository.findBlock( null, null);
            }
        }
        boolean searchLatestBlock = (Objects.isNull(hash)) && (Objects.isNull(number));

        log.info("[findBlock] Do we have to look for latestBlock? " + searchLatestBlock);
        Long blockNumber = searchLatestBlock ? blockRepository.findLatestBlockNumber(PageRequest.of(0,1)).getContent().get(0) : number;
        log.info("[findBlock] Looking for block with blockNumber " + blockNumber);
        BlockProjection response = blockRepository.findBlock(blockNumber, hash);
        log.info("[findBlock] Block was found");
        log.debug("[findBlock] Returning response: " + response);
        return response;
    }
}
