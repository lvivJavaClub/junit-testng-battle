package com.example.callbacks.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BTest {
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod B");
    }

    @Test
    public void testB1() {
        System.out.println("testB1");
    }

    @Test
    public void testB2() {
        System.out.println("testB2");
    }
}
