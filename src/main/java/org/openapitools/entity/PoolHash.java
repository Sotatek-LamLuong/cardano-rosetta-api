package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "pool_hash")
public class PoolHash {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Lob
    @Column(name = "view", nullable = false)
    private String view;

/*
    TODO [JPA Buddy] create field to map the 'hash_raw' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash_raw", columnDefinition = "hash28type not null")
    private Object hashRaw;
*/
}