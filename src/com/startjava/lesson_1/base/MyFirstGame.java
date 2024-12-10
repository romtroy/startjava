package com.startjava.lesson_1.base;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int digiteComputer = 35;
        int numberUser;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Отгадайте число: ");
            numberUser = scan.nextInt();
            if (numberUser > digiteComputer) {
                System.out.println(numberUser + " - больше того, что загадал компьютер");
            } else if (numberUser < digiteComputer) {
                System.out.println(numberUser + " - меньше того, что загадал компьютер");
            }           
        } while (digiteComputer != numberUser); 
        System.out.println("Вы угадали число: " + numberUser);
    }
}
