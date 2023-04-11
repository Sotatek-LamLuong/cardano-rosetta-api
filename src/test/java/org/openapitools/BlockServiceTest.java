package org.openapitools;

import org.junit.jupiter.api.Test;
import org.openapitools.service.BlockService;

import static org.junit.jupiter.api.Assertions.*;

class BlockServiceTest {

    @Test
    void findBlock() {
        Integer number = null;
        String hash = null;

////        boolean searchBlockZero = (number == 1);
//        System.out.println(searchBlockZero);
        boolean searchLatestBlock = (hash == null) && (number == null);
        System.out.println(searchLatestBlock);


    }
}