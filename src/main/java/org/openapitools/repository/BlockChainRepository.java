package org.openapitools.repository;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.projection.BlockProjection;
import org.openapitools.model.BlockIdentifier;
import org.openapitools.projection.GenesisBlockProjection;
import org.openapitools.utils.BlockChainQueries;
import org.openapitools.utils.Formatters;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.openapitools.utils.Formatters.hexFormatter;

@Slf4j
@Component
@NoArgsConstructor
public class BlockChainRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public GenesisBlockProjection findGenesisBlock(){

        log.debug("[findGenesisBlock] About to run findGenesisBlock query");
        Query query = entityManager.createNativeQuery(BlockChainQueries.findGenesisBlock, BlockIdentifier.class);
        List<BlockIdentifier> result = query.getResultList();
        if (result.size() == 1) {
            log.debug("[findGenesisBlock] Genesis block was found");
            BlockIdentifier genesisBlock = result.get(0);
            genesisBlock.setHash(hexFormatter(genesisBlock.getHash()));
            return null;
        } else {
            log.debug("[findGenesisBlock] Genesis block was not found");
            return null;
        }
    }

//    public BlockProjection findBlock(Integer blockNumber, String blockHash) {
//        String queryString = BlockChainQueries.findBlock(blockNumber, blockHash);
//        log.debug("[findBlock] Parameters received for run query blockNumber: " + blockNumber + ", blockHash: " + blockHash);
//        List<Object> parameters = new ArrayList<>();
//        if (blockNumber != null) {
//            parameters.add(blockNumber);
//        } else {
//            parameters.add(true);
//        }
//        if (blockHash != null) {
//            parameters.add(Formatters.hexFormatter(blockHash));
//        } else {
//            parameters.add(true);
//        }
//        Query query =  entityManager.createNativeQuery(queryString, Object[].class);
//        for (int i = 1; i <= parameters.size(); i++) {
//            query.setParameter(i, parameters.get(i - 1));
//        }
//        List<Object[]> resultList = query.getResultList();
//        if (resultList.size() == 1) {
//            log.debug("[findBlock] Block found!");
//            Object[] row = resultList.get(0);
//            int number = (int) row[0];
//            String hash = hexFormatter((String) row[1]);
//            long createdAt = ((Timestamp) row[2]).getTime();
//            String previousBlockHash = hexFormatter((String) row[3]);
//            int previousBlockNumber = (int) row[4];
//            int transactionsCount = (int) row[5];
//            String createdBy = (String) row[6];
//            int size = (int) row[7];
//            int epochNo = (int) row[8];
//            String slotNo = (String) row[9];
//            return new BlockProjection(number, hash, createdAt, previousBlockHash, previousBlockNumber, transactionsCount, createdBy, size, epochNo, slotNo);
//        } else {
//            log.debug("[findBlock] No block was found");
//            return null;
//        }
//    }

    public Integer findLatestBlockNumber() {
        log.debug("[findLatestBlockNumber] About to run findLatestBlockNumber query");
        Query query = entityManager.createNativeQuery(BlockChainQueries.findLatestBlockNumber);
        Integer latestBlockNumber = (Integer) query.getResultList().get(0);
        log.debug("[findLatestBlockNumber] Latest block number is " + latestBlockNumber);
        return latestBlockNumber;
    }
}
