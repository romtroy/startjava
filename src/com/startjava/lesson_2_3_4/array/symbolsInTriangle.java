package com.startjava.lesson_2_3_4.array;

public class symbolsInTriangle {

    public static void main(String[] args) {
        printTriangle('0', '9', true);
        printTriangle('/', '!', false);
        printTriangle('A', 'J', false);
    }

    public static void printTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.println("Ошибка: левая граница (" + (int) start + ") > правой (" + (int) end + ")");
            return;
        }

        int size = end - start + 1;
        char[] symbols = new char[size];

        // Заполняем массив символами в указанном диапазоне
        for (int i = 0; i < size; i++) {
            symbols[i] = (char) (start + i);
        }

        // Сортировка по направлению
        if (!ascending) {
            reverseArray(symbols);
        }

        // Формируем и выводим треугольник
        int maxWidth = size * 2 - 1; // Максимальная ширина строки
        for (int i = 0; i < size; i++) {
            char c = symbols[i];
            int repeatCount = 2 * i + 1; // 1, 3, 5, 7...

            String row = " ".repeat((maxWidth - repeatCount) / 2) + String.valueOf(c).repeat(repeatCount);
            System.out.println(row);
        }
    }

    // Метод для реверса массива
    private static void reverseArray(char[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
