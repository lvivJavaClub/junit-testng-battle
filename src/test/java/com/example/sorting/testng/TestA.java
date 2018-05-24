package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestA {
    @ExecutionTime("2")
    @Test(groups = "abcd")
    void d() {
        Sleeper.seconds(4);
        System.out.println("A - d");
    }

    @ExecutionTime("1")
    @Test(groups = "abcd")
    void a() {
        Sleeper.seconds(3);
        System.out.println("A - a");
    }

    @ExecutionTime("3")
    @Test(groups = "abcd")
    void c() {
        Sleeper.seconds(7);
        System.out.println("A - c");
    }

    @ExecutionTime("4")
    @Test(groups = "abcd")
    void b() {
        Sleeper.seconds(2);
        System.out.println("A - b");
    }
}
