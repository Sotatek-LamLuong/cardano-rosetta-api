package org.openapitools.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenesisBlockProjection {
    private String hash;
    private Long index;
}
