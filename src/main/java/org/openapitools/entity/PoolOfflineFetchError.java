package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "pool_offline_fetch_error")
public class PoolOfflineFetchError {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "pool_id", nullable = false)
    private Long poolId;

    @NotNull
    @Column(name = "fetch_time", nullable = false)
    private Instant fetchTime;

    @NotNull
    @Column(name = "pmr_id", nullable = false)
    private Long pmrId;

    @NotNull
    @Lob
    @Column(name = "fetch_error", nullable = false)
    private String fetchError;

/*
    TODO [JPA Buddy] create field to map the 'retry_count' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "retry_count", columnDefinition = "word31type(10) not null")
    private Object retryCount;
*/
}