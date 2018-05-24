package com.example.zutils;

import java.util.concurrent.TimeUnit;

public class Sleeper {
    public static void seconds(long n) {
        try {
            TimeUnit.SECONDS.sleep(n);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
