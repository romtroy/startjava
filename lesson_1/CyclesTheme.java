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

        if (a > b && a > c) {
            maxNumber = a;
            if (b > c) {
                minNumber = c;
            } else {
                minNumber = b;
            }
        }
        if (b > a && b > c) {
            maxNumber = b;
            if (a > c) {
                minNumber = c;
            } else {
                minNumber = a;
            }
        } else {
            maxNumber = c;
            minNumber = a;
        }
        System.out.println("max: " + maxNumber + " min: " + minNumber);
        for (int i = (minNumber + 1); i < maxNumber; i++) {
            System.out.print(i + " ");
        }
            
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int workNumber = 1234;
        System.out.print("Реверсивное число: ");
        int sum = 0;
        while (workNumber > 0) {
            int digit = workNumber % 10;
            workNumber /= 10;
            System.out.print(digit);
            sum += digit;
        }
        System.out.println("\n" + "Сумма цифр: " + sum);
 
        System.out.println("\n4. Вывод чисел в несколько строк");
        int numberA = 1;
        int numberB = 23;
        int counter = 0;
        int i;
        for (i = numberA; i <= numberB; i += 2) {
            if (counter % 5 == 0) {
                System.out.println(" ");
            }    
            System.out.printf("%2d ", i);
            counter++;
        }
        if (counter % 5 != 0) {
            do {
                counter++;
                System.out.printf("%2d ", 0);
            } while (counter % 5 != 0);
        }
            
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        workNumber = 3242592;
        int twosCount = 0;
        System.out.print("В " + workNumber);
        while (workNumber > 0) {  
            if (workNumber % 10 == 2) {
                twosCount++;
            }
            workNumber /= 10;
        }
        boolean oddOreverseNumber;
        String oddOrEven = " нечётное";
        if (oddOreverseNumber = (twosCount % 2 == 0)) {
            oddOrEven = " чётное";
        }
        System.out.println(oddOrEven + " количество двоек — " + twosCount);
        
        System.out.println("\n6. Отображение геометрических фигур: ");
        for (int square = 1; square < 6; square++) {
            System.out.println("**********");
        }
        System.out.println();
    
        int triangleX = 5; 
        int triangleY;      
        while (triangleX > 0) {
            triangleY = triangleX;
            while (triangleY > 0) {
                System.out.print("#");
                triangleY--;
                if (triangleY == 0) {
                    System.out.println();
                }
            }
            triangleX--; 
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
        for (i = 33; i <= 47; i += 2) {
            String template = ("  " + (int) i + "          %c            " + "%-10s " + '\n');
            System.out.printf(template, i, (Character.getName(i)));
        }
        for (i = 98; i <= 122; i += 2) {
            String template = ("%4d " + "%10c " + "           %-10s " + '\n');
            System.out.printf(template, (int) i, i, (Character.getName(i)));
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        workNumber = 1234321;
        int remainder = 0;
        int reverseNumber = 0;
        int originalworkNumber = workNumber;
        while (workNumber > 0) {
            remainder = workNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            workNumber /= 10;
        }
        if (originalworkNumber == reverseNumber) {
            System.out.println("число " + originalworkNumber + " является палиндромом");
        } else {
            System.out.println("число " + originalworkNumber + " не является палиндромом");
        }
                 
        System.out.println("\n9. Проверка, является ли число счастливым");
        int number = 123321;
        int originalNumber = number;
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