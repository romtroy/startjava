package com.startjava.lesson_2_3_4.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrayEmpty = {};
        int[] arrayNull = null;
        int[] array3 = {6, 8, 9, 1};
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};

        int[] reverseEmpty = reverseArray(arrayEmpty);
        displayResult(arrayEmpty, reverseEmpty);

        int[] reverseNull = reverseArray(arrayNull);
        displayResult(arrayNull, reverseNull);

        int[] reverseArray3 = reverseArray(array3);
        displayResult(array3, reverseArray3);

        int[] reverseArray4 = reverseArray(array4);
        displayResult(array4, reverseArray4);
    }

    private static int[] reverseArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }

        int[] reversed = numbers.clone();

        int left = 0;
        int right = reversed.length - 1;
        while (left < right) {
            int temp = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temp;
            left++;
            right--;
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

        System.out.print("   До реверса: ");
        printArray(original);

        System.out.print("После реверса: ");
        printArray(reversed);
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
