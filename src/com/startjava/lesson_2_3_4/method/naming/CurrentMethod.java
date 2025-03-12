package com.startjava.lesson_2_3_4.method;

public class CurrentMethod {
    public static String getName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}