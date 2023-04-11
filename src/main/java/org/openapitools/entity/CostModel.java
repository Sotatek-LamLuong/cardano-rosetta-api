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
@Table(name = "cost_model")
public class CostModel {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

/*
    TODO [JPA Buddy] create field to map the 'costs' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "costs", columnDefinition = "jsonb not null")
    private Object costs;
*/
/*
    TODO [JPA Buddy] create field to map the 'hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "hash", columnDefinition = "hash32type not null")
    private Object hash;
*/
}