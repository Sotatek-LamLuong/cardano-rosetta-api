//package org.openapitools.repository;
//
//import org.openapitools.projection.GenesisBlockProjection;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//public interface BlockRepository extends JpaRepository<Block, Long> {
//    @Query("SELECT hash, block_no as index " +
//            "FROM Block " +
//            "WHERE previous_id IS NULL LIMIT 1")
//    public GenesisBlockProjection findGenesisBlock();
//}