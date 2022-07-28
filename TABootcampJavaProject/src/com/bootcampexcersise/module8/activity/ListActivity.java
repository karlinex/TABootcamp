package com.bootcampexcersise.module8.activity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public int x;

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList<>();
        list.add("K");
        list.add("a");
        list.add("r");
        list.add("l");
        list.add("i");
        list.add("n");
        list.add("e");

        //TODO: 2 - Call print method to print the list passed as its parameter.
        //ListActivity obj = new ListActivity();
        print(list);
    }

    static void print(List list)
    {
        //TODO: 3 - Type code to print this list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}