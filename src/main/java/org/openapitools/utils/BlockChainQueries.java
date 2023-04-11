package org.openapitools.utils;

public class BlockChainQueries {
    public static final String findGenesisBlock = "SELECT hash, block_no as index " +
            "FROM block " +
            "WHERE previous_id IS NULL LIMIT 1";
    public static final String findLatestBlockNumber =
            "SELECT block_no AS blockHeight FROM block " +
                    "WHERE block_no IS NOT NULL " +
                    "ORDER BY block_no " +
                    "DESC LIMIT 1";

    public static String findBlock(Integer blockNumber, String blockHash) {
        return "SELECT " +
                "  b.hash as hash, " +
                "  b.block_no as number, " +
                "  (b.time at time zone 'utc') as \"createdAt\", " +
                "  CASE " +
                "    WHEN b2.block_no IS NOT NULL THEN b2.block_no " +
                "    WHEN b3.block_no IS NOT NULL THEN b3.block_no " +
                "    ELSE 0 " +
                "  END AS \"previousBlockNumber\", " +
                "  CASE " +
                "    WHEN b2.block_no IS NOT NULL THEN b2.hash " +
                "    WHEN b3.block_no IS NOT NULL THEN b3.hash " +
                "    WHEN b.block_no = 1 THEN encode(b3.hash, 'hex') -- block 1 " +
                "    ELSE b.hash -- genesis " +
                "  END AS \"previousBlockHash\", " +
                "  b.tx_count as \"transactionsCount\", " +
                "  s.description as \"createdBy\", " +
                "  b.size as size, " +
                "  b.epoch_no as \"epochNo\", " +
                "  b.slot_no as \"slotNo\" " +
                "FROM " +
                "  block b " +
                "  LEFT JOIN slot_leader s ON b.slot_leader_id = s.id " +
                "  LEFT JOIN block b2 ON b.previous_id = b2.id " +
                "  LEFT JOIN block b3 ON b2.previous_id = b3.id " +
                "WHERE " +
                "  " + (blockNumber != null ? "b.block_no = ?" : "$1 = $1") + " AND " +
                "  " + (blockHash != null ? "b.hash = ?" : "$2 = $2") + " " +
                "LIMIT 1";
    }
}
