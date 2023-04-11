package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "meta")
public class Meta {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "start_time", nullable = false)
    private Instant startTime;

    @NotNull
    @Lob
    @Column(name = "network_name", nullable = false)
    private String networkName;

    @NotNull
    @Lob
    @Column(name = "version", nullable = false)
    private String version;

}