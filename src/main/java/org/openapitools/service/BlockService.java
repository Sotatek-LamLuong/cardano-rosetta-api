//package org.openapitools.service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.openapitools.projection.BlockProjection;
//import org.openapitools.projection.GenesisBlockProjection;
//import org.openapitools.repository.BlockChainRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Objects;
//
//@Slf4j
//@Component
//public class BlockService {
//    @Autowired
//    BlockChainRepository repository;
//    public BlockProjection findBlock(Integer number, String hash){
//        boolean searchBlockZero;
//        if(Objects.nonNull(number)){
//            searchBlockZero = (number == 1);
//        }else {
//             searchBlockZero = false;
//        }
//        if (searchBlockZero) {
//            log.info("[findBlock] Looking for genesis block");
//            GenesisBlockProjection genesis = repository.findGenesisBlock();
//            boolean isHashInvalidIfGiven = hash != null && !genesis.getHash().equals(hash);
//            if (isHashInvalidIfGiven) {
//                log.error("[findBlock] The requested block has an invalid block hash parameter");
////                throw new BlockNotFoundException();
//            }
//            if (Objects.nonNull(genesis)){
//                return repository.findBlock( null, genesis.getHash());
//            }else {
//                return repository.findBlock( null, null);
//            }
//        }
//        boolean searchLatestBlock = (Objects.isNull(hash)) && (Objects.isNull(number));
//
//        log.info("[findBlock] Do we have to look for latestBlock? " + searchLatestBlock);
//        Integer blockNumber = searchLatestBlock ? repository.findLatestBlockNumber() : number;
//        log.info("[findBlock] Looking for block with blockNumber " + blockNumber);
//        BlockProjection response = repository.findBlock(blockNumber, hash);
//        log.info("[findBlock] Block was found");
//        log.debug("[findBlock] Returning response: " + response);
//        return response;
//    }
//}
