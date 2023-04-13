package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;
import org.openapitools.common.enumeration.RewardType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "reward")
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "amount", nullable = false, precision = 20)
    private BigDecimal amount;

    @NotNull
    @Column(name = "earned_epoch", nullable = false)
    private Long earnedEpoch;

    @NotNull
    @Column(name = "spendable_epoch", nullable = false)
    private Long spendableEpoch;

    @NotNull
    @Column(name = "addr_id", nullable = false)
    private Long addrId;

    @Column(name = "pool_id")
    private Long poolId;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
    @Column(name = "is_deleted")
    private Boolean isDeleted;


    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private RewardType type;

}