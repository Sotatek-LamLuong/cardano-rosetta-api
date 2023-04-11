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
@Table(name = "pool_retire")
public class PoolRetire {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "hash_id", nullable = false)
    private Long hashId;

    @NotNull
    @Column(name = "cert_index", nullable = false)
    private Integer certIndex;

    @NotNull
    @Column(name = "announced_tx_id", nullable = false)
    private Long announcedTxId;

/*
    TODO [JPA Buddy] create field to map the 'retiring_epoch' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "retiring_epoch", columnDefinition = "word31type(10) not null")
    private Object retiringEpoch;
*/
}