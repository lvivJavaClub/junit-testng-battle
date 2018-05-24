package com.example.sorting.junit.c;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestA {
    @Test
    @Tag("abcd")
    void d() {
        System.out.println("A - d");
    }

    @Test
    @Tag("abcd")
    void a() {
        System.out.println("A - a");
    }

    @Test
    @Tag("abcd")
    void c() {
        System.out.println("A - c");
    }

    @Test
    @Tag("abcd")
    void b() {
        System.out.println("A - b");
    }
}
