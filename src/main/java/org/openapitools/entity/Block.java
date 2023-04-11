package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "block")
public class Block {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "previous_id")
    private Long previousId;

    @NotNull
    @Column(name = "slot_leader_id", nullable = false)
    private Long slotLeaderId;

    @NotNull
    @Column(name = "\"time\"", nullable = false)
    private Instant time;

    @NotNull
    @Column(name = "tx_count", nullable = false)
    private Long txCount;

    @Lob
    @Column(name = "vrf_key")
    private String vrfKey;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash32type not null")
    private Object hash;
*/
/*
    TODO [JPA Buddy] create field to map the 'epoch_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "epoch_no", columnDefinition = "word31type(10)")
    private Object epochNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'slot_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "slot_no", columnDefinition = "word63type(19)")
    private Object slotNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'epoch_slot_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "epoch_slot_no", columnDefinition = "word31type(10)")
    private Object epochSlotNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'block_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "block_no", columnDefinition = "word31type(10)")
    private Object blockNo;
*/
/*
    TODO [JPA Buddy] create field to map the 'size' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "size", columnDefinition = "word31type(10) not null")
    private Object size;
*/
/*
    TODO [JPA Buddy] create field to map the 'proto_major' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proto_major", columnDefinition = "word31type(10) not null")
    private Object protoMajor;
*/
/*
    TODO [JPA Buddy] create field to map the 'proto_minor' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "proto_minor", columnDefinition = "word31type(10) not null")
    private Object protoMinor;
*/
/*
    TODO [JPA Buddy] create field to map the 'op_cert' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "op_cert", columnDefinition = "hash32type")
    private Object opCert;
*/
/*
    TODO [JPA Buddy] create field to map the 'op_cert_counter' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "op_cert_counter", columnDefinition = "word63type(19)")
    private Object opCertCounter;
*/
}