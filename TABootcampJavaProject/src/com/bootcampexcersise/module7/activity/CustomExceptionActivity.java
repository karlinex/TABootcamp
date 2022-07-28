package com.bootcampexcersise.module7.activity;

public class CustomExceptionActivity extends Exception {

    //2 - Override getMessage() and provide the following message
    // "You are not allowed to use this program"
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}