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
@Table(name = "stake_deregistration")
public class StakeDeregistration {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "addr_id", nullable = false)
    private Long addrId;

    @NotNull
    @Column(name = "cert_index", nullable = false)
    private Integer certIndex;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;
    @Column(name = "redeemer_id")
    private Long redeemerId;

/*
    TODO [JPA Buddy] create field to map the 'epoch_no' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "epoch_no", columnDefinition = "word31type(10) not null")
    private Object epochNo;
*/
}