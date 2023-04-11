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
@Table(name = "collateral_tx_in")
public class CollateralTxIn {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_in_id", nullable = false)
    private Long txInId;

    @NotNull
    @Column(name = "tx_out_id", nullable = false)
    private Long txOutId;

/*
    TODO [JPA Buddy] create field to map the 'tx_out_index' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "tx_out_index", columnDefinition = "txindex(5) not null")
    private Object txOutIndex;
*/
}