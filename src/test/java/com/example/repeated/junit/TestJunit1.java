package com.example.repeated.junit;

import com.example.zutils.Sleeper;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestJunit1 {
    @RepeatedTest(5)
    public void test1() {
        Sleeper.seconds(2);
        System.out.println(new Random().nextInt());
    }

    // https://junit.org/junit5/docs/current/user-guide/#writing-tests-repeated-tests-examples
}
