package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "collateral_tx_out")
public class CollateralTxOut {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "tx_id", nullable = false)
    private Long txId;

    @NotNull
    @Lob
    @Column(name = "address", nullable = false)
    private String address;

    @NotNull
    @Column(name = "address_raw", nullable = false)
    private byte[] addressRaw;

    @NotNull
    @Column(name = "address_has_script", nullable = false)
    private Boolean addressHasScript = false;

    @NotNull
    @Lob
    @Column(name = "multi_assets_descr", nullable = false)
    private String multiAssetsDescr;

    @Column(name = "stake_address_id")
    private Long stakeAddressId;
    @Column(name = "inline_datum_id")
    private Long inlineDatumId;

    @Column(name = "reference_script_id")
    private Long referenceScriptId;

/*
    TODO [JPA Buddy] create field to map the 'index' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "index", columnDefinition = "txindex(5) not null")
    private Object index;
*/
/*
    TODO [JPA Buddy] create field to map the 'payment_cred' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "payment_cred", columnDefinition = "hash28type")
    private Object paymentCred;
*/
/*
    TODO [JPA Buddy] create field to map the 'value' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "value", columnDefinition = "lovelace(20) not null")
    private Object value;
*/
/*
    TODO [JPA Buddy] create field to map the 'data_hash' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "data_hash", columnDefinition = "hash32type")
    private Object dataHash;
*/
}