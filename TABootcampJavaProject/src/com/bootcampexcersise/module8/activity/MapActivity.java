package com.bootcampexcersise.module8.activity;

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        //where key is id of type String and value is a name
        Map map = new HashMap<String, Integer>();
        map.put("key1", 123);
        map.put("key2", 456);
        map.put("key3", 789);

        //2 - Call print method to print the map passed as its parameter.
        print(map);
    }

    static void print(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.getKey();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        //3 - Type code to print this map
    }
}