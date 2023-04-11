package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "pool_offline_data")
public class PoolOfflineDatum {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "pool_id", nullable = false)
    private Long poolId;

    @NotNull
    @Lob
    @Column(name = "ticker_name", nullable = false)
    private String tickerName;

    @NotNull
    @Column(name = "bytes", nullable = false)
    private byte[] bytes;

    @NotNull
    @Column(name = "pmr_id", nullable = false)
    private Long pmrId;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash32type not null")
    private Object hash;
*/
/*
    TODO [JPA Buddy] create field to map the 'json' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "json", columnDefinition = "jsonb not null")
    private Object json;
*/
}