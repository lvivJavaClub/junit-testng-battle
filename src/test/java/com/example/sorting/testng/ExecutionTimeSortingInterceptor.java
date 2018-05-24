package com.example.sorting.testng;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.lang.annotation.Annotation;
import java.util.Comparator;
import java.util.List;

public class ExecutionTimeSortingInterceptor implements IMethodInterceptor {
    private static final Comparator<IMethodInstance> EXECUTION_TIME = (m1, m2) -> {
        ExecutionTime time1 = m1.getMethod().getMethod().getDeclaredAnnotation(ExecutionTime.class);
        ExecutionTime time2 = m2.getMethod().getMethod().getDeclaredAnnotation(ExecutionTime.class);

        // for methods that don't have execution time yet
        if (time1 == null || time2 == null) {
            return 0;
        }

        return time1.value().compareTo(time2.value());
    };

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext iTestContext) {
        methods.forEach(m -> System.out.println(m.getMethod().getRealClass().getCanonicalName() + "-" + m.getMethod().getMethodName()));

        System.out.println();System.out.println();

        methods.sort(EXECUTION_TIME);

        methods.forEach(m -> {
            String value = "0";
            ExecutionTime time = m.getMethod().getMethod().getDeclaredAnnotation(ExecutionTime.class);
            if (time != null) {
                value = time.value();
            }
            System.out.println(m.getMethod().getRealClass().getCanonicalName() + "-" + m.getMethod().getMethodName() + " " + value);
        });

        return methods;
    }
}
