public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String gender = "male";
        if (gender == "male") {
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
        if ( firstLetterName == 'M') {
            System.out.println("Певая буква имени " + firstLetterName);
        } else if ( firstLetterName == 'I'){
            System.out.println("Певая буква имени " + firstLetterName);
        } else {
            System.out.println("Певая буква имени " + firstLetterName);
        }
        
        System.out.println('\n' + "2. Поиск большего числа");
        int x = 15;
        int y = 20;
        if ( x > y) {
            System.out.println(x + " > " + y);
        } else if (x < y) {
            System.out.println(x + " < " + y);
        } else if (x == y) {
            System.out.println(x + " = " + y);
        } else System.out.println("не корректное значение ");
        
        System.out.println('\n' + "3. Проверка числа");
        int checkNumber = -10;
        switch (checkNumber) {
        case 0:
            System.out.println("число равно нулю ");
            break;
        }
        boolean evenOrOdd = ( checkNumber % 2 == 0);
        String evenOrOddValue;
        if (evenOrOdd == true) {
            evenOrOddValue = " чётное ";
        } else {
            evenOrOddValue = " не чётным ";
        }
        
        if (checkNumber > 0) {
            System.out.println(checkNumber + " является положительным и" + evenOrOddValue);
        } else {
            System.out.println(checkNumber + " является отрицательным и" + evenOrOddValue);
        }
        
        System.out.println('\n' + "4. Поиск одинаковых цифр в числах");
        int numberA = 523;
        int numberB = 223;
        int number;
        boolean isNoEqualNumbers = false;
        int numberA1 = numberA / 100;
        int numberA2 = (numberA % 100) / 10;
        int numberA3 = numberA % 10;
        int numberB1 = numberB / 100;
        int numberB2 = (numberB % 100) / 10;
        int numberB3 = numberB % 10;
        if ((numberA1 != numberB1) & (numberA2 != numberB2) & (numberA3 != numberB3)) {
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
        
        System.out.println('\n' + "5. Определение символа по его коду");
        char simbol = '\u0057' ;//'\u0057' '\u005E' '\u0031'
        boolean isASCIILetter = (simbol >= 'A' && simbol <= 'Z') || (simbol >= 'a' && simbol <= 'z');
        boolean isASCIIDigit = (simbol >= '0' & simbol <= '9');
        if (isASCIILetter == true) {
            if (isASCIILetter = (simbol >= 'A' && simbol <= 'Z')) {
                System.out.println("Символ " + simbol + " является большой буквой");
            } else if (isASCIILetter = (simbol >= 'a' && simbol <= 'z')) {
                System.out.println("Символ " + simbol + " является мален буквой");
            }
        }
        if (isASCIIDigit == true) {
            System.out.println("Символ " + simbol+ " является цифрой");
        }
        if ((isASCIIDigit == false) & (isASCIILetter == false)) {
            System.out.println("Символ " + simbol + "не буква и не цифра " );
        }
        
        System.out.println('\n' + "6. Подсчет суммы вклада и начисленных банком ");
        int depositAmount = 301000;
        double percentYear = 0;
        if (depositAmount < 100000) {
            percentYear = 5;
        } else if ((depositAmount >= 100000) & (depositAmount < 300000)) {
            percentYear = 7;
        } else if (depositAmount >= 300000) {
            percentYear = 10;
        }
        double depositAmountWithPercent = depositAmount + (depositAmount*(percentYear/100));
        System.out.println("сумму вклада: " + depositAmount +
                "\nсуммa начисленного " + percentYear +"%: " + (depositAmount*(percentYear/100)) +
                "\nитоговая сумма с %: " + depositAmountWithPercent);
        
        System.out.println('\n' + "7. Определение оценки по предметам");
        int historyPercent = 59;
        int codingPercent = 92;
        int gradeHistory = 0;
        int gradeCoding = 0;
        if (historyPercent > 91) {
            gradeHistory = 5;
            System.out.println("История: " + gradeHistory);
        } else if (historyPercent < 91 & historyPercent >= 73) {
            gradeHistory = 4;
            System.out.println("История: " + gradeHistory);
        } else if (historyPercent < 73 & historyPercent >= 60) {
            gradeHistory = 3;
            System.out.println("История: " + gradeHistory);
        } else if (historyPercent < 60) {
            gradeHistory = 2;
            System.out.println("История: " + gradeHistory);
        }
        if (codingPercent > 91) {
            gradeCoding = 5;
            System.out.println("программирование: " + gradeCoding);
        } else if (codingPercent < 91 & codingPercent >= 73) {
            gradeCoding = 4;
            System.out.println("программирование: " + gradeCoding);
        } else if (codingPercent < 73 & codingPercent >= 60) {
            gradeCoding = 3;
            System.out.println("программирование: " + gradeCoding);
        } else if (codingPercent < 60) {
            gradeCoding = 2;
            System.out.println("программирование: " + gradeCoding);
        }
        System.out.println("средний балл оценок по предметам: " + ((gradeHistory + gradeCoding) / 2));
        System.out.println("средний % по предметам: " + ((historyPercent + codingPercent) / 2));
        
        System.out.println('\n' + "8. Расчет годовой прибыли");
        int monthProductsSale = 13000;
        int rentRooms = 5000;
        int productionCost = 9000;
        int monthYear = 12;
        int yearIncome = (monthProductsSale * monthYear) - ((rentRooms + productionCost) * 12);
        if (yearIncome > 0 ) {
            System.out.println("Прибыль за год: +" + yearIncome);
        } else if (yearIncome <= 0 ) {
            System.out.println("Прибыль за год: " + yearIncome);
        }
    }
}