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
@Table(name = "ada_pots")
public class AdaPot {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "block_id", nullable = false)
    private Long blockId;

/*
    TODO [JPA Buddy] create field to map the 'slot_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "slot_no", columnDefinition = "word63type(19) not null")
    private Object slotNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'epoch_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "epoch_no", columnDefinition = "word31type(10) not null")
    private Object epochNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'treasury' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "treasury", columnDefinition = "lovelace(20) not null")
    private Object treasury;
*/
/*
    TODO [JPA Buddy] create field to map the 'reserves' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "reserves", columnDefinition = "lovelace(20) not null")
    private Object reserves;
*/
/*
    TODO [JPA Buddy] create field to map the 'rewards' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "rewards", columnDefinition = "lovelace(20) not null")
    private Object rewards;
*/
/*
    TODO [JPA Buddy] create field to map the 'utxo' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "utxo", columnDefinition = "lovelace(20) not null")
    private Object utxo;
*/
/*
    TODO [JPA Buddy] create field to map the 'deposits' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "deposits", columnDefinition = "lovelace(20) not null")
    private Object deposits;
*/
/*
    TODO [JPA Buddy] create field to map the 'fees' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fees", columnDefinition = "lovelace(20) not null")
    private Object fees;
*/
}