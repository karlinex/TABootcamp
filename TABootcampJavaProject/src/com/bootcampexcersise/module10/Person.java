package com.bootcampexcersise.module10;

abstract class Person {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public abstract void introduce();
}
