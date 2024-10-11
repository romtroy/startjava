public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int numberFirst = -10;
        int numberLast = 21;
        int oddNumbersSumSum = 0; 
        int oddNumbers = 0;
        System.out.print("В отрезке [" + numberFirst + ", " + numberLast + "]");
        do {
            if (numberFirst % 2 == 0) {
                oddNumbersSumSum = oddNumbersSumSum + numberFirst;
            } else if (numberFirst % 2 != 0) {
                oddNumbers += numberFirst;
            }
            numberFirst++;
        } while (numberFirst <= numberLast);
        
        System.out.println(" сумма четных чисел = " + oddNumbersSumSum + ", а нечетных =  " + oddNumbers);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int numberA = -3;
        int numberB = 5;
        int numberC = 10;
        int maxNumber = 0;
        int minNumber = 0;

        if (numberA > numberB && numberA > numberC) {
            maxNumber = numberA;
        } else if (numberB > numberA && numberB > numberC) {
            maxNumber = numberB;
        } else if (numberC > numberA && numberC > numberB) {
            maxNumber = numberC;
        }
        if (numberA < numberB && numberA < numberC) {
            minNumber = numberA;
        } else if (numberB < numberA && numberB < numberC) {
            minNumber = numberB;
        } else if (numberC < numberA && numberC < numberB) {
            minNumber = numberC;
        }
        System.out.println("max: " + maxNumber + " min: " + minNumber);
        for (int i = (minNumber + 1); i < maxNumber; i++) {
            System.out.print(i + " ");
        }
            
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int workNumber = 1234;
        int numberReversCount = workNumber;
        int countNumber = 0;
        do {
            countNumber++;
            numberReversCount /= 10;   
        } while (numberReversCount != 0);
        System.out.println("Количество чисел: " + countNumber);
        System.out.print("Реверсивное число: ");
        int sum = 0;
        while (numberReversCount < countNumber) {
            int m = workNumber % 10;
            workNumber = workNumber / 10;
            System.out.print(m);
            sum = sum + m;
            numberReversCount++;
        }
        System.out.println("\n" + "Сумма цифр: " + sum);
 
        System.out.println("\n4. Вывод чисел в несколько строк");
        numberA = 1;
        numberB = 24;
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
            int numberbernumberResearch = numberResearch % 10; 
            if (numberbernumberResearch == 2) {
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
        i = 0;
        int originalNumber = number;

        while (number != 0) {
            reverseNumber = number % 10;
            i = i * 10 + reverseNumber;
            number = number / 10;
        }
        if (originalNumber == i) {
            System.out.println("число " + originalNumber + " является палиндромом");
        } else {
            System.out.println("число " + originalNumber + " не является палиндромом");
        }
            
        System.out.println("\n9. Проверка, является ли число счастливым");
        number = 123321;
        originalNumber = number;
        int firstNumber = 0;
        int secondNumber = 0;
        i = 0;
        while (number != 0) {
            int singleNumber = number % 10;
            number = number / 10;
            if (i < 3) {
                secondNumber = secondNumber + singleNumber;
            } else {
                firstNumber = firstNumber + singleNumber;
            }
            i++;
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