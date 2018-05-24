package com.example.tags.testng;

import com.example.zutils.Sleeper;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import static com.example.tags.testng.TestTestNg1.FUNCTIONAL;
import static com.example.tags.testng.TestTestNg1.REGRESSION;

public class TestTestNg2 {
    @Test(groups = {FUNCTIONAL})
    void test1() {
        Sleeper.seconds(4);
        System.out.println("2 - test 1");
    }

    @Test(groups = {REGRESSION})
    void test2() {
        Sleeper.seconds(2);
        System.out.println("2 - test 2");
    }

    @Test(groups = "api")
    void test3() {
        Sleeper.seconds(2);
        System.out.println("2 - test 3");
    }

    @Test(groups = {"api", "broken"})
    void test31() {
        Sleeper.seconds(2);
        System.out.println("2 - test 31");
    }

    @Test(groups = "ui.chrome")
    void test4() {
        Sleeper.seconds(1);
        System.out.println("2 - test 4");
    }

    @Test(groups = "ui.firefox")
    void test5() {
        Sleeper.seconds(1);
        System.out.println("2 - test 5");
    }
}
