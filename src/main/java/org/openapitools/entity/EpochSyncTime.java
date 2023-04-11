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
@Table(name = "epoch_sync_time")
public class EpochSyncTime {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "no", nullable = false)
    private Long no;

/*
    TODO [JPA Buddy] create field to map the 'seconds' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "seconds", columnDefinition = "word63type(19) not null")
    private Object seconds;
*/
/*
    TODO [JPA Buddy] create field to map the 'state' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "state", columnDefinition = "syncstatetype not null")
    private Object state;
*/
}