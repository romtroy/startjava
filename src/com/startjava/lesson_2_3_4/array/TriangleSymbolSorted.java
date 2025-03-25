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

        String[] triangle1 = constructionTriangle(char1, char2, first);
        displayTriangle(triangle1);

        String[] triangle2 = constructionTriangle(char3, char4, second);
        displayTriangle(triangle2);

        String[] triangle3 = constructionTriangle(char5, char6, third);
        displayTriangle(triangle3);
    }

    private static String[] constructionTriangle(char start, char end, boolean direction) {
        if (start > end) {
            return new String[]{" Ошибка: левая граница (" + start + ") > правой (" + end + ")"};
        }

        char[] symbols = new char[(end - start + 1)];
        for (int i = 0; i <= (end - start); i++) {
            symbols[i] = (char) (start + i);
        }

        String sortedSymbols;
        if (direction) {
            sortedSymbols = new String(symbols);
        } else {
            StringBuilder reversedSymbols = new StringBuilder(new String(symbols));
            sortedSymbols = reversedSymbols.reverse().toString();
        }

        int stringLength = sortedSymbols.length();
        String[] triangleArray = new String[stringLength];

        for (int i = 0; i < stringLength; i++) {
            String spaces = " ".repeat(stringLength - i - 1);
            String lettersLine = String.valueOf(sortedSymbols.charAt(i)).repeat(2 * i + 1);
            triangleArray[i] = spaces + lettersLine + spaces;
        }
        return triangleArray;
    }

    private static void displayTriangle(String[] triangleArray) {
        for (String line : triangleArray) {
            System.out.println(line);
        }
        System.out.println(" ");
    }
}