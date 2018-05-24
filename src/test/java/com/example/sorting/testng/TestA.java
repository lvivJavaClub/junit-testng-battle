package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestA {
    @Override
    public int hashCode() {
        return 1;
    }

    @Test(groups = "abcd")
    void d() {
        System.out.println("A - d");
    }

    @Test(groups = "abcd")
    void a() {
        System.out.println("A - a");
    }

    @Test(groups = "abcd")
    void c() {
        System.out.println("A - c");
    }

    @Test(groups = "abcd")
    void b() {
        System.out.println("A - b");
    }
}
