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
@Table(name = "extra_key_witness")
public class ExtraKeyWitness {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash28type not null")
    private Object hash;
*/
}