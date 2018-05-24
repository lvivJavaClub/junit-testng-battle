package com.example.callbacks.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ATest extends TestBase {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll A");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach A");
    }

    @Test
    public void testA1() {
        System.out.println("testA1");
    }

    @Test
    public void testA2() {
        System.out.println("testA2");
    }
}
