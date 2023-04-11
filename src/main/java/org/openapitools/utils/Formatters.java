package org.openapitools.utils;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

public class Formatters {
    public static String hexFormatter(String input) {
        byte[] buffer = input.getBytes(StandardCharsets.UTF_8);
        return DatatypeConverter.printHexBinary(buffer);
    }
}
