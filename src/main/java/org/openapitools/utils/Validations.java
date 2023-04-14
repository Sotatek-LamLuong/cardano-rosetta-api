package org.openapitools.utils;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import static org.openapitools.common.constants.Constants.*;
import static org.openapitools.utils.Formatters.isEmptyHexString;

public class Validations {
    private static final Pattern tokenNameValidation = Pattern.compile("^[0-9a-fA-F]{0," + ASSET_NAME_LENGTH + "}$");

    private static final Pattern policyIdValidation = Pattern.compile("^[0-9a-fA-F]{" + POLICY_ID_LENGTH + "}$");
    public void validateCurrencies(List<Currency> currencies) {
        for (Currency currency : currencies) {
            String symbol = currency.getSymbol();
            JsonNullable<Object> metadata = currency.getMetadata();
            if (!isTokenNameValid(symbol)) {
                throw new RuntimeException("Given name is " + symbol);
            }
            if (!symbol.equals(ADA) && !isPolicyIdValid((String)metadata.get())) {
                throw new RuntimeException("Given policy id is " + metadata.get());
            }
        }
    }

    public static boolean isTokenNameValid(String name) {
        return tokenNameValidation.matcher(name).matches() || isEmptyHexString(name);
    }

    public static boolean isPolicyIdValid(String policyId) {
        return policyIdValidation.matcher(policyId).matches();
    }
    public static List<Currency> filterRequestedCurrencies(List<Currency> currencies) {
        if (currencies != null && currencies.stream().map(Currency::getSymbol).noneMatch(ADA::equals)) {
            return currencies;
        } else {
            return Collections.emptyList();
        }
    }
}
