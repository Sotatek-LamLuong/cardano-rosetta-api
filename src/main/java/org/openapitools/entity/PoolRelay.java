package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "pool_relay")
public class PoolRelay {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "update_id", nullable = false)
    private Long updateId;

    @Lob
    @Column(name = "ipv4")
    private String ipv4;

    @Lob
    @Column(name = "ipv6")
    private String ipv6;

    @Lob
    @Column(name = "dns_name")
    private String dnsName;

    @Lob
    @Column(name = "dns_srv_name")
    private String dnsSrvName;

    @Column(name = "port")
    private Integer port;

}