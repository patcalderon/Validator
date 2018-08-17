package com.example.demo;

import org.apache.commons.validator.routines.EmailValidator;

public class Validator {

    public boolean isNumber(String string) {
        try {
            int number = Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean isEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

