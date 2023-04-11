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
@Table(name = "redeemer_data")
public class RedeemerDatum {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;
    @NotNull
    @Column(name = "bytes", nullable = false)
    private byte[] bytes;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash32type not null")
    private Object hash;
*/
/*
    TODO [JPA Buddy] create field to map the 'value' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "value", columnDefinition = "jsonb")
    private Object value;
*/
}