package org.openapitools.projection;

public interface BlockProjection {
        int getNumber();
        String getHash();
        long getCreatedAt();
        String getPreviousBlockHash();
        int getPreviousBlockNumber();
        int getTransactionsCount();
        String getCreatedBy();
        int getSize();
        int getEpochNo();
        String getSlotNo();
}