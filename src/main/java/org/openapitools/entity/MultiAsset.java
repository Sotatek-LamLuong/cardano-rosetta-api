package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "multi_asset")
public class MultiAsset {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Lob
    @Column(name = "fingerprint", nullable = false)
    private String fingerprint;

/*
    TODO [JPA Buddy] create field to map the 'policy' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "policy", columnDefinition = "hash28type not null")
    private Object policy;
*/
/*
    TODO [JPA Buddy] create field to map the 'name' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "name", columnDefinition = "asset32type not null")
    private Object name;
*/
}