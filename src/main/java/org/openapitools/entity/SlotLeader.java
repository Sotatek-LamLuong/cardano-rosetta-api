package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "slot_leader")
public class SlotLeader {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "pool_hash_id")
    private Long poolHashId;
    @NotNull
    @Lob
    @Column(name = "description", nullable = false)
    private String description;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash28type not null")
    private Object hash;
*/
}