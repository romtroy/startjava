package com.startjava.lesson_2_3_4.array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] firstTaskArr = {1, 2, 3, 4, 5, 0};
        // int[] firstTaskArr = {};
        // int[] firstTaskArr = null;

        if (firstTaskArr == null) {
            System.out.println("Массив равен null");
            return;
        } else if (firstTaskArr.length == 0) {
            System.out.println("Пустой массив");
            return;
        }

        displayArray("   До реверса", firstTaskArr);

        arrayReverse(firstTaskArr);

        displayArray("После реверса", firstTaskArr);
    }

    public static void arrayReverse(int[] firstTaskArr) {
        int left = 0, right = firstTaskArr.length - 1;
        while (left < right) {
            int temp = firstTaskArr[left];
            firstTaskArr[left] = firstTaskArr[right];
            firstTaskArr[right] = temp;
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