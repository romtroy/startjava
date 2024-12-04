public class TaskMethods {
    public static void main(String[] args) {
        callNoBooleanMethods(); 
        callBooleanMethods(); 
    }
    
    private static void callNoBooleanMethods() {
        NoBooleanMethods part1 = new NoBooleanMethods();
        part1.findMostLongWord();
        part1.chooseMenuItem();
        part1.calculateAverageRating();
        part1.countUniqueWords();
        part1.showError();
        part1.syncCloudStorage();
        part1.restoreBackup();
        part1.pauseDownload();
        part1.resetVacuum();
        part1.writeToFile();
        part1.toFahrenheit();
        part1.enterMathExpression();
        part1.determineWinner();
        part1.findBookByAuthor();
    }
    
    private static void callBooleanMethods() {
        BooleanMethods part2 = new BooleanMethods();
        System.out.println(part2.isContinue());
        System.out.println(part2.isDeleted());
        System.out.println(part2.isContainUniqueNumber());
        System.out.println(part2.isLetterOrSmt());
        System.out.println(part2.isEqualDigits());
        System.out.println(part2.isAttemptsGame());
        System.out.println(part2.isEmptyOrSpaces());
        System.out.println(part2.isEvenNumber());
        System.out.println(part2.isValidPath());
        System.out.println(part2.isFileExist());
    }
}