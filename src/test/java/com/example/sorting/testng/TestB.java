package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestB {
    @ExecutionTime("4")
    @Test(groups = "abcd")
    void b() {
        Sleeper.seconds(3);
        System.out.println("B - b");
    }

    @ExecutionTime("2")
    @Test(groups = "abcd")
    void d() {
        Sleeper.seconds(6);
        System.out.println("B - d");
    }

    @ExecutionTime("2")
    @Test(groups = "abcd")
    void c() {
        Sleeper.seconds(2);
        System.out.println("B - c");
    }

//    @ExecutionTime("1") with this class order is A B C D and methods are run in scope of class so A all methods run 1st and so forth
    @ExecutionTime("2") // let's check with this
    @Test(groups = "abcd")
    void a() {
        Sleeper.seconds(2);
        System.out.println("B - a");
    }
}
