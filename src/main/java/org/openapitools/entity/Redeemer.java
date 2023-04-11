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
@Table(name = "redeemer")
public class Redeemer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

    @NotNull
    @Column(name = "redeemer_data_id", nullable = false)
    private Long redeemerDataId;

/*
    TODO [JPA Buddy] create field to map the 'unit_mem' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "unit_mem", columnDefinition = "word63type(19) not null")
    private Object unitMem;
*/
/*
    TODO [JPA Buddy] create field to map the 'unit_steps' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "unit_steps", columnDefinition = "word63type(19) not null")
    private Object unitSteps;
*/
/*
    TODO [JPA Buddy] create field to map the 'fee' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fee", columnDefinition = "lovelace(20)")
    private Object fee;
*/
/*
    TODO [JPA Buddy] create field to map the 'purpose' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "purpose", columnDefinition = "scriptpurposetype not null")
    private Object purpose;
*/
/*
    TODO [JPA Buddy] create field to map the 'index' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "index", columnDefinition = "word31type(10) not null")
    private Object index;
*/
/*
    TODO [JPA Buddy] create field to map the 'script_hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "script_hash", columnDefinition = "hash28type")
    private Object scriptHash;
*/
}