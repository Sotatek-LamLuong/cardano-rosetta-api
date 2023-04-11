package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "pool_metadata_ref")
public class PoolMetadataRef {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "pool_id", nullable = false)
    private Long poolId;

    @NotNull
    @Lob
    @Column(name = "url", nullable = false)
    private String url;

    @NotNull
    @Column(name = "registered_tx_id", nullable = false)
    private Long registeredTxId;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash32type not null")
    private Object hash;
*/
}