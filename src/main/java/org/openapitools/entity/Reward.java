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
@Table(name = "reward")
public class Reward {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "addr_id", nullable = false)
    private Long addrId;

    @NotNull
    @Column(name = "spendable_epoch", nullable = false)
    private Long spendableEpoch;

    @NotNull
    @Column(name = "earned_epoch", nullable = false)
    private Long earnedEpoch;
    @Column(name = "pool_id")
    private Long poolId;

/*
    TODO [JPA Buddy] create field to map the 'type' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "type", columnDefinition = "rewardtype not null")
    private Object type;
*/
/*
    TODO [JPA Buddy] create field to map the 'amount' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "amount", columnDefinition = "lovelace(20) not null")
    private Object amount;
*/
}