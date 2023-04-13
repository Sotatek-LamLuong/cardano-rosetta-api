package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "redeemer_data")
public class RedeemerDatum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "bytes", nullable = false)
    private byte[] bytes;

    @NotNull
    @Column(name = "hash", nullable = false)
    private byte[] hash;

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
    TODO [JPA Buddy] create field to map the 'value' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "value", columnDefinition = "jsonb")
    private Object value;
*/
}