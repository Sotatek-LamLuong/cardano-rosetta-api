package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "epoch_param")
public class EpochParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "coins_per_utxo_size", precision = 20)
    private BigDecimal coinsPerUtxoSize;

    @Column(name = "collateral_percent")
    private Integer collateralPercent;

    @NotNull
    @Column(name = "decentralisation", nullable = false)
    private Double decentralisation;

    @NotNull
    @Column(name = "epoch_no", nullable = false)
    private Integer epochNo;

    @Column(name = "extra_entropy")
    private byte[] extraEntropy;

    @NotNull
    @Column(name = "influence", nullable = false)
    private Double influence;

    @NotNull
    @Column(name = "key_deposit", nullable = false, precision = 20)
    private BigDecimal keyDeposit;

    @NotNull
    @Column(name = "max_bh_size", nullable = false)
    private Integer maxBhSize;

    @Column(name = "max_block_ex_mem", precision = 20)
    private BigDecimal maxBlockExMem;

    @Column(name = "max_block_ex_steps", precision = 20)
    private BigDecimal maxBlockExSteps;

    @NotNull
    @Column(name = "max_block_size", nullable = false)
    private Integer maxBlockSize;

    @Column(name = "max_collateral_inputs")
    private Integer maxCollateralInputs;

    @NotNull
    @Column(name = "max_epoch", nullable = false)
    private Integer maxEpoch;

    @Column(name = "max_tx_ex_mem", precision = 20)
    private BigDecimal maxTxExMem;

    @Column(name = "max_tx_ex_steps", precision = 20)
    private BigDecimal maxTxExSteps;

    @NotNull
    @Column(name = "max_tx_size", nullable = false)
    private Integer maxTxSize;

    @Column(name = "max_val_size", precision = 20)
    private BigDecimal maxValSize;

    @NotNull
    @Column(name = "min_fee_a", nullable = false)
    private Integer minFeeA;

    @NotNull
    @Column(name = "min_fee_b", nullable = false)
    private Integer minFeeB;

    @NotNull
    @Column(name = "min_pool_cost", nullable = false, precision = 20)
    private BigDecimal minPoolCost;

    @NotNull
    @Column(name = "min_utxo_value", nullable = false, precision = 20)
    private BigDecimal minUtxoValue;

    @NotNull
    @Column(name = "monetary_expand_rate", nullable = false)
    private Double monetaryExpandRate;

    @Column(name = "nonce")
    private byte[] nonce;

    @NotNull
    @Column(name = "optimal_pool_count", nullable = false)
    private Integer optimalPoolCount;

    @NotNull
    @Column(name = "pool_deposit", nullable = false, precision = 20)
    private BigDecimal poolDeposit;

    @Column(name = "price_mem")
    private Double priceMem;

    @Column(name = "price_step")
    private Double priceStep;

    @NotNull
    @Column(name = "protocol_major", nullable = false)
    private Integer protocolMajor;

    @NotNull
    @Column(name = "protocol_minor", nullable = false)
    private Integer protocolMinor;

    @NotNull
    @Column(name = "treasury_growth_rate", nullable = false)
    private Double treasuryGrowthRate;

    @NotNull
    @Column(name = "block_id", nullable = false)
    private Long blockId;

    @Column(name = "cost_model_id")
    private Long costModelId;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}