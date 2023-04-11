package org.openapitools.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "reverse_index")
public class ReverseIndex {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "block_id", nullable = false)
    private Long blockId;

    @Lob
    @Column(name = "min_ids")
    private String minIds;

}