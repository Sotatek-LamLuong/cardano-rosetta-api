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
@Table(name = "tx")
public class Tx {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "block_index", nullable = false)
    private Long blockIndex;

    @NotNull
    @Column(name = "deposit", nullable = false)
    private Long deposit;

    @NotNull
    @Column(name = "fee", nullable = false, precision = 20)
    private BigDecimal fee;

    @NotNull
    @Column(name = "hash", nullable = false)
    private byte[] hash;

    @Column(name = "invalid_before", precision = 20)
    private BigDecimal invalidBefore;

    @Column(name = "invalid_hereafter", precision = 20)
    private BigDecimal invalidHereafter;

    @NotNull
    @Column(name = "out_sum", nullable = false, precision = 20)
    private BigDecimal outSum;

    @NotNull
    @Column(name = "script_size", nullable = false)
    private Integer scriptSize;

    @NotNull
    @Column(name = "size", nullable = false)
    private Integer size;

    @NotNull
    @Column(name = "valid_contract", nullable = false)
    private Boolean validContract = false;

    @NotNull
    @Column(name = "block_id", nullable = false)
    private Long blockId;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}