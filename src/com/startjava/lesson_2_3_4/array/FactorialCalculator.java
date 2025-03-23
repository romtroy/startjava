package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[] emptyArray = {};
        long[] calculatedFactorials = calc(emptyArray);
        displayFactorials(emptyArray, calculatedFactorials);

        int[] nullArray = null;
        calculatedFactorials = calc(nullArray);
        displayFactorials(nullArray, calculatedFactorials);

        int[] array1 = {8, 0, 9};
        calculatedFactorials = calc(array1);
        displayFactorials(array1, calculatedFactorials);

        int[] array2 = {-3, 1, 7, 13};
        calculatedFactorials = calc(array2);
        displayFactorials(array2, calculatedFactorials);

        int[] array3 = {-22, 0};
        calculatedFactorials = calc(array3);
        displayFactorials(array3, calculatedFactorials);
    }

    private static long[] calc(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        long[] factorials = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            factorials[i] = calculateFactorial(numbers[i]);
        }
        return factorials;
    }

    private static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static void displayFactorials(int[] numbers, long[] factorials) {
        if (numbers == null) {
            System.out.println("Ошибка: передан null");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: передан пустой массив");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(expressionFactorialToString(numbers[i], factorials[i]));
        }
    }

    private static String expressionFactorialToString(int n, long factorial) {
        if (n < 0) {
            return ("Ошибка: факториал " + n + "! не определен");
        }
        if (n == 0 || n == 1) {
            return (n + "! = 1");
        }

        StringBuilder expression = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            expression.append(" * ").append(i);
        }
        return (n + "! = " + expression + " = " + factorial);
    }
}
