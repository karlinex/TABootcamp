package com.bootcampexcersise.module10;

public class InterfaceActivity {

    public static void main(String[] args) {

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        bike.stop();

        car.start();
        car.stop();

    }
}
