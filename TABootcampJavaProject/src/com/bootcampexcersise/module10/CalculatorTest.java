package com.bootcampexcersise.module10;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testAddPositiveAndNegativeInts() {
        int x = 50;
        int y = -10;
        assertEquals(40, calculator.add(x, y));
    }

    public void testAddPositiveInts() {
        int x = 50;
        int y = 10;
        assertEquals(60, calculator.add(x, y));
    }

    public void testAddNegativeAndPositiveInts() {
        int x = -20;
        int y = 40;
        assertEquals(20, calculator.add(x, y));
    }

    public void testAddNegativeInts() {
        int x = -20;
        int y = -40;
        assertEquals(-60, calculator.add(x, y));
    }

    public void testAddThree() {
        int x = -20;
        int y = -40;
        int z = 120;
        assertEquals(60, calculator.add(x, y, z));
    }

    public void testAddThreePositiveInts() {
        int x = 20;
        int y = 40;
        int z = 120;
        assertEquals(180, calculator.add(x, y, z));
    }

    public void testSubstractNegativeInts() {
        int x = -20;
        int y = -40;
        assertEquals(20, calculator.subtract(x, y));
    }

    public void testSubstractPositiveInts() {
        int x = 20;
        int y = 40;
        assertEquals(20, calculator.subtract(x, y));
    }

    public void testSubstractNegativeAndPositiveInts() {
        int x = -20;
        int y = 40;
        assertEquals(60, calculator.subtract(x, y));
    }

    public void testSubstractPositiveAndNegativeInts() {
        int x = 20;
        int y = -40;
        assertEquals(60, calculator.subtract(x, y));
    }

    public void testDivideZeros() {
        int x = 0;
        int y = 0;
        assertEquals(0.0, calculator.divide(x, y));
    }

    public void testDividePositiveInts() {
        int x = 30;
        int y = 3;
        assertEquals(10.0, calculator.divide(x, y));
    }

    public void testDivideNegativeAndPositiveInts() {
        int x = -30;
        int y = 3;
        assertEquals(-10.0, calculator.divide(x, y));
    }

    public void testDivideNegativeInts() {
        int x = -30;
        int y = -3;
        assertEquals(10.0, calculator.divide(x, y));
    }

    public void testPositiveAndNegativeInts() {
        int x = 30;
        int y = -3;
        assertEquals(-10.0, calculator.divide(x, y));
    }

    public void testMultiplyZeros() {
        int x = 0;
        int y = 0;
        InvalidMultiplicationException resultException = null;
        try {
            calculator.multiply(x, y);
        } catch (InvalidMultiplicationException e){
            resultException = e;
        }
        assertNotNull(resultException);
    }

    public void testMultiplyPositiveInts() {
        int x = 30;
        int y = 3;
        assertEquals(90.0, calculator.multiply(x, y));
    }

    public void testMultiplyNegativeAndPositiveInts() {
        int x = -30;
        int y = 3;
        assertEquals(-90.0, calculator.multiply(x, y));
    }

    public void testMultiplyNegativeInts() {
        int x = -30;
        int y = -3;
        assertEquals(90.0, calculator.multiply(x, y));
    }

    public void testMultiplyPositiveAndNegativeInts() {
        int x = 30;
        int y = -3;
        assertEquals(-90.0, calculator.multiply(x, y));
    }
}
