package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result = 1;
        char signContinue = 'y';
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("first number: ");
            int number1 = scan.nextInt();
            System.out.print("your sign: ");
            char sign = scan.next().charAt(0);
            System.out.print("second number: ");
            int number2 = scan.nextInt();
            if (sign == '+') {
                result = number1 + number2;
            } else if (sign == '-') {
                result = number1 - number2;
            } else if (sign == '*') {
                result = number1 * number2;
            } else if (sign == '/') {
                result = number1 / number2;
            } else if (sign == '^') {
                for (int j = 1; j <= number2; j++) {
                    result *= number1;
                }
            } else if (sign == '%') {
                result = number1 % number2;
            }
            System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
            System.out.println("Would you like to continue?(y/n)");
            signContinue = scan.next().charAt(0);
            if (signContinue == 'n') break;
        } while (signContinue == 'y');
    }
}