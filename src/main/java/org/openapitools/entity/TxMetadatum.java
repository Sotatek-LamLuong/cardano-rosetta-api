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
@Table(name = "tx_metadata")
public class TxMetadatum {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "bytes", nullable = false)
    private byte[] bytes;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

/*
    TODO [JPA Buddy] create field to map the 'key' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "key", columnDefinition = "word64type(20) not null")
    private Object key;
*/
/*
    TODO [JPA Buddy] create field to map the 'json' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "json", columnDefinition = "jsonb")
    private Object json;
*/
}