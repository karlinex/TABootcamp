package com.bootcampexcersise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String[] args) {

        System.out.println("Even numbers:");
        // Print all even numbers less than 100
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("Odd numbers:");
        //TODO: write code to Print all odd numbers less than 100
        i = 0;
        while (i < 100) {
            if (i % 2 == 1) {
            System.out.println(i);
            }
            i++;
        }
    }
}
