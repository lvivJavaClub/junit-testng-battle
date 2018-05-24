package com.example.sorting.junit.a;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestD {
    @Test
    @Tag("abcd")
    void b() {
        System.out.println("D - b");
    }

    @Test
    @Tag("abcd")
    void d() {
        System.out.println("D - d");
    }

    @Test
    @Tag("abcd")
    void c() {
        System.out.println("D - c");
    }

    @Test
    @Tag("abcd")
    void a() {
        System.out.println("D - a");
    }
}
