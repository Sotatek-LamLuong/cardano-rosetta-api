package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "delisted_pool")
public class DelistedPool {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

/*
    TODO [JPA Buddy] create field to map the 'hash_raw' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash_raw", columnDefinition = "hash28type not null")
    private Object hashRaw;
*/
}