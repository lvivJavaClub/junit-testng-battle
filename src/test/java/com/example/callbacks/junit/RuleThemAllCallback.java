package com.example.callbacks.junit;

import org.junit.jupiter.api.extension.*;

public class RuleThemAllCallback implements
    BeforeAllCallback,
    BeforeEachCallback,
    BeforeTestExecutionCallback,
    AfterTestExecutionCallback,
    AfterEachCallback,
    AfterAllCallback,
    TestInstancePostProcessor{

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("callback afterAll");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("callback afterEach");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("callback afterTestExecution");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("callback beforeAll");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("callback beforeEach");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("callback beforeTestExecution");
    }

    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        System.out.println("callback postProcessTestInstance");
    }
}
