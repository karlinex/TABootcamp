package com.bootcampexcersise.module9.activity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters

    public void testSetAndGetWeight() {
        int weight = 50;
        assertEquals(0, person.getWeight());
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());

        weight = -5;
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());
    }

    public void testSetAndGetHeight() {
        float height = 50;
        assertEquals(0.0f, person.getHeight());
        person.setHeight(height);
        assertEquals(height, person.getHeight());

        height = -50;
        person.setHeight(height);
        assertEquals(height, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method

    public void testGetBodyMassIndex() {
        int weight = 60;
        float height = 1.7f;
        person.setHeight(height);
        person.setWeight(weight);
        assertEquals("BMI = 20,76", person.getBodyMassIndex());

        weight = -60;
        height = 1.7f;
        person.setHeight(height);
        person.setWeight(weight);
        assertEquals("Invalid values", person.getBodyMassIndex());

        weight = 60;
        height = -1.7f;
        person.setHeight(height);
        person.setWeight(weight);
        assertEquals("Invalid values", person.getBodyMassIndex());
    }

}