package com.andersen.tasks.phan_java;

import java.util.Arrays;

public class InputDataValidation {
    public static String checkNumber(String number) {
        try {
            if(number.isEmpty()) {
                throw new EpmtyInputException();
            }
            double intNum = Double.parseDouble(number);
            if(intNum > 7) {
                return "Hello";
            }
        }
        catch (NumberFormatException e) {
            return "Number format is incorrect";
        }
        catch (EpmtyInputException e) {
            return e.getMessage();
        }
        return "";
    }

    public static String checkName(String name) {
        try {
            if(name.isEmpty()) throw new EpmtyInputException();
        }
        catch (EpmtyInputException e) {
            return e.getMessage();
        }
        if(name.equals("John")) {
            return "Hello, John";
        }
        else {
            return "There is no such name";
        }
    }

    public static String parseArray(String[] array) {
        try {
            if(array[0].isEmpty()) {
                throw new EpmtyInputException();
            }
            int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(intArray).forEach(x -> {
                if(x % 3 == 0) {
                    sb.append(x);
                    sb.append(" ");
                }
            });
            return sb.toString().trim();
        }
        catch (NumberFormatException e) {
            return "Array is incorrect";
        }
        catch (EpmtyInputException e) {
            return e.getMessage();
        }
    }
}
