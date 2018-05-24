package com.example.tags.junit;

import com.example.zutils.Sleeper;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class TestJunit1 {
    @Test
    @Tag("functional")
    @Tag("regression")
    void test1() {
        Sleeper.seconds(2);
        System.out.println("1 - test 1");
    }

    @Test
    @Tag("functional")
    void test2() {
        Sleeper.seconds(1);
        System.out.println("1 - test 2");
    }

    @Test
    @Tag("regression")
    void test3() {
        Sleeper.seconds(3);
        System.out.println("1 - test 3");
    }

    @Test
    @Tags({
        @Tag("functional"), @Tag("regression")
    })
    void test4() {
        Sleeper.seconds(1);
        System.out.println("1 - test 4");
    }

    @Test
    @Functional
    void test5() {
        Sleeper.seconds(4);
        System.out.println("1 - test 5");
    }

    @Test
    @Functional
    @Regression
    void test6() {
        Sleeper.seconds(2);
        System.out.println("1 - test 6");
    }
}
