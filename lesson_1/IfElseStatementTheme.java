
public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String gender = "male";//.equals
        if (gender.equals("male")) {
            System.out.println("Мужской пол");
        } else {
            System.out.println("не мужской пол");
        }
        int age = 21;
        if (age > 18) {
            System.out.println("возраст больше " + age);
        } else {
            System.out.println("возраст меньше " + age);
        }
        double height = 1.75;
        if (height < 1.8) {
            System.out.println("рост меньше " + height);
        } else {
            System.out.println("рост больше " + height);
        }
        char firstLetterName = "Moodie".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Певая буква имени " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Певая буква имени " + firstLetterName);
        } else {
            System.out.println("Певая буква имени " + firstLetterName);
        }
        
        System.out.println("\n2. Поиск большего числа");
        int x = 5;
        int y = 10;
        if (x > y) {
            System.out.println(x + " > " + y);
        } else if (x < y) {
            System.out.println(x + " < " + y);
        } else if (x == y) {
            System.out.println(x + " = " + y);
        }
        
        System.out.println("\n3. Проверка числа");
        int checkNumber = 2;
        if (checkNumber == 0) {
            System.out.println("число равно нулю ");
        }
        boolean evenOrOdd = (checkNumber % 2 == 0);
        String evenOrOddValue;
        if (evenOrOdd && checkNumber != 0) {
            evenOrOddValue = " чётное ";
        } else {
            evenOrOddValue = " не чётное ";
        }
        if (checkNumber > 0) {
            System.out.println(checkNumber + " является положительным и" + evenOrOddValue);
        } else {
            System.out.println(checkNumber + " является отрицательным и" + evenOrOddValue);
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int numberA = 523;
        int numberB = 223;
        boolean isNoEqualNumbers = false;
        int numberA1 = numberA / 100;
        int numberA2 = (numberA % 100) / 10;
        int numberA3 = numberA % 10;
        int numberB1 = numberB / 100;
        int numberB2 = (numberB % 100) / 10;
        int numberB3 = numberB % 10;
        if ((numberA1 != numberB1) && (numberA2 != numberB2) && (numberA3 != numberB3)) {
            isNoEqualNumbers = true;
            System.out.println("равных цифр нет");
        }
        if (isNoEqualNumbers == false) {
            System.out.print("исходные числа: " +  numberA + ", " + numberB + ", ");
            if (numberA1 == numberB1) {
                System.out.print(" равные цифры в 1 разряде - " + numberA1 + ", ");
            }
            if (numberA2 == numberB2) {
                System.out.print(" равные цифры в 2 разряде - " + numberA2 + ", ");
            }
            if (numberA3 == numberB3) {
                System.out.println(" равные цифры в 3 разряде - " + numberA3);
        }
            }
        
        System.out.println("\n5. Определение символа по его коду");
        char simbol = '\u0057' ;//'\u0057' '\u005E' '\u0031'
        boolean isAsciiLetter = (simbol >= 'A' && simbol <= 'Z') || (simbol >= 'a' && simbol <= 'z');
        boolean isAsciiDigit = (simbol >= '0' && simbol <= '9');
        if (simbol >= 'A' && simbol <= 'Z') {
            System.out.println("Символ " + simbol + " является большой буквой");
        }
        else if (simbol >= 'a' && simbol <= 'z') {
            System.out.println("Символ " + simbol + " является маленькой буквой");
        }
        else if (simbol >= '0' && simbol <= '9') {
            System.out.println("Символ " + simbol+ " является цифрой");
        }
        else
            System.out.println("Символ " + simbol + " не буква и не цифра " );
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком");
        int depositAmount = 301000;
        double percentYear = 5;
        if ((depositAmount >= 100000) && (depositAmount < 300000)) {
            percentYear = 7;
        } else if (depositAmount >= 300000) {
            percentYear = 10;
        }
        double amountPercent = depositAmount * (percentYear / 100);
        System.out.println("сумму вклада: " + depositAmount +
                "\nсуммa начисленного " + percentYear + "%: " +  amountPercent +
                "\nитоговая сумма с %: " + (depositAmount + amountPercent));
        
        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent > 91) {
        } else if (historyPercent < 91 && historyPercent >= 73) {
            historyGrade = 4;
        } else if (historyPercent < 73 && historyPercent >= 60) {
            historyGrade = 3;
        } else if (historyPercent < 60) {
            historyGrade = 2;
        }
        int csPercent = 92;
        int csGrade = 5;
        if (csPercent > 91) {
        } else if (csPercent < 91 && csPercent >= 73) {
            csGrade = 4;
        } else if (csPercent < 73 && csPercent >= 60) {
            csGrade = 3;
        } else if (csPercent < 60) {
            csGrade = 2;
        }
        System.out.println("Программирование: " + csGrade);
        System.out.println("История: " + historyGrade);
        System.out.println("средний балл оценок по предметам: " + ((historyGrade + csGrade) / 2));
        System.out.println("средний % по предметам: " + ((historyPercent + csPercent) / 2));
        
        System.out.println("\n8. Расчет годовой прибыли");
        int monthProductsSale = 13000;
        int rentRooms = 5000;
        int productionCost = 9000;
        int monthYear = 12;
        int yearIncome = (monthProductsSale * monthYear) - (rentRooms + productionCost) * 12;
        if (yearIncome > 0) {
            System.out.println("Прибыль за год: +" + yearIncome);
        } else if (yearIncome <= 0 ) {
            System.out.println("Прибыль за год: " + yearIncome);
        }
    }
}
