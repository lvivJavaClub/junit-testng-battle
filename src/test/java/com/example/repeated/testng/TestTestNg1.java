package com.example.repeated.testng;

import com.example.zutils.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalTime;
import java.util.Random;

public class TestTestNg1 {
    @Test(invocationCount = 5)
    public void test1() {
        Sleeper.seconds(2);
        System.out.println(new Random().nextInt());
    }

    @Test(invocationCount = 5, threadPoolSize = 5)
    public void test2() {
        Sleeper.seconds(2);
        System.out.println(new Random().nextInt());
    }

    @Test(invocationCount = 5, successPercentage = 90)
    public void test3() {
        Sleeper.seconds(2);
        System.out.println(new Random().nextInt());
    }
}
