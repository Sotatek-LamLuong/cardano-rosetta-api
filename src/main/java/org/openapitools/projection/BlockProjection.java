package org.openapitools.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockProjection {
        private int number;
        private String hash;

        private long createdAt;
        private String previousBlockHash;
        private int previousBlockNumber;
        private int transactionsCount;
        private String createdBy;
        private int size;
        private int epochNo;
        private String slotNo;
}
