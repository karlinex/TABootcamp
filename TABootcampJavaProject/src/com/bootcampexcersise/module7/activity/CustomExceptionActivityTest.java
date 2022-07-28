package com.bootcampexcersise.module7.activity;

//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {

    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it
    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        obj.validateUser("Name");
        obj.validateUser("Mike");
        obj.validateUser("Shanti");
    }

    void validateUser(String name) {
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
        try {
            int flag = 0;
            for (int i = 0; i < 4; i++) {
                if (validUsers[i].equals(name)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
            System.out.println("Welcome to Payroll program");
        }

        catch (CustomExceptionActivity cea) {
            System.out.println(cea.getMessage());
        }

    }
}