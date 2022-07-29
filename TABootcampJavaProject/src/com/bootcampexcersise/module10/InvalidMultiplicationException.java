package com.bootcampexcersise.module10;

public class InvalidMultiplicationException extends ArithmeticException {

    @Override
    public String getMessage(){
        return "0 can't be multiplied";
    }
}
