package org.openapitools.repository;

import org.openapitools.entity.EpochParam;
import org.openapitools.projection.EpochParamProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EpochParamRepository extends JpaRepository<EpochParam, Long> {
    @Query("SELECT e.coinsPerUtxoSize, e.maxTxSize, e.maxValSize, e.keyDeposit, e.maxCollateralInputs, " +
            "e.minFeeA, e.minFeeB, e.minPoolCost, e.poolDeposit, e.protocolMajor " +
            "FROM EpochParam e " +
            "ORDER BY e.id DESC ")
    Page<EpochParamProjection> findProtocolParameters(Pageable pageable);
}