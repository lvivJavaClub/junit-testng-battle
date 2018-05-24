package com.example.displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestJunit1 {
    @DisplayName("kostya 123")
    @Test
    void test123() {
    }

    @DisplayName("kostya 456")
    @Test
    void test456() {
        // throw new RuntimeException("ex");
    }
}
