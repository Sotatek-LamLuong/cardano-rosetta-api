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
@Table(name = "pot_transfer")
public class PotTransfer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "cert_index", nullable = false)
    private Integer certIndex;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

/*
    TODO [JPA Buddy] create field to map the 'treasury' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "treasury", columnDefinition = "int65type(20) not null")
    private Object treasury;
*/
/*
    TODO [JPA Buddy] create field to map the 'reserves' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "reserves", columnDefinition = "int65type(20) not null")
    private Object reserves;
*/
}