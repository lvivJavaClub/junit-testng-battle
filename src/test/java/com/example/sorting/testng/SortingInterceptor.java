package com.example.sorting.testng;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.Comparator;
import java.util.List;

public class SortingInterceptor implements IMethodInterceptor {
    private static final Comparator<IMethodInstance> FULL_NAME = (m1, m2) -> {
        String s1 = m1.getMethod().getRealClass().getCanonicalName() + "-" + m1.getMethod().getMethodName();
        String s2 = m2.getMethod().getRealClass().getCanonicalName() + "-" + m2.getMethod().getMethodName();
        return s1.compareTo(s2);
    };

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext iTestContext) {
        methods.forEach(m -> System.out.println(m.getMethod().getRealClass().getCanonicalName() + "-" + m.getMethod().getMethodName()));

        System.out.println();System.out.println();

        methods.sort(FULL_NAME.reversed());

        methods.forEach(m -> System.out.println(m.getMethod().getRealClass().getCanonicalName() + "-" + m.getMethod().getMethodName()));

        return methods;
    }
}
