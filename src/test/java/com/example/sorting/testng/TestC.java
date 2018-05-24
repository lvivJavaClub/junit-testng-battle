package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestC {
    @Override
    public int hashCode() {
        return 3;
    }

    @Test(groups = "abcd")
    void d() {
        System.out.println("C - d");
    }

    @Test(groups = "abcd")
    void a() {
        System.out.println("C - a");
    }

    @Test(groups = "abcd")
    void c() {
        System.out.println("C - c");
    }

    @Test(groups = "abcd")
    void b() {
        System.out.println("C - b");
    }
}
