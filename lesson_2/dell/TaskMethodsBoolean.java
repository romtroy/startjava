public class TaskMethodsBoolean {
    String methodName;
        
    public void doesContinue() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> программа выполняется далее или завершается?\n");
    }

    public void isDeletedFromHddOrFlash() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> удалился ли файл на жестком диске или флешке?\n");
    }
    
    public void isContainUniqueNumber() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> последовательность содержит уникальную цифру?\n");
    }
    
    public void isLetterOrSmt() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> пользователь ввел букву или что-то другое?\n");
    }
    
    public void isEqualDigits() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> в проверяемых числах, есть равные цифры?\n");
    }
    
    public void areAttemptsMarioGame() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> в игре \"Марио\" остались попытки?\n");
    }
            
    public void isEmptyOrSpaces() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> пользователь ввёл пустую строку или из одних пробелов?\n");
    }
    
    public void isEvenNumberTurnPc() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> на кубике, который бросил компьютер, выпало четное число?\n");
    }
    
    public void isValidPathToFile() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> путь до файла, который вы ищите на ssd, действительный ?\n");
    }
    
    public void isFileExist() {
        String methodName = TaskMethodStatic.getMethodName();
        System.out.println(methodName + "() -> файл по указанному адресу существует?\n");
    }
}
