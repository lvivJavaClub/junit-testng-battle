package com.example.sorting.testng;


import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestD {
    @Override
    public int hashCode() {
        return 4;
    }

    @Test(groups = "abcd")
    void d() {
        System.out.println("D - d");
    }

    @Test(groups = "abcd")
    void a() {
        System.out.println("D - a");
    }

    @Test(groups = "abcd")
    void c() {
        System.out.println("D - c");
    }

    @Test(groups = "abcd")
    void b() {
        System.out.println("D - b");
    }
}
