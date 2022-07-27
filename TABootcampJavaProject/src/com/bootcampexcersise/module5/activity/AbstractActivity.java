package com.bootcampexcersise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {
        // set and Print color of rectangle
        // Give area of rectangle
        // Print perimeter of rectangle
        Rectangle rec = new Rectangle();
        rec.setColor("red");
        rec.setA(3);
        rec.setB(4);


        Circle c = new Circle();
        c.setColor("Blue");
        c.setR(5);

        // set and Print color of circle
        // Give area of circle
        // Print perimeter of circle

        System.out.println("---------------------------");
        System.out.println("Rectangle color       : " + rec.getColor());
        System.out.println("Rectangle area        : " + rec.calculateArea());
        System.out.println("Rectangle perimeter   : " + rec.calculatePerimeter());

        System.out.println("---------------------------");
        System.out.println("Circle color          : " + c.getColor());
        System.out.println("Circle area           : " + c.calculateArea());
        System.out.println("Circle perimeter      : " + c.calculatePerimeter());
    }
}