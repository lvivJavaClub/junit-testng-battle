package com.example.metadata.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestTestNg1 {
    @BeforeMethod
    public void beforeMethod(Method method, Object[] testParams) { // TODO Object[]
        System.out.println("start test " + method);
        Arrays.stream(method.getDeclaredAnnotations()).forEach(a -> System.out.println(a.annotationType()));
        System.out.println("test params " + Arrays.toString(testParams));
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println("end test " + method);
    }


    @Test
    @MacOS
    public void test1() {
        System.out.println(1);
    }

    @Test(dataProvider = "cities")
    public void test2(String city, int population) {
        System.out.println(2);
    }

    @DataProvider(name = "cities")
    public Object[][] cities() {
        return new Object[][]{
            {"Lviv", 1_000_000},
            {"New York", 10_000_000},
        };
    }
}
