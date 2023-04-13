package org.openapitools.repository;

import org.openapitools.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;

public interface RewardRepository extends JpaRepository<Reward, Long> {

//    @Query( "SELECT " +
//            "(" +
//            "SELECT COALESCE(SUM(r.amount), 0) " +
//            "FROM Reward r " +
//            "JOIN StakeAddress s ON s.id = r.addrId " +
//            "WHERE s.view = :stakeAddress " +
//            "AND r.spendableEpoch <= (SELECT b.epochNo FROM Block b WHERE b.hash = :blockHash)" +
//            ") - (" +
//            "SELECT COALESCE(SUM(w.amount), 0) " +
//            "FROM Withdrawal w " +
//            "JOIN Tx tx on tx.id = w.txId " +
//            "AND tx.validContract = TRUE " +
//            "AND tx.blockId <= (SELECT b2.id FROM Block b2 WHERE b2.hash = :blockHash)" +
//            "JOIN StakeAddress s ON s.id = w.addrId " +
//            "WHERE s.view = :stakeAddress " +
//            ") AS balance")
//    String findBalanceByAddressAndBlock(@Param("stakeAddress") String stakeAddress,
//                                        @Param("blockHash") String blockHash);

    @Query(
            "SELECT COALESCE(SUM(r.amount), 0) " +
            "FROM Reward r " +
            "JOIN StakeAddress s ON s.id = r.addrId " +
            "WHERE s.view = :stakeAddress " +
            "AND r.spendableEpoch <= (SELECT b.epochNo FROM Block b WHERE b.hash = :blockHash)"
    )
    String findBalanceByAddressAndBlockSub1(@Param("blockHash") String blockHash);
    @Query("SELECT COALESCE(SUM(w.amount), 0) " +
            "FROM Withdrawal w " +
            "JOIN Tx tx on tx.id = w.txId " +
            "AND tx.validContract = TRUE " +
            "AND tx.blockId <= (SELECT b2.id FROM Block b2 WHERE b2.hash = :blockHash)" +
            "JOIN StakeAddress s ON s.id = w.addrId " +
            "WHERE s.view = :stakeAddress ")
    String findBalanceByAddressAndBlockSub2(@Param("stakeAddress") String stakeAddress,
                                            @Param("blockHash") String blockHash);

}