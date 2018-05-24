package com.example.callbacks.testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("ISuiteListener onStart");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("ISuiteListener onFinish");
    }
}
