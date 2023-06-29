package com.zenit.stuffrental.product;

import java.util.regex.Pattern;

public class ProductValidation {

    public static boolean patternMatches(String validationObj, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(validationObj)
                .matches();
    }

    public static String offerName() {
        return "^[A-Z][a-z]{5,300}$";
    }
}
