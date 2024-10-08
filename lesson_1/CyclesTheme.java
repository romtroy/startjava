public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int number1 = -10;
        int number2 = 21;
        int evennumbers = 0; 
        int oddnumbers = 0;
        System.out.print("В отрезке [" + number1 + ", " + number2 + "]");
        do {
            if (number1 % 2 == 0) {
                evennumbers = evennumbers + number1;
            } else if (number1 % 2 != 0) {
                oddnumbers += number1;
            }
            number1++;
        } while (number1 <= number2);
        
        System.out.println(" сумма четных чисел = " + evennumbers + ", а нечетных =  " + oddnumbers);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int numberberA = -3;
        int numberberB = 10;
        int numberberC = 5;
        int maxnumberber = 0;
        int minnumberber = 0;

        if (numberberA >= numberberB && numberberA >= numberberC && numberberB >= numberberC) {
            maxnumberber = numberberA;
            minnumberber = numberberC;
            System.out.println("max: " + numberberA + " min: " + numberberC);       
        } else if (numberberA >= numberberB && numberberA >= numberberC && numberberC >= numberberB) {
            maxnumberber = numberberA;
            minnumberber = numberberB;
            System.out.println("max: " + numberberA + " min: " + numberberB);
        }
        if (numberberB >= numberberA && numberberB >= numberberC && numberberA >= numberberC) {
            maxnumberber = numberberB;
            minnumberber = numberberC;
            System.out.println("max: " + numberberB + " min: " + numberberC);
        } else if (numberberB >= numberberA && numberberB >= numberberC && numberberC >= numberberA) {
            maxnumberber = numberberB;
            minnumberber = numberberA;
            System.out.println("max: " + numberberB + " min: " + numberberA);
        }
        if (numberberC >= numberberA && numberberC >= numberberB && numberberA >= numberberB) {
            maxnumberber = numberberC;
            minnumberber = numberberB;
            System.out.println("max: " + numberberC + " min: " + numberberB);
        } else if (numberberC >= numberberA && numberberC >= numberberB && numberberB >= numberberA) {
            maxnumberber = numberberC;
            minnumberber = numberberA;
            System.out.println("max: " + numberberC + " min: " + numberberA);
        }
        for (int i = minnumberber; i <= maxnumberber; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int numberberTask3 = 1234;
        int i = 0;
        int sum = 0;
        while (i < 4) {
            int m = numberberTask3 % 10;
            numberberTask3 = numberberTask3 / 10;
            System.out.print(m);
            sum = sum + m;
            i++;
        }
        System.out.println("\n" + sum);
        
        System.out.println("\n4. Вывод чисел в несколько строк");
        int numberA = 1;
        int numberB = 24;
        int counter = 0;
        int zero = 0;
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
        int x = 3242592;
        int quantityTwo = 0;
        System.out.print("В " + x);
        while (x > 0) {  
            int numberberX = x % 10; 
            if (numberberX == 2) {
                quantityTwo++;
            }
            x /= 10;
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
        
        int z = 0;
        for (i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                z = i * j;
                if (j == 1) {
                    System.out.printf("%5d", z);
                    System.out.print("|");
                } else {
                    System.out.printf("%5d", z);
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