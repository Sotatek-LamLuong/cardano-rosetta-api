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
@Table(name = "tx")
public class Tx {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "block_id", nullable = false)
    private Long blockId;
    @NotNull
    @Column(name = "deposit", nullable = false)
    private Long deposit;

    @NotNull
    @Column(name = "valid_contract", nullable = false)
    private Boolean validContract = false;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash32type not null")
    private Object hash;
*/
/*
    TODO [JPA Buddy] create field to map the 'block_index' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "block_index", columnDefinition = "word31type(10) not null")
    private Object blockIndex;
*/
/*
    TODO [JPA Buddy] create field to map the 'out_sum' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "out_sum", columnDefinition = "lovelace(20) not null")
    private Object outSum;
*/
/*
    TODO [JPA Buddy] create field to map the 'fee' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fee", columnDefinition = "lovelace(20) not null")
    private Object fee;
*/
/*
    TODO [JPA Buddy] create field to map the 'size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "size", columnDefinition = "word31type(10) not null")
    private Object size;
*/
/*
    TODO [JPA Buddy] create field to map the 'invalid_before' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "invalid_before", columnDefinition = "word64type(20)")
    private Object invalidBefore;
*/
/*
    TODO [JPA Buddy] create field to map the 'invalid_hereafter' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "invalid_hereafter", columnDefinition = "word64type(20)")
    private Object invalidHereafter;
*/
/*
    TODO [JPA Buddy] create field to map the 'script_size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "script_size", columnDefinition = "word31type(10) not null")
    private Object scriptSize;
*/
}