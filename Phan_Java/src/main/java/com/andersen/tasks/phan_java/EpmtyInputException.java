package com.andersen.tasks.phan_java;

public class EpmtyInputException extends Exception{
    EpmtyInputException () {
        super("You entered nothing");
    }
}
