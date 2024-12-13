package com.startjava.lesson_2_3.method;

public class CurrentMethod {
    public static String getName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}