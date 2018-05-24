package com.example.displayname;

import org.testng.annotations.Test;

public class TestTestNg1 {
    @Test(testName = "kostya 123", description = "desc 123")
    public void test1() {
        System.out.println(123);
    }

    @Test(testName = "kostya 456")
    public void test2() {
        // throw new RuntimeException("ex");
    }
}
