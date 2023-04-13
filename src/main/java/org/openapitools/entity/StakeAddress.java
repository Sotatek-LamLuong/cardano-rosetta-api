package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "stake_address")
public class StakeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "hash_raw", nullable = false)
    private byte[] hashRaw;

    @Column(name = "script_hash")
    private byte[] scriptHash;

    @NotNull
    @Lob
    @Column(name = "view", nullable = false)
    private String view;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}