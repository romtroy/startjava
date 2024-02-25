import java.util.concurrent.ThreadLocalRandom;

public class VariableNamesTheme {   
    public static void main(String[] args) {
        /* Разные переменные */
        //цифра
        System.out.println("1. Разные переменные: ");
        byte numberA = 100;
        System.out.println("переменная типа byte a = " + numberA);
        
        //сумма чисел
        short sum = (short) (numberA + numberA);
        System.out.println("сумма двух чисел sum = " + sum);
        
        //произведение цифр
        int multiplicationOfNumber = numberA * sum;
        System.out.println("произведение = " + multiplicationOfNumber);
        
        //максимальное число
        long maxNumber = 9223372036854775807L;
        System.out.println("максимальное число = " + maxNumber);
        
        //количество десятков
        int numbersOfTen = multiplicationOfNumber / 10;
        System.out.println("количество десятков d = " + numbersOfTen + " в переменной b");
        
        //вес собаки
        float dogWeight = 15.3f;
        System.out.println("вес собаки = " + dogWeight + "кг");
        
        //исходное число ???
        multiplicationOfNumber = numberA * sum;
        System.out.println("произведение multiplicationOfNumber = " + multiplicationOfNumber + " исходное число а" + numberA);
        
        //процент по вкладу
        double percentDeposit = 1000 * 0.12;
        System.out.println("12 процентов по вкладу на 1000р составляют " + percentDeposit + " рублей");
        
        //(переменная хранит символ) &
        char charForSymbol = '&';
        System.out.println("Символ & в char: " + charForSymbol);
        
        //код ошибки
        int error = 10;
        String formattedNumber = String.format("%04d", error);
        System.out.println("Код ошибки:  " + formattedNumber);
        
        //тип сообщения
        String textType = " тип сообщения ";
        System.out.println(textType);

        //число нулей
        int numbersOfZero = 000;
        String formattedNumber2 = String.format("%04d", numbersOfZero);
        System.out.println("число нулей: " + formattedNumber2);
        
        //уникальное число ???
        int uniqueNumber = 12345;
        System.out.println("уникальное число : " + uniqueNumber);

        //случайное число
        int randNumber = ThreadLocalRandom.current().nextInt();
        System.out.println("Случайное число: " + randNumber);
        
        //математическое выражение
        int mathExprtession = (multiplicationOfNumber / numbersOfTen);
        System.out.println("математическое выражение math: " + multiplicationOfNumber +" / " + numbersOfTen + " = " + mathExprtession);
        
        //выбор (чего-либо) ???
        byte choice1 = 1, choice2 = 2;
        System.out.println("Выберите пункт меню " + choice1 + " или " + choice2);
        
        //счет (в игре)
        byte team1 = 2, team2 = 3;
        System.out.println("счёт в игре: " + team1 + ":" + team2);
        
        //максимальная длина (строки)
        int stringMaxLength = 2147483647;
        System.out.println("Максимальная длина строки " + stringMaxLength);
        
        //пункт меню
        String item = "1. пункт меню";
        System.out.println(item);
        
        //стоимость кофе на вынос
        double price = 155.5;
        System.out.println("Цена кофе: " + price + "рублей");
        
        //дата начала (чего-либо)
        byte day = 15, month = 02; 
        short year = 2024;
        System.out.println("Дата: " + day + "." + month + "." + year);
        
        //окончание диапазона???
        int[] myArray = new int[10]; 
        System.out.println("окончание диапазона: " + myArray.length);

        //полное имя работника месяца
        String name = "Иван", surname = "Иванов", surname2 = "Иванович";
        System.out.println("имя работника: " + name + surname + surname2);
        
        //заголовок электронной книги
        String title = "Java. Руководство для начинающих";
        System.out.println("заголовок электронной книги:" + title);
        
        //размер
        double size = 3.5;
        System.out.println("размер: " + size + " метра");
        
        //вместимость (чего-либо)
        long capacity = 512;
        System.out.println("вместимость: " + capacity + "Gb");
        
        //счетчик
        int count2 = 0;
        count2++;
        System.out.println("Счётчик: " + count2);
        
        //путь до файла
        String pathToFile = "D:/java/lesson1/";
        System.out.println(pathToFile);
        
        //количество чисел в каждой строке
        String text = "данный текст №1 содержит 2 цыфры";
        long count = text.codePoints().filter(Character::isDigit).count();
        System.out.println("количество чисел в тексте: " + count + "\n");

        /* Разные переменные */
        //цифра
        System.out.println("2. boolean-переменные: ");
        
        //сотни равны?
        numberA = 100;
        boolean isHundredEqual = (numberA == 100);
        System.out.println("равны ли сотни: " +isHundredEqual);
        
        //компьютер включен?
        boolean isPCTurnOn = false;
        System.out.println("компьютер включен: " + isPCTurnOn);
        
        //есть равные цифры?
        boolean isNumbersEqual;
        choice1 = 2;
        choice2 = 3;
        isNumbersEqual = (choice1 == choice2);
        System.out.println("цифры равны: " + isNumbersEqual);
        
        //(что-либо) создано?
        boolean isObjectExist = false;
        System.out.println("объект создан: " + isObjectExist);
        
        //(что-либо) пустое?
        String stringConsist = null;
        boolean isStringEmpty = ( stringConsist == null);
        System.out.println("что-либо пустое " + isStringEmpty);
        
        //(что-либо) активное?
        boolean isPowerActiv = true;
        System.out.println("Питание активно: " + isPowerActiv);
        
        //новый?
        boolean isSmtNew = false;
        System.out.println("новый: " + isSmtNew);
        
        //электронная почта действительная?
        boolean isEmailActiv = true;
        System.out.println("e-mail активен: " + isEmailActiv);
        
        //имеются уникальные строки?
        boolean isStringTheSame = (surname == surname2);
        System.out.println("Наличие уникальных строк: " + isStringTheSame + "\n");
        
        System.out.println("3. Аббревиатуры");
        
        //старый universally unique identifier
        String oldUUIdentifier = "старый Universally Unique Identifier ";
        System.out.print(oldUUIdentifier);

        //производитель оперативной памяти
        String manufacturerMemory = "производитель оперативной памяти";
        System.out.println(manufacturerMemory);
                
        //емкость жесткого диска
        String capacityHDD = "емкость жесткого диска";
        System.out.println(capacityHDD);

        //протокол передачи гипертекста
        String hypertextProtocol = "протокол передачи гипертекста";
        System.out.println(hypertextProtocol);

        //сокращенный uniform resource locator
        String shortURL = "сокращенный uniform resource locator";
        System.out.println(shortURL);

        //новый идентификатор клиента
        String newIdentifierClient = "новый идентификатор клиента";
        System.out.println(newIdentifierClient);

        //кодировка american standard code for information interchange
        String amercCodeForIntercharge = "american standard code for information interchange";
        System.out.println(amercCodeForIntercharge);
    }
}

//Над каждой переменной указывайте комментарий с ее описанием из ДЗ
