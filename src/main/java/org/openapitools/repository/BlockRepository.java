package org.openapitools.repository;

import org.openapitools.entity.Block;
import org.openapitools.projection.BlockProjection;
import org.openapitools.projection.GenesisBlockProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {
    @Query(value =
            "SELECT hash as hash, blockNo as index " +
            "FROM Block " +
            "WHERE previousId IS NULL",
            countQuery = "SELECT count(hash) FROM Block WHERE previousId IS NULL")
    Page<GenesisBlockProjection> findGenesisBlock(Pageable pageable);
    @Query("SELECT " +
            "b.hash AS hash, " +
            "b.blockNo AS number, " +
            "b.time AS createdAt, " +
            "CASE " +
            "   WHEN b2.blockNo IS NOT NULL THEN b2.blockNo " +
            "   WHEN b3.blockNo IS NOT NULL THEN b3.blockNo " +
            "ELSE 0 " +
            "END AS previousBlockNumber, " +
            "CASE " +
            "   WHEN b2.blockNo IS NOT NULL THEN b2.hash " +
            "   WHEN b3.blockNo IS NOT NULL THEN b3.hash " +
            "   WHEN b.blockNo = 1 THEN b3.hash " + // block 1
            "ELSE b.hash " + // genesis
            "END AS previousBlockHash, " +
            "b.txCount AS transactionsCount, " +
            "s.description AS createdBy, " +
            "b.size AS size, " +
            "b.epochNo AS epochNo, " +
            "b.slotNo AS slotNo " +
            "FROM " +
            "Block b " +
            "LEFT JOIN SlotLeader s ON b.slotLeaderId = s.id " +
            "LEFT JOIN Block b2 ON b.previousId = b2.id " +
            "LEFT JOIN Block b3 ON b2.previousId = b3.id " +
            "WHERE (:blockNumber IS NULL OR b.blockNo = :blockNumber)  " +
            "AND (:blockHash IS NULL OR b.hash = :blockHash)")
    BlockProjection findBlock(@Param("blockNumber") Long blockNumber,
                              @Param("blockHash") String blockHash);
    @Query("SELECT blockNo  FROM Block  " +
            "WHERE blockNo IS NOT NULL ORDER BY blockNo DESC")
    Page<Long> findLatestBlockNumber(Pageable pageable);
}