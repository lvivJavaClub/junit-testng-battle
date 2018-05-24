package com.example.tags.testng;

import com.example.zutils.Sleeper;
import org.testng.annotations.Test;

public class TestTestNg1 {
    public static final String FUNCTIONAL = "functional";
    public static final String REGRESSION = "regression";

    // TODO: alt+enter to add group to IDE, works anyway, just inspection
    @Test(groups = {"functional", "regression"})
    void test1() {
        Sleeper.seconds(3);
        System.out.println("1 - test 1");
    }

    @Test(groups = {FUNCTIONAL})
    void test2() {
        Sleeper.seconds(1);
        System.out.println("1 - test 2");
    }

    @Test(groups = {REGRESSION})
    void test3() {
        Sleeper.seconds(2);
        System.out.println("1 - test 3");
    }
}
