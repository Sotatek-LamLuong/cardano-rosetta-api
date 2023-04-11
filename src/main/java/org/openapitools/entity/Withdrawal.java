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
@Table(name = "withdrawal")
public class Withdrawal {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "addr_id", nullable = false)
    private Long addrId;

    @Column(name = "redeemer_id")
    private Long redeemerId;
    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

/*
    TODO [JPA Buddy] create field to map the 'amount' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "amount", columnDefinition = "lovelace(20) not null")
    private Object amount;
*/
}