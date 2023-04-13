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
@Table(name = "redeemer")
public class Redeemer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fee", precision = 20)
    private BigDecimal fee;

    @NotNull
    @Column(name = "index", nullable = false)
    private Integer index;

    @Column(name = "script_hash")
    private byte[] scriptHash;

    @NotNull
    @Column(name = "unit_mem", nullable = false)
    private Long unitMem;

    @NotNull
    @Column(name = "unit_steps", nullable = false)
    private Long unitSteps;

    @NotNull
    @Column(name = "redeemer_data_id", nullable = false)
    private Long redeemerDataId;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
    @Column(name = "is_deleted")
    private Boolean isDeleted;

/*
    TODO [JPA Buddy] create field to map the 'purpose' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "purpose", columnDefinition = "scriptpurposetype not null")
    private Object purpose;
*/
}