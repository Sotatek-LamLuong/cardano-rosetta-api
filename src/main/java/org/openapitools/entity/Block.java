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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "block_no", nullable = false)
    private Long blockNo;

    @Column(name = "epoch_no")
    private Integer epochNo;

    @Column(name = "epoch_slot_no")
    private Integer epochSlotNo;

    @NotNull
    @Column(name = "hash", nullable = false)
    private byte[] hash;

    @Column(name = "op_cert")
    private byte[] opCert;

    @Column(name = "op_cert_counter")
    private Long opCertCounter;

    @NotNull
    @Column(name = "proto_major", nullable = false)
    private Integer protoMajor;

    @NotNull
    @Column(name = "proto_minor", nullable = false)
    private Integer protoMinor;

    @NotNull
    @Column(name = "size", nullable = false)
    private Integer size;

    @Column(name = "slot_no")
    private Long slotNo;

    @NotNull
    @Column(name = "\"time\"", nullable = false)
    private Instant time;

    @NotNull
    @Column(name = "tx_count", nullable = false)
    private Long txCount;

    @Lob
    @Column(name = "vrf_key")
    private String vrfKey;

    @Column(name = "previous_id")
    private Long previousId;

    @NotNull
    @Column(name = "slot_leader_id", nullable = false)
    private Long slotLeaderId;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}