package com.example.callbacks.testng;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyAnnotationTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        if (aClass != null) {
            System.out.println("IAnnotationTransformer class " + aClass.getCanonicalName());
        }
        if (method != null) {
            System.out.println("IAnnotationTransformer method " + method.getName());
        }
    }
}
