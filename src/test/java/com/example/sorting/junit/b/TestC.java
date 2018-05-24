package com.example.sorting.junit.b;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestC {
    @Test
    @Tag("abcd")
    void b() {
        System.out.println("C - b");
    }

    @Test
    @Tag("abcd")
    void d() {
        System.out.println("C - d");
    }

    @Test
    @Tag("abcd")
    void c() {
        System.out.println("C - c");
    }

    @Test
    @Tag("abcd")
    void a() {
        System.out.println("C - a");
    }
}
