package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "stake_address")
public class StakeAddress {
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
    @Column(name = "hash_raw", columnDefinition = "addr29type not null")
    private Object hashRaw;
*/
/*
    TODO [JPA Buddy] create field to map the 'script_hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "script_hash", columnDefinition = "hash28type")
    private Object scriptHash;
*/
}