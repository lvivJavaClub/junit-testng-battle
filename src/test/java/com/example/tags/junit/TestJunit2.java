package com.example.tags.junit;

import com.example.zutils.Sleeper;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class TestJunit2 {
    @Test
    @Tag("functional")
    @Tag("regression")
    void test1() {
        Sleeper.seconds(3);
        System.out.println("2 - test 1");
    }

    @Test
    @Tag("api")
    void test2() {
        Sleeper.seconds(2);
        System.out.println("2 - test 2");
    }

    @Test
    @Tag("api")
    @Tag("broken")
    void test21() {
        Sleeper.seconds(2);
        System.out.println("2 - test 21");
    }

    @Test
    @Tag("ui")
    @EnabledIfSystemProperty(named = "browser", matches = ".*firefox.*")
    void test3() {
        Sleeper.seconds(1);
        System.out.println("2 - test 3");
    }

    @Test
    @Tag("ui")
    @EnabledIfSystemProperty(named = "browser", matches = ".*chrome.*")
    void test4() {
        Sleeper.seconds(1);
        System.out.println("2 - test 4");
    }
}
