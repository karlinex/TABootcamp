package com.bootcampexcersise.module9.sample;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class ProductTests extends TestCase {

    private Product product;

    protected void setUp() throws Exception {
        product = new Product();
    }

    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertNull(product.getPrice());
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice());
    }


}