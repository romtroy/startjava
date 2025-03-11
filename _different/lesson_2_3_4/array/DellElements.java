package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class DellElements {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(random.nextDouble() * 1000.0) / 1000.0;
        }

        System.out.println("Исходный массив:");
        printArray(numbers);

        int[] testIndices = {-1, 15, 0, 14};

        for (int index : testIndices) {
            System.out.println("\nПереданный индекс: " + index);
            int count = deleteGreaterElements(numbers, index);
            System.out.println("Количество обнулённых ячеек: " + count);
            System.out.println("Изменённый массив:");
            printArray(numbers);
        }
    }

    public static int deleteGreaterElements(double[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Ошибка: индекс выходит за границы массива!");
            return 0;
        }

        double threshold = arr[index];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > threshold) {
                arr[i] = 0.0;
                count++;
            }
        }
        return count;
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.3f ", arr[i]);
            if (i == 7) System.out.println();
        }
        System.out.println("\n");
    }
}
