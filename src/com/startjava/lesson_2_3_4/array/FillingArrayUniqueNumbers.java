package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class FillingArrayUniqueNumbers {
    public static void main(String[] args) {
        /* а здесь можно записать printArray(generateUniqueNumbers(-30, -10, 23), -30, -10, 23);
           будет ли это считаться раздельным вызовом методов логики и отображения? */
        int[] temporaryArray = generateUniqueNumbers(-30, -10, 23);
        printArray(temporaryArray, -30, -10, 23);
        temporaryArray = generateUniqueNumbers(10, 50, 10);
        printArray(temporaryArray, 10, 50, 10);
        temporaryArray = generateUniqueNumbers(-34, -34, 0);
        printArray(temporaryArray, -34, -34, 0);
        temporaryArray = generateUniqueNumbers(-1, 2, -3);
        printArray(temporaryArray, -1, 2, -3);
        temporaryArray = generateUniqueNumbers(5, -8, 2);
        printArray(temporaryArray, 5, -8, 2);
    }

    public static int[] generateUniqueNumbers(int left, int right, int numbersPerLine) {
        if (left > right || numbersPerLine < 1) {
            return new int[0];
        }

        int entireArrayLength = right - left;
        int arrayLength = (int) (entireArrayLength * 0.75);
        if (arrayLength <= 0) {
            return new int[0];
        }

        int[] numbers = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(right - left + 1) + left;
        }
        Arrays.sort(numbers);
        return numbers;
    }

    public static void printArray(int[] numbers, int left, int right, int numbersPerLine) {
        if (left > right) {
            System.out.println("Ошибка: левая граница (" + left + ") > правой (" + right + ")");
            return;
        }
        if (numbersPerLine < 0) {
            System.out.println("Ошибка: количество чисел в строке не должно быть < 1 " +
                    "(" + numbersPerLine + ")");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: длина массива должна быть > 0 (" + numbers.length + ")");
            return;
        }
        System.out.print("массив случайных чисел: ");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
