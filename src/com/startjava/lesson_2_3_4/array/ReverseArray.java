package com.startjava.lesson_2_3_4.array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] firstTaskArr1 = {};
        int[] firstTaskArr2 = null;
        int[] firstTaskArr3 = {6, 8, 9, 1};
        int[] firstTaskArr4 = {13, 8, 5, 3, 2, 1, 1};

        workWithArray(firstTaskArr1);
        workWithArray(firstTaskArr2);
        workWithArray(firstTaskArr3);
        workWithArray(firstTaskArr4);
    }

    private static void workWithArray(int[] numbers) {
        if (numbers == null) {
            System.out.println("Массив равен null");
            return;
        } else if (numbers.length == 0) {
            System.out.println("Пустой массив");
            return;
        }
        displayArray("   До реверса", numbers);
        arrayReverse(numbers);
        displayArray("После реверса", numbers);
    }

    public static void arrayReverse(int[] numbers) {
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
            System.out.print(number + " ");
        }
        System.out.print("] ");
    }
}