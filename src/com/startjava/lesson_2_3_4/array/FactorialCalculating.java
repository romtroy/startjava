package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class FactorialCalculating {
    public static void main(String[] args) {
        int[] emptyArray = {}; //
        int[] nullArray = null;
        int[] array1 = {8, 0, 9};
        int[] array2 = {-3, 1, 7, 13};
        int[] array3 = {-22, 0};

        workWithFactorials(emptyArray);
        workWithFactorials(nullArray);
        workWithFactorials(array1);
        workWithFactorials(array2);
        workWithFactorials(array3);
    }
    private static void workWithFactorials(int[] numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: передан null");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: передан пустой массив");
            return;
        }

        for (int number : numbers) {
            System.out.println(formatFactorial(number));
        }
    }

    private static String formatFactorial(int n) {
        if (n < 0) {
            return "Ошибка: факториал " + n + "! не определен";
        } else {
            return (n + "! = " + factorialExpressionString(n) + " = " + factorialCalc(n));
        }
    }

    private static String factorialExpressionString(int n) {
        if (n == 0) return "1";
        String expression = "1";

        for (int i = 2; i <= n; i++) {
            expression += " * " + i;
        }
        return expression;
    }

    private static long factorialCalc(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}