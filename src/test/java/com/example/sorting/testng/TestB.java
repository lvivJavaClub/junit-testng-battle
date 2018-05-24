package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestB {
    @Override
    public int hashCode() {
        return 2;
    }

    @Test(groups = "abcd")
    void b() {
        System.out.println("B - b");
    }

    @Test(groups = "abcd")
    void d() {
        System.out.println("B - d");
    }

    @Test(groups = "abcd")
    void c() {
        System.out.println("B - c");
    }

    @Test(groups = "abcd")
    void a() {
        System.out.println("B - a");
    }
}
