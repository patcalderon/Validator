package com.example.demo;
import org.apache.commons.validator.routines.EmailValidator;

public class Validator {

    public boolean isNumber(String string){
        try {
            int number = Integer.parseInt(string);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean isEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

    public boolean areRectanglesEqual(String email) {
        return false;
    }

    public boolean isPalindrome(String s) {
        return (new StringBuilder(s).reverse().toString().equals(s));
    }
}
