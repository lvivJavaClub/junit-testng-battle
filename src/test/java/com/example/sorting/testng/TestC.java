package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestC {
    @ExecutionTime("1")
    @Test(groups = "abcd")
    void d() {
        Sleeper.seconds(4);
        System.out.println("C - d");
    }

    @ExecutionTime("2")
    @Test(groups = "abcd")
    void a() {
        Sleeper.seconds(3);
        System.out.println("C - a");
    }

    @ExecutionTime("3")
    @Test(groups = "abcd")
    void c() {
        Sleeper.seconds(2);
        System.out.println("C - c");
    }

    @ExecutionTime("4")
    @Test(groups = "abcd")
    void b() {
        Sleeper.seconds(1);
        System.out.println("C - b");
    }
}
