package com.example.tags.testng;

import com.example.zutils.Sleeper;

//@Test(groups = "api")
public class TestTestNg3 {
    void test1() {
        Sleeper.seconds(2);
        System.out.println("3 - test 1");
    }

    // @Test(groups = "broken")
    void test2() {
        Sleeper.seconds(2);
        System.out.println("3 - test 2");
    }
}
