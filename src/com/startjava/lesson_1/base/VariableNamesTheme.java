package com.startjava.lesson_1.base;

import java.util.concurrent.ThreadLocalRandom;

public class VariableNamesTheme {   
    public static void main(String[] args) {
        System.out.println("1. Разные переменные: ");
        /*цифрa */
        int number = 100;
        System.out.println("переменная типа byte a = " + number);
        
        //сумма чисел
        int sum = (number + number);
        System.out.println("сумма двух чисел sum = " + sum);
        
        //произведение цифр
        int multiplicationNumbers = number * sum;
        System.out.println("произведение = " + multiplicationNumbers);
        
        //максимальное число
        long maxNumber = 9223372036854775807L;
        System.out.println("максимальное число = " + maxNumber);
        
        //количество десятков
        int numbersTens = multiplicationNumbers / 10;
        System.out.println("количество десятков d = " + numbersTens + " в переменной b");
        
        //вес собаки
        float dogWeight = 15.3f;
        System.out.println("вес собаки = " + dogWeight + "кг");
        
        //исходное число
        int originNumber = multiplicationNumbers / sum;
        System.out.println("исходное число: " + originNumber);

        //процент по вкладу
        double percentDeposit = 1000 * 0.12;
        System.out.println("12% по вкладу на 1000р составляют " + percentDeposit + " руб.");
        
        //(переменная хранит символ) &
        char ampersand = '&';
        System.out.println("Символ & в char: " + ampersand );
        
        //код ошибки
        int codeError = 10;
        System.out.printf("Код ошибки:  " + codeError + "\n");
        
        //тип сообщения
        String messageType = " тип сообщения ";
        System.out.println(messageType);

        //число нулей
        int numbersZeros = 000;
        String formattedNumber2 = String.format("%03d", numbersZeros);
        System.out.println("число нулей: " + formattedNumber2);
        
        //уникальное число
        int uniqueNumber = 12345;
        System.out.println("уникальное число : " + uniqueNumber);

        //случайное число
        int randomNumber = ThreadLocalRandom.current().nextInt();
        System.out.println("Случайное число: " + randomNumber);
        
        //математическое выражение
        int mathExprtession = (multiplicationNumbers / numbersTens);
        System.out.println("математическое выражение math: " + 
                multiplicationNumbers +" / " + numbersTens + " = " + mathExprtession);
        
        //выбор (чего-либо)
        int choice1 = 1, choice2 = 2;
        System.out.println("Выберите пункт меню " + choice1 + " или " + choice2);
        
        //счет (в игре)
        int pointsTeam1 = 2, pointsTeam2 = 3;
        System.out.println("счёт в игре: " + pointsTeam1 + ":" + pointsTeam2);
        
        //максимальная длина (строки)
        int maxStringLength = 2147483647;
        System.out.println("Максимальная длина строки " + maxStringLength);
        
        //пункт меню
        String item = "1. пункт меню";
        System.out.println(item);
        
        //стоимость кофе на вынос
        double cofePriceTakeAway = 155.5;
        System.out.println("Цена кофе: " + cofePriceTakeAway + "рублей");
        
        //дата начала (чего-либо)
        String startDate = "15.02.2024";
        System.out.println("Дата начала: " + startDate);
        
        //окончание диапазона
        int endRange = 10;
        System.out.println("окончание диапазона: " + endRange);

        //полное имя работника месяца
        String fullNameEmployeeMonth = "Иванов Иван Иванович";
        System.out.println("имя работника: " + fullNameEmployeeMonth);
        
        //заголовок электронной книги
        String ebookTitle = "Java. Руководство для начинающих";
        System.out.println("заголовок электронной книги:" + ebookTitle);
        
        //размер
        double size = 3.5;
        System.out.println("размер: " + size + " метра");
        
        //вместимость (чего-либо)
        long capacity = 512;
        System.out.println("вместимость: " + capacity + "Gb");
        
        //счетчик
        int counter = 0;
        counter++;
        System.out.println("Счётчик: " + counter);
        
        //путь до файла
        String pathToFile = "D:/java/lesson1/";
        System.out.println(pathToFile);
        
        //количество чисел в каждой строке
        String quantityNumbersEachLine = "данный текст №1 содержит 2 цифры";
        long countNumbers = quantityNumbersEachLine.codePoints().filter(Character::isDigit).count();
        System.out.println("количество чисел в тексте: " + countNumbers + "\n");

        System.out.println("2. boolean-переменные: ");
        //сотни равны?
        number = 100;
        boolean isHundredsEqual = (number == 100);
        System.out.println("равны ли сотни: " +isHundredsEqual);
        
        //компьютер включен
        boolean isPcTurnOn = false;
        System.out.println("компьютер включен: " + isPcTurnOn);
        
        //есть равные цифры
        boolean hasNumbersEqual;
        choice1 = 2;
        choice2 = 3;
        hasNumbersEqual = (choice1 == choice2);
        System.out.println("цифры равны: " + hasNumbersEqual);
        
        //(что-либо) создано
        boolean isCreated = false;
        System.out.println("объект создан: " + isCreated);
        
        //(что-либо) пустое
        String isEmpty = null;
        boolean isSomethingEmpty = ( isEmpty == null);
        System.out.println("что-либо пустое " + isSomethingEmpty);
        
        //(что-либо) активное
        boolean isActive = true;
        System.out.println("что-то активно: " + isActive);
        
        //новый?
        boolean isNew = false;
        System.out.println("новый: " + isNew);
        
        //электронная почта действительная?
        boolean isEmailActive = true;
        System.out.println("e-mail активен: " + isEmailActive);
        
        //имеются уникальные строки
        String surname = "Иванов";
        boolean hasUniqueString = (surname == "Иванов");
        System.out.println("Наличие уникальных строк: " + hasUniqueString + "\n");
        
        System.out.println("3. Аббревиатуры");
        
        //старый universally unique identifier
        String oldUuid = "старый Universally Unique Identifier ";
        System.out.println(oldUuid);

        //производитель оперативной памяти
        String ramManufacturer = "производитель оперативной памяти";
        System.out.println(ramManufacturer);
                
        //емкость жесткого диска
        String capacityHdd = "емкость жесткого диска";
        System.out.println(capacityHdd);

        //протокол передачи гипертекста
        String http = "протокол передачи гипертекста";
        System.out.println(http);

        //сокращенный uniform resource locator
        String shortUrl = "сокращенный uniform resource locator";
        System.out.println(shortUrl);

        //новый идентификатор клиента
        String newClientId = "новый идентификатор клиента";
        System.out.println(newClientId);

        //кодировка american standard code for information interchange
        String ascii = "american standard code for information interchange";
        System.out.println(ascii);
    }
}