package com.zenit.stuffrental.customer;

import java.util.regex.Pattern;

public class CustomerValidation {

    public static boolean patternMatches(String validationObj, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(validationObj)
                .matches();
    }

    public static String patternEmail() {
        return "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    }

    public static String patternPhone() {
        return "^(\\d{3}[- .]?){3}$";
    }

    public static String patternName() {
        return "^[A-Z][a-z]{2,30}$";
    }

    public static String patternSurname() {
        return "^[A-Z][a-z-]{2,130}$";
    }

    public static String patternBirthday() {
        return "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
    }

}
