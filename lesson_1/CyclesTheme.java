public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEvenNumbers = 0; 
        int sumOddNumbers = 0;
        System.out.print("В отрезке [" + startRange + ", " + endRange + "]");
        do {
            if (startRange % 2 == 0) {
                sumEvenNumbers += startRange;
            } else { 
                sumOddNumbers += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        
        System.out.println(" сумма четных чисел = " + sumEvenNumbers + ", а нечетных =  " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = -3;
        int b = 5;
        int c = 10;
        int maxNumber = 0;
        int minNumber = 0;

        if (a > b && a > c && b > c) {
            maxNumber = a;
            minNumber = c;
        } else if (a > b && a > c && c > b) {
            maxNumber = a;
            minNumber = b;    
        } else if (b > a && b > c && a > c) {
            maxNumber = b;
            minNumber = c;
        } else if (b > a && b > c && c > a) {
            maxNumber = b;
            minNumber = a;
        } else if (c > a && c > b && b > a) {
            maxNumber = c;
            minNumber = a;
        } else if (c > a && c > b && a > a) {
            maxNumber = c;
            minNumber = b;
        }
        System.out.println("max: " + maxNumber + " min: " + minNumber);
        for (int i = (minNumber + 1); i < maxNumber; i++) {
            System.out.print(i + " ");
        }
            
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int workNumber = 1234;
        int workNumberCopy = workNumber;
        System.out.print("Реверсивное число: ");
        int sum = 0;
        while (workNumber > 0) {
            int temporaryVariable = workNumber % 10;
            workNumber /= 10;
            System.out.print(temporaryVariable);
            sum += temporaryVariable;
            workNumberCopy++;
        }
        System.out.println("\n" + "Сумма цифр: " + sum);
 
        System.out.println("\n4. Вывод чисел в несколько строк");
        int numberA = 1;
        int numberB = 24;
        int counter = 0;
        int zero = 0;
        int i;
        for (i = numberA; i <= numberB; i += 2) {
            if (counter % 5 != 0) {
                System.out.printf("%2d ", i);
            }
            if (counter % 5 == 0) {
                System.out.println(" ");
                System.out.printf("%2d ", i);
            }           
            counter++;
        }
        if (counter % 5 != 0) {
            do {
                counter++;
                System.out.printf("%2d ", zero);
            } while (counter % 5 != 0);
        }
            
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int numberResearch = 3242592;
        int quantityTwo = 0;
        System.out.print("В " + numberResearch);
        while (numberResearch > 0) {  
            int numberResearchTemporary = numberResearch % 10; 
            if (numberResearchTemporary == 2) {
                quantityTwo++;
            }
            numberResearch /= 10;
        }
        boolean oddOreverseNumberen = (quantityTwo % 2 == 0);
        String oddOreverseNumberenString;
        if (oddOreverseNumberen) {
            oddOreverseNumberenString = " чётное";
        } else {
            oddOreverseNumberenString = " нечётное";
        }
        System.out.println(oddOreverseNumberenString + " количество двоек — " + quantityTwo);
        
        System.out.println("\n6. Отображение геометрических фигур");
        for (int square = 1; square < 6; square++) {
            System.out.println("**********");
        }
        System.out.println();
        int triangle;
        for (triangle = 5; triangle > 0; triangle--) {
            for (int j = triangle; j > 0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        String str = "$";
        
        i = 0;
        do {
            System.out.println(str.repeat(++i));
        } while (i < 3);
        do {
            System.out.println(str.repeat(--i));
        } while (i > 1);
        
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        char asciiSymbol = 33;
        for (i = 33; i <= 47; i += 2) {
            String template = ("  " + (int) asciiSymbol + "          %c      " + "%-1s ");
            System.out.println(String.format(template, asciiSymbol, (Character.getName(asciiSymbol))));
            asciiSymbol += 2;
        }
        asciiSymbol = 98;
        for (i = 98; i <= 122; i += 2) {
            String template = ("%4d " + "%10c " + "     %-30s " + '\n');
            System.out.printf(String.format(template, (int) asciiSymbol, asciiSymbol, 
                    (Character.getName(asciiSymbol))));
            asciiSymbol += 2;
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
     
        int number = 1234321;
        int reverseNumber = 0;
        int temporaryVariable = 0;
        int originalNumber = number;

        while (number != 0) {
            reverseNumber = number % 10;
            temporaryVariable = temporaryVariable * 10 + reverseNumber;
            number /= 10;
        }
        if (originalNumber == temporaryVariable) {
            System.out.println("число " + originalNumber + " является палиндромом");
        } else {
            System.out.println("число " + originalNumber + " не является палиндромом");
        }
            
        System.out.println("\n9. Проверка, является ли число счастливым");
        number = 123321;
        originalNumber = number;
        int firstNumber = 0;
        int secondNumber = 0;
        counter = 0;
        while (number != 0) {
            int singleNumber = number % 10;
            number = number / 10;
            if (counter < 3) {
                secondNumber += singleNumber;
            } else {
                firstNumber += singleNumber;
            }
            counter++;
        }
        String happyWord;
        if (firstNumber == secondNumber) {
            happyWord = " является ";
        } else {
            happyWord = " не является ";
        }
        System.out.println("Число " + originalNumber + happyWord + "счастливым");
        System.out.println("Сумма цифр ABC = " + firstNumber + " , а сумма DEF = " + secondNumber);
        
        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        
        int k = 0;
        for (i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                k = i * j;
                if (j == 1) {
                    System.out.printf("%5d", k);
                    System.out.print("|");
                } else {
                    System.out.printf("%5d", k);
                }
            }
            if (i == 1) {
                System.out.println();
                System.out.print("_______________________________________________");
            }
            System.out.println();
        }
    }
}