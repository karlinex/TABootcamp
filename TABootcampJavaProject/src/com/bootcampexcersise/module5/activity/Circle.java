package com.bootcampexcersise.module5.activity;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class

    private double R;

    public void setR(int R) {
        this.R = R;
    }

    public double getR() {
        return R;
    }
    public double calculateArea() {
        return 3.14 * this.R*this.R;
    }

    public double calculatePerimeter() {
        return 6.28 * this.R;
    }

}