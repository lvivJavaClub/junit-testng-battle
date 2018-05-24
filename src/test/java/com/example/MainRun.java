package com.example;

import com.example.sorting.testng.*;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class MainRun {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setMethodInterceptor(new SortingInterceptor());
        testng.setTestClasses(new Class[] {
                TestA.class,
                TestB.class,
                TestD.class,
                TestC.class,
        });
//        testng.addListener(new SortingInterceptor());
        testng.run();
    }
}
