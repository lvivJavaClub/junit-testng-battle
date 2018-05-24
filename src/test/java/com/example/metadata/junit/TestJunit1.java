package com.example.metadata.junit;

import com.example.metadata.testng.MacOS;
import com.example.zutils.Sleeper;
import org.junit.jupiter.api.*;

public class TestJunit1 {
    @BeforeEach
    void beforeEach(TestInfo info) {
        System.out.println("start test " + info.getTestMethod().get());
    }

    @AfterEach
    void afterEach(TestInfo info) {
        System.out.println("end test " + info.getTestMethod().get());
    }

    @MacOS
    @Test
    @Tag("tag1")
    void test1(TestInfo info) {
        Sleeper.seconds(3);
        System.out.println("tags " + info.getTags());
    }

    @RepeatedTest(2)
    void test2(RepetitionInfo info) {
        Sleeper.seconds(2);
        System.out.println("run #" + info.getCurrentRepetition());
    }

    // TODO what is this for?
    @Test
    void test3(TestReporter info) {
        Sleeper.seconds(1);
        info.publishEntry("kostya", "developer");
    }
}
