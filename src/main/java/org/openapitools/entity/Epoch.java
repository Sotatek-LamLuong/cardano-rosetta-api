package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "epoch")
public class Epoch {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "start_time", nullable = false)
    private Instant startTime;

    @NotNull
    @Column(name = "end_time", nullable = false)
    private Instant endTime;

/*
    TODO [JPA Buddy] create field to map the 'out_sum' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "out_sum", columnDefinition = "word128type(39) not null")
    private Object outSum;
*/
/*
    TODO [JPA Buddy] create field to map the 'fees' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fees", columnDefinition = "lovelace(20) not null")
    private Object fees;
*/
/*
    TODO [JPA Buddy] create field to map the 'tx_count' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tx_count", columnDefinition = "word31type(10) not null")
    private Object txCount;
*/
/*
    TODO [JPA Buddy] create field to map the 'blk_count' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "blk_count", columnDefinition = "word31type(10) not null")
    private Object blkCount;
*/
/*
    TODO [JPA Buddy] create field to map the 'no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "no", columnDefinition = "word31type(10) not null")
    private Object no;
*/
}