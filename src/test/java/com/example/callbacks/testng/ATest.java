package com.example.callbacks.testng;

import org.testng.annotations.*;

// @Listeners({MyAnnotationTransformer.class,})
public class ATest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass A");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod A");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod A");
    }

    @Test
    public void testA1() {
        System.out.println("testA1");
    }

    @Test
    public void testA2() {
        System.out.println("testA2");
    }
}
