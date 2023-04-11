package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "epoch_param")
public class EpochParam {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "influence", nullable = false)
    private Double influence;

    @NotNull
    @Column(name = "monetary_expand_rate", nullable = false)
    private Double monetaryExpandRate;

    @NotNull
    @Column(name = "treasury_growth_rate", nullable = false)
    private Double treasuryGrowthRate;

    @NotNull
    @Column(name = "decentralisation", nullable = false)
    private Double decentralisation;

    @Column(name = "cost_model_id")
    private Long costModelId;

    @Column(name = "price_mem")
    private Double priceMem;

    @Column(name = "price_step")
    private Double priceStep;

    @NotNull
    @Column(name = "block_id", nullable = false)
    private Long blockId;

/*
    TODO [JPA Buddy] create field to map the 'epoch_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "epoch_no", columnDefinition = "word31type(10) not null")
    private Object epochNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_fee_a' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_fee_a", columnDefinition = "word31type(10) not null")
    private Object minFeeA;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_fee_b' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_fee_b", columnDefinition = "word31type(10) not null")
    private Object minFeeB;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_block_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_block_size", columnDefinition = "word31type(10) not null")
    private Object maxBlockSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_tx_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_tx_size", columnDefinition = "word31type(10) not null")
    private Object maxTxSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_bh_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_bh_size", columnDefinition = "word31type(10) not null")
    private Object maxBhSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'key_deposit' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "key_deposit", columnDefinition = "lovelace(20) not null")
    private Object keyDeposit;
*/
/*
    TODO [JPA Buddy] create field to map the 'pool_deposit' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "pool_deposit", columnDefinition = "lovelace(20) not null")
    private Object poolDeposit;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_epoch' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_epoch", columnDefinition = "word31type(10) not null")
    private Object maxEpoch;
*/
/*
    TODO [JPA Buddy] create field to map the 'optimal_pool_count' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "optimal_pool_count", columnDefinition = "word31type(10) not null")
    private Object optimalPoolCount;
*/
/*
    TODO [JPA Buddy] create field to map the 'protocol_major' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "protocol_major", columnDefinition = "word31type(10) not null")
    private Object protocolMajor;
*/
/*
    TODO [JPA Buddy] create field to map the 'protocol_minor' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "protocol_minor", columnDefinition = "word31type(10) not null")
    private Object protocolMinor;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_utxo_value' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_utxo_value", columnDefinition = "lovelace(20) not null")
    private Object minUtxoValue;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_pool_cost' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_pool_cost", columnDefinition = "lovelace(20) not null")
    private Object minPoolCost;
*/
/*
    TODO [JPA Buddy] create field to map the 'nonce' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "nonce", columnDefinition = "hash32type")
    private Object nonce;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_tx_ex_mem' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_tx_ex_mem", columnDefinition = "word64type(20)")
    private Object maxTxExMem;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_tx_ex_steps' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_tx_ex_steps", columnDefinition = "word64type(20)")
    private Object maxTxExSteps;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_block_ex_mem' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_block_ex_mem", columnDefinition = "word64type(20)")
    private Object maxBlockExMem;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_block_ex_steps' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_block_ex_steps", columnDefinition = "word64type(20)")
    private Object maxBlockExSteps;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_val_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_val_size", columnDefinition = "word64type(20)")
    private Object maxValSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'collateral_percent' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "collateral_percent", columnDefinition = "word31type(10)")
    private Object collateralPercent;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_collateral_inputs' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_collateral_inputs", columnDefinition = "word31type(10)")
    private Object maxCollateralInputs;
*/
/*
    TODO [JPA Buddy] create field to map the 'extra_entropy' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "extra_entropy", columnDefinition = "hash32type")
    private Object extraEntropy;
*/
/*
    TODO [JPA Buddy] create field to map the 'coins_per_utxo_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "coins_per_utxo_size", columnDefinition = "lovelace(20)")
    private Object coinsPerUtxoSize;
*/
}