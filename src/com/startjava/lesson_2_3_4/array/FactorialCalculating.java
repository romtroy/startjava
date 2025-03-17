package com.startjava.lesson_2_3_4.array;

public class FactorialCalculating {
    public static void main(String[] args) {
        int[] emptyArray = {};
        int[] nullArray = null;
        int[] array1 = {8, 0, 9};
        int[] array2 = {-3, 1, 7, 13};
        int[] array3 = {-22, 0};

        long[] calculatedFactorials = workWithFactorials(emptyArray);
        displayFactorials(emptyArray, calculatedFactorials);

        calculatedFactorials = workWithFactorials(nullArray);
        displayFactorials(nullArray, calculatedFactorials);

        calculatedFactorials = workWithFactorials(array1);
        displayFactorials(array1, calculatedFactorials);

        calculatedFactorials = workWithFactorials(array2);
        displayFactorials(array2, calculatedFactorials);

        calculatedFactorials = workWithFactorials(array3);
        displayFactorials(array3, calculatedFactorials);
    }

    private static long[] workWithFactorials(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        long[]  factorialsTemp = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            factorialsTemp[i] = factorialCalc(numbers[i]);
        }
        return factorialsTemp;
    }
    private static long factorialCalc(int n) {
        if (n < 0) {
            return 1;
        }
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
            System.out.println(formatFactorial(numbers[i], factorials[i]));
        }
    }

    private static String formatFactorial(int n, long factorial) {
        return (n < 0) ? "Ошибка: факториал " + n + "! не определен" :
                (n + "! = " + factorialViewString(n) + " = " + factorial);
    }

    private static String factorialViewString(int n) {
        if (n == 0) return "1";
        StringBuilder expressionFactorial = new StringBuilder("1");

        for (int i = 2; i <= n; i++) {
            expressionFactorial.append(" * ").append(i);
        }
        return expressionFactorial.toString();
    }
}
