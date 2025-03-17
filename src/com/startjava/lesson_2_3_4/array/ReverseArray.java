package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrayEmpty = {};
        int[] arrayNull = null;
        int[] array3 = {6, 8, 9, 1};
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};

        int[] reversed = reverse(arrayEmpty);
        displayResult(arrayEmpty, reversed);

        reversed = reverse(arrayNull);
        displayResult(arrayNull, reversed);

        reversed = reverse(array3);
        displayResult(array3, reversed);

        reversed = reverse(array4);
        displayResult(array4, reversed);
    }

    private static int[] reverse(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }

        int[] reversed = new int[numbers.length];
        int lastIndex = numbers.length - 1;

        for (int num : numbers) {
            reversed[lastIndex--] = num;
            System.out.print(num);
        }
        return reversed;
    }

    private static void displayResult(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("Массив равен null");
            return;
        }
        if (original.length == 0) {
            System.out.println("Пустой массив");
            return;
        }

        System.out.println("   До реверса: " + Arrays.toString(original));
        System.out.println("После реверса: " + Arrays.toString(reversed));
    }
}
