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
@Table(name = "script")
public class Script {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

    @Column(name = "bytes")
    private byte[] bytes;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash28type not null")
    private Object hash;
*/
/*
    TODO [JPA Buddy] create field to map the 'type' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "type", columnDefinition = "scripttype not null")
    private Object type;
*/
/*
    TODO [JPA Buddy] create field to map the 'json' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "json", columnDefinition = "jsonb")
    private Object json;
*/
/*
    TODO [JPA Buddy] create field to map the 'serialised_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "serialised_size", columnDefinition = "word31type(10)")
    private Object serialisedSize;
*/
}