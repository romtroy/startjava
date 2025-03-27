package com.startjava.lesson_2_3_4.array;

public class TriangleSymbolSorted {
    public static void main(String[] args) {
        StringBuilder triangle1 = formTriangle('0', '9', true);
        displayTriangle(triangle1);

        StringBuilder triangle2 = formTriangle('/', '!', false);
        displayTriangle(triangle2);

        StringBuilder triangle3 = formTriangle('A', 'J', false);
        displayTriangle(triangle3);
    }

    private static StringBuilder formTriangle(char start, char end, boolean direction) {
        if (start > end) {
            return new StringBuilder("Ошибка: левая граница (" + start + ") > правой (" + end + ")");
        }
        int count = (end - start + 1);
        char[] symbols = new char[count];
        for (int i = 0; i < count; i++) {
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
        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            String spaces = " ".repeat(stringLength - i - 1);
            String lettersLine = String.valueOf(sortedSymbols.charAt(i)).repeat(2 * i + 1);
            triangle.append(spaces).append(lettersLine).append(spaces).append("\n");
        }
        return triangle;
    }

    private static void displayTriangle(StringBuilder triangle) {
        System.out.println(triangle);
    }
}