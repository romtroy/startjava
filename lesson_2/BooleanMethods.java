public class BooleanMethods {
    public boolean isContinue() {
        System.out.print(ShowMethodName.getMethodName() + 
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isDeleted() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }
    
    public boolean isContainUniqueNumber() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }
    
    public boolean isLetterOrSmt() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }
    
    public boolean isEqualDigits() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }
    
    public boolean isAttemptsGame() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }
            
    public boolean isEmptyOrSpaces() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }
    
    public boolean isEvenNumber() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }
    
    public boolean isValidPath() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный ? ");
        return false;
    }
    
    public boolean isFileExist() {
        System.out.print("\n" + ShowMethodName.getMethodName() + 
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}