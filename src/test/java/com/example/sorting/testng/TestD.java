package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestD {
    @ExecutionTime("2")
    @Test(groups = "abcd")
    void d() {
        Sleeper.seconds(7);
        System.out.println("D - d");
    }

    @ExecutionTime("4")
    @Test(groups = "abcd")
    void a() {
        Sleeper.seconds(4);
        System.out.println("D - a");
    }

    // new test
    @Test(groups = "abcd")
    void c() {
        Sleeper.seconds(5);
        System.out.println("D - c");
    }

    @ExecutionTime("1")
    @Test(groups = "abcd")
    void b() {
        Sleeper.seconds(2);
        System.out.println("D - b");
    }
}
