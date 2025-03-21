package com.startjava.lesson_2_3_4.array;

public class TriangleSymbolSorted {
    public static void main(String[] args) {
        char char1 = '0';
        char char2 = '9';
        boolean first = true;

        char char3 = '/';
        char char4 = '!';
        boolean second = false;

        char char5 = 'A';
        char char6 = 'J';
        boolean third = false;

        displayTriangle(char1, char2, first);
        displayTriangle(char3, char4, second);
        displayTriangle(char5, char6, third);
    }

    private static void displayTriangle(char start, char end, boolean direction) {
        if (start > end) {
            System.out.print("\nОшибка: левая граница (" + (int)start + ") > правой (" + (int)end + ") \n");
            return;
        }
        StringBuilder symbolsString = new StringBuilder();
        for (int i = start; i <= end; i++) {
            symbolsString.append((char) i);
        }

        String sortedSymbols;
        if (direction) {
            sortedSymbols = symbolsString.toString();
        } else {
            sortedSymbols = symbolsString.reverse().toString();
        }

        int stringLength = sortedSymbols.length();
        String[] triangleArray = new String[stringLength];

        for (int i = 0; i < stringLength; i++) {
            String spaces = " ".repeat((stringLength - i) - 1);
            String lettersLine = String.valueOf(sortedSymbols.charAt(i)).repeat(2 * i + 1);
            triangleArray[i] = spaces + lettersLine + spaces;
        }

        for (String line : triangleArray) {
            System.out.println(line);
        }
    }
}