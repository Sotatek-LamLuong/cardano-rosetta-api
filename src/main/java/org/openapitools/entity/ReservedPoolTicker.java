package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "reserved_pool_ticker")
public class ReservedPoolTicker {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Lob
    @Column(name = "name", nullable = false)
    private String name;

/*
    TODO [JPA Buddy] create field to map the 'pool_hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "pool_hash", columnDefinition = "hash28type not null")
    private Object poolHash;
*/
}