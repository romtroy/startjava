package com.startjava.lesson_2_3_4.array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arrayEmpty = {};
        int[] arrayNull = null;
        int[] array3 = {6, 8, 9, 1};
        int[] array4 = {13, 8, 5, 3, 2, 1, 1};

        checkArray(arrayEmpty);
        checkArray(arrayNull);
        checkArray(array3);
        checkArray(array4);
    }

    private static void checkArray(int[] numbers) {
        if (numbers == null) {
            System.out.println("Массив равен null");
            return;
        } else if (numbers.length == 0) {
            System.out.println("Пустой массив");
            return;
        }

        displayArray("   До реверса:", numbers );
        reverseArray(numbers);
        displayArray("После реверса:", numbers);
    }

    public static void reverseArray(int[] numbers) {
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

    public static void displayArray(String message, int[] tempFirstTaskArr ) {
        System.out.print("\n" + message + " [ ");
        for (int number : tempFirstTaskArr) {
            System.out.print(number + ", ");
        }
        System.out.print("] ");
    }
}