package com.bootcampexcersise.module8.activity;

import java.util.HashSet;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        Set names = new HashSet();
        //Also try adding a few duplicate entries to this set.
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
        names.add("Name4");


        //TODO: 2 - Call print method to print the set passed as its parameter.
        print(names);
    }

    static void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object nameOfObject : set) {
            System.out.println(nameOfObject.toString());
        }
    }
}