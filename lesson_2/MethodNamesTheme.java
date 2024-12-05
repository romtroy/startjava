public class MethodNamesTheme {
    public static void main(String[] args) {
        callNoBooleanMethods(); 
        callBooleanMethods(); 
    }
    
    private static void callNoBooleanMethods() {
        NoBooleanMethods nonBm = new NoBooleanMethods();
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
    
    private static void callBooleanMethods() {
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