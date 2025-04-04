package com.startjava.lesson_2_3_4.method;

public class MethodNamesTheme {
    public static void main(String[] args) {
        doNoBooleanMethods(); 
        doBooleanMethods(); 
    }
    
    private static void doNoBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.chooseMenuItem();
        nonBm.calculateAverageRating();
        nonBm.countUniqueWords();
        nonBm.showError();
        nonBm.syncCloudStorage();
        nonBm.restoreBackup();
        nonBm.pauseDownload();
        nonBm.resetVacuum();
        nonBm.writeToFile();
        nonBm.toFahrenheit();
        nonBm.enterMathExpression();
        nonBm.determineWinner();
        nonBm.findBookByAuthor();
    }
    
    private static void doBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isContinue());
        System.out.println(bm.isDeleted());
        System.out.println(bm.hasUniqueNumber());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isBlank());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isFileExist());
    }
}