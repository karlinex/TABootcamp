package com.bootcampexcersise.module10;


public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }

    public double divide(int x, int y) {
        try {
             return x / y;
            }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double multiply(int x, int y) throws InvalidMultiplicationException {
        if (x == 0 && y == 0)
            throw new InvalidMultiplicationException();
        return x * y;
    }
}
