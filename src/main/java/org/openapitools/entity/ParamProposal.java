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
@Table(name = "param_proposal")
public class ParamProposal {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "influence")
    private Double influence;

    @Column(name = "monetary_expand_rate")
    private Double monetaryExpandRate;

    @Column(name = "treasury_growth_rate")
    private Double treasuryGrowthRate;

    @Column(name = "decentralisation")
    private Double decentralisation;

    @Column(name = "cost_model_id")
    private Long costModelId;

    @Column(name = "price_mem")
    private Double priceMem;

    @Column(name = "price_step")
    private Double priceStep;

    @NotNull
    @Column(name = "registered_tx_id", nullable = false)
    private Long registeredTxId;

/*
    TODO [JPA Buddy] create field to map the 'epoch_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "epoch_no", columnDefinition = "word31type(10) not null")
    private Object epochNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'key' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "key", columnDefinition = "hash28type not null")
    private Object key;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_fee_a' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_fee_a", columnDefinition = "word64type(20)")
    private Object minFeeA;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_fee_b' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_fee_b", columnDefinition = "word64type(20)")
    private Object minFeeB;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_block_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_block_size", columnDefinition = "word64type(20)")
    private Object maxBlockSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_tx_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_tx_size", columnDefinition = "word64type(20)")
    private Object maxTxSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_bh_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_bh_size", columnDefinition = "word64type(20)")
    private Object maxBhSize;
*/
/*
    TODO [JPA Buddy] create field to map the 'key_deposit' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "key_deposit", columnDefinition = "lovelace(20)")
    private Object keyDeposit;
*/
/*
    TODO [JPA Buddy] create field to map the 'pool_deposit' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "pool_deposit", columnDefinition = "lovelace(20)")
    private Object poolDeposit;
*/
/*
    TODO [JPA Buddy] create field to map the 'max_epoch' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "max_epoch", columnDefinition = "word64type(20)")
    private Object maxEpoch;
*/
/*
    TODO [JPA Buddy] create field to map the 'optimal_pool_count' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "optimal_pool_count", columnDefinition = "word64type(20)")
    private Object optimalPoolCount;
*/
/*
    TODO [JPA Buddy] create field to map the 'entropy' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "entropy", columnDefinition = "hash32type")
    private Object entropy;
*/
/*
    TODO [JPA Buddy] create field to map the 'protocol_major' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "protocol_major", columnDefinition = "word31type(10)")
    private Object protocolMajor;
*/
/*
    TODO [JPA Buddy] create field to map the 'protocol_minor' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "protocol_minor", columnDefinition = "word31type(10)")
    private Object protocolMinor;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_utxo_value' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_utxo_value", columnDefinition = "lovelace(20)")
    private Object minUtxoValue;
*/
/*
    TODO [JPA Buddy] create field to map the 'min_pool_cost' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "min_pool_cost", columnDefinition = "lovelace(20)")
    private Object minPoolCost;
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
    TODO [JPA Buddy] create field to map the 'coins_per_utxo_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "coins_per_utxo_size", columnDefinition = "lovelace(20)")
    private Object coinsPerUtxoSize;
*/
}