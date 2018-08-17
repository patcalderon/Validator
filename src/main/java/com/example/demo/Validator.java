package com.example.demo;

public class Validator {

    public static boolean isNumber(String string){

        try {
            int number = Integer.parseInt(string);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
