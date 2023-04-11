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
@Table(name = "pool_update")
public class PoolUpdate {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "hash_id", nullable = false)
    private Long hashId;

    @NotNull
    @Column(name = "cert_index", nullable = false)
    private Integer certIndex;

    @NotNull
    @Column(name = "active_epoch_no", nullable = false)
    private Long activeEpochNo;

    @Column(name = "meta_id")
    private Long metaId;
    @NotNull
    @Column(name = "registered_tx_id", nullable = false)
    private Long registeredTxId;

    @NotNull
    @Column(name = "margin", nullable = false)
    private Double margin;
    @NotNull
    @Column(name = "reward_addr_id", nullable = false)
    private Long rewardAddrId;

/*
    TODO [JPA Buddy] create field to map the 'vrf_key_hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "vrf_key_hash", columnDefinition = "hash32type not null")
    private Object vrfKeyHash;
*/
/*
    TODO [JPA Buddy] create field to map the 'pledge' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "pledge", columnDefinition = "lovelace(20) not null")
    private Object pledge;
*/
/*
    TODO [JPA Buddy] create field to map the 'fixed_cost' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fixed_cost", columnDefinition = "lovelace(20) not null")
    private Object fixedCost;
*/
}