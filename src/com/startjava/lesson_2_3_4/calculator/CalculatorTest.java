package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String signContinue = "yes";
       
        do {
            System.out.print("Введите первое число: ");
            calc.setNumber1(scan.nextInt());
            char sign;
            while (true) {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                sign = scan.next().charAt(0);
                if (isValidSign(sign)) {
                    break;
                }
                System.out.println("Ошибка: операция " + sign + " не поддерживается");
            }              
            calc.setSign(sign);
            System.out.print("Введите второе число: ");
            calc.setNumber2(scan.nextInt());
            calc.calculate(); 

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                signContinue = scan.next();
            } while (!signContinue.equals("yes") && !signContinue.equals("no"));
        } while (!signContinue.equals("no"));
    }
    
    private static boolean isValidSign(char sign) {
        return (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%');
    }
}