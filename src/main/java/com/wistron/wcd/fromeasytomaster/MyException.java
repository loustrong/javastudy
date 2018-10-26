package com.wistron.wcd.fromeasytomaster;

public class MyException extends Exception{
    String message;
    public  MyException(String errorMessage){
        super(errorMessage);
        message = errorMessage;
    }
    public String getMessage(){
        return message;
    }
}
