package com.bootcampexcersise.module10;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {

    public static void main(String[] args) {

        Map itemHashMap = new HashMap<String, Double>();

        itemHashMap.put("TV", 1400.0);
        itemHashMap.put("Refrigerator", 800.0);
        itemHashMap.put("Washing Machine", 500.0);
        itemHashMap.put("Laptop", 2000.0);


        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
    }

    public static double returnPriceOfItem(Map<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }
}
