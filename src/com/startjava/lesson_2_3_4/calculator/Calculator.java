package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char sign;
   
    public void setNumber1(int number1) {
        this.number1 = number1;     
    }
    
    public void setNumber2(int number2) {
        this.number2 = number2;     
    }
    
    public void setSign(char sign) {
        this.sign = sign;     
    }

    public void calculate() {
        if (sign == '/' && number2 == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль запрещено!");
        }
        int result = 0;
        switch (sign) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                result = 1;
                for (int j = 1; j <= number2; j++) {
                    result *= number1;
                }
                break;
            case '%':
                result = number1 % number2;
                break;
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}