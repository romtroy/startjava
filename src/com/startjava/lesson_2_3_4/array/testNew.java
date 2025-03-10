package com.startjava.lesson_2_3_4.array;



public class testNew {
    public static void main(String[] args) {
        // Создание массива
        int[] numbers = {5, 10, 15, 20, 25};

        // Вывод элементов массива
        System.out.println("Элементы массива:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Изменение значения элемента
        numbers[2] = 50;
        System.out.println("\nМассив после изменения:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Вывод суммы всех элементов
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nСумма элементов: " + sum);


    }

}


/*
*
*  public static void main(String[] args) {
        int[] dataForFactorial1 = {};
        int[] dataForFactorial2 = null;
        int[] dataForFactorial3 = {8, 0, 9};
        int[] dataForFactorial4 = {-3, 1, 7, 13};
        int[] dataForFactorial5 = {-22, 0};

        printFactorials("Factorials 1", dataForFactorial1);
        printFactorials("Factorials 2", dataForFactorial2);
        printFactorials("Factorials 3", dataForFactorial3);
        printFactorials("Factorials 4", dataForFactorial4);
        printFactorials("Factorials 5", dataForFactorial5);
    }

    private static void printFactorials(String label, int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println(label + ": null (массив не задан)");
        } else {
            System.out.println(label + ": " + Arrays.toString(calculateFactorials(numbers)));
        }
    }

    public static long[] calculateFactorials(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return new long[0]; // Возвращаем пустой массив при null или пустом массиве
        }


        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                results[i] = -1; // Обозначаем невозможность вычисления
                System.out.print( "Ошибка: факториал "+numbers[i]+" не определен \n");
            } else {
                results[i] = factorial(numbers[i]);
            }
        }
        return results;
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
*
* */