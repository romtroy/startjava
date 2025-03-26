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
            factorials[i] = calcFactorial(numbers[i]);
        }
        return factorials;
    }

    private static long calcFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
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
            int n = numbers[i];
            if (n < 0) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
                continue;
            }
            if (n == 0 || n == 1) {
                System.out.println(n + "! = 1");
                continue;
            }

            StringBuilder expression = new StringBuilder("1");
            for (int j = 2; j <= n; j++) {
                expression.append(" * ").append(j);
            }
            System.out.println(new StringBuilder()
                    .append(n)
                    .append("! = ")
                    .append(expression)
                    .append(" = ")
                    .append(factorials[i]));
        }
    }
}