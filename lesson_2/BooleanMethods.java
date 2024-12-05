public class BooleanMethods {
    public boolean isContinue() {
        System.out.print(CurrentMethod.getMethodName() + 
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isDeleted() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }
    
    public boolean hasUniqueNumber() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }
    
    public boolean isLetter() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }
    
    public boolean hasEqualDigits() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }
    
    public boolean hasAttempts() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }
            
    public boolean isBlank() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }
    
    public boolean isEvenNumber() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }
    
    public boolean isValidPath() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный ? ");
        return false;
    }
    
    public boolean isFileExist() {
        System.out.print("\n" + CurrentMethod.getMethodName() + 
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}