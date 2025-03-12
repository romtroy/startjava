package com.startjava.lesson_2_3_4.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrayEmpty = {};
        int[] arrayNull = null;
        int[] array3 = {6, 8, 9, 1};
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};

        displayResult(arrayEmpty);
        displayResult(arrayNull);
        displayResult(array3);
        displayResult(array4);
    }

    private static void reverseArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    private static void displayResult(int[] numbers) {
        if (numbers == null) {
            System.out.println("Массив равен null");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Пустой массив");
            return;
        }

        System.out.print("   До реверса: ");
        printArray(numbers);

        reverseArray(numbers); //или сам вызов этого метода необходимо в main перенести ?

        System.out.print("После реверса: ");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}