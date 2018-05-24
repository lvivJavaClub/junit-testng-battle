package com.example.sorting.junit.a;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestB {
    @Test
    @Tag("abcd")
    void b() {
        System.out.println("B - b");
    }

    @Test
    @Tag("abcd")
    void d() {
        System.out.println("B - d");
    }

    @Test
    @Tag("abcd")
    void c() {
        System.out.println("B - c");
    }

    @Test
    @Tag("abcd")
    void a() {
        System.out.println("B - a");
    }
}
