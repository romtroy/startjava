package com.startjava.lesson_2_3_4.method.naming;

public class BooleanMethods {
    public boolean isContinue() {
        System.out.print(CurrentMethod.getName() + 
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean isDeleted() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> удалился ли файл на жестком диске или флешке? ");
        return false;
    }
    
    public boolean hasUniqueNumber() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }
    
    public boolean isLetter() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }
    
    public boolean hasEqualDigits() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }
    
    public boolean hasAttempts() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }
            
    public boolean isBlank() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }
    
    public boolean isEvenNumber() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }
    
    public boolean isValidPath() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный ? ");
        return false;
    }
    
    public boolean isFileExist() {
        System.out.print("\n" + CurrentMethod.getName() + 
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}