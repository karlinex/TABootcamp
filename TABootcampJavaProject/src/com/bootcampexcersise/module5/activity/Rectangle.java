package com.bootcampexcersise.module5.activity;

public class Rectangle extends Shape {

    private double A;
    private double B;
    public Rectangle() {
    }

    public void setA(int A) {
        this.A = A;
    }

    public double getA() {
        return A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public double getB() {
        return B;
    }

    // TODO: Implement calculateArea and calculatePerimeter in this class
    public double calculateArea() {
        return this.getA() * this.getB();
    }

    public double calculatePerimeter() {
        return 2 * (this.getA() + this.getB());
    }


}