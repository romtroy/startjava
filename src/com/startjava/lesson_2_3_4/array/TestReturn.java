package com.startjava.lesson_2_3_4.array;

public class TestReturn {

    public static int sum(int a, int b) {
        return a + b;
    }

    //2
    static int[] numbers = new int[5];
    //3
    static int[] firstTaskArr3 = {6, 8, 9, 1};

    public static void main(String[] args) {
        int result = sum(5, 3);
        System.out.println("Сумма: " + result);

        //2
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Индекс: " + i + ", значение: " + numbers[i]);
        }

        //3
        for (int i = 0; i < firstTaskArr3.length; i++) {
            System.out.println("значение: " + firstTaskArr3[i]);
        }

    }
}

