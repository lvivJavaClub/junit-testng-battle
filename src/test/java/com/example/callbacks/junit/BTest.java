package com.example.callbacks.junit;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BTest extends TestBase {
    int i = 1;

    @BeforeAll
    public static void beforeAll(TestInfo info) {
        System.out.println("beforeAll B " + info.getDisplayName());
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach B " + i);
    }

    @Test
    public void testA1() {
        System.out.println("testA1 " + i);
        i++;
    }

    @Test
    public void testA2() {
        System.out.println("testA2 " + i);
        i++;
    }
}
