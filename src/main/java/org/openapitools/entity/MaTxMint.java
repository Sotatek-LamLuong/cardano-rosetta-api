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
@Table(name = "ma_tx_mint")
public class MaTxMint {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;
    @NotNull
    @Column(name = "ident", nullable = false)
    private Long ident;

/*
    TODO [JPA Buddy] create field to map the 'quantity' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "quantity", columnDefinition = "int65type(20) not null")
    private Object quantity;
*/
}