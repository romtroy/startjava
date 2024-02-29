public class VariablesTheme {   
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера:");
        byte cpu = 4;
        short mhz = 3000;
        int ramMemory = 8388608; 
        int pricePc = 1500;
        long hddCapacity = 1073741824;
        float weightPc = 1.85f;
        double monitorSize = 13.3;
        char dollarSign = '\u0024';
        boolean avaiblePc = true;
        System.out.println("компьютер: cpu " + cpu + "core, " + mhz + "mhz");
        System.out.println("память " + ramMemory + " byte, hdd: " + hddCapacity + " byte");
        System.out.println("экран: " + monitorSize + " вес: " + weightPc + "кг");
        System.out.println("Наличие: " + avaiblePc + " цена: " + pricePc + dollarSign + "\n");
        
        System.out.println("2. Расчет стоимости товара со скидкой: ");
        int penCost = 100; 
        int bookCost = 200;
        double discount = 11;
        double priceNumberOfDiscount;
        double priceWithDiscount;
        double fullPrice = (penCost + bookCost);
        System.out.println("стоимость товаров без скидки: " + fullPrice + " руб.");
        priceNumberOfDiscount = ((penCost + bookCost) * (discount/100));
        System.out.println("суммa скидки: " + priceNumberOfDiscount + " руб.");
        priceWithDiscount = fullPrice - priceNumberOfDiscount;
        System.out.println("общую стоимость со скидкой: " + priceWithDiscount + " руб." + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a\n");
        
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMaxNumber = 127;
        short shortMaxNumber = 32767;
        int intMaxNumber = 2147483647;
        long longMaxNumber = 9223372036854775807L;
        System.out.println(byteMaxNumber);
        byteMaxNumber++;
        System.out.println(byteMaxNumber);
        byteMaxNumber--;
        System.out.println(byteMaxNumber);
        System.out.println(shortMaxNumber);
        shortMaxNumber++;
        System.out.println(shortMaxNumber);
        shortMaxNumber--;
        System.out.println(shortMaxNumber);
        System.out.println(intMaxNumber);
        intMaxNumber++;
        System.out.println(intMaxNumber);
        intMaxNumber--;
        System.out.println(intMaxNumber);
        System.out.println(longMaxNumber);
        longMaxNumber++;
        System.out.println(longMaxNumber);
        longMaxNumber--;
        System.out.println(longMaxNumber + "\n");
        
        System.out.println("5. Перестановка значений переменных");
        int x = 2;
        int y = 5;
        System.out.println("Исходные значения: x = " + x + " y = " + y);
        int swap = x;
        x = y;
        y = swap;
        System.out.println("меняем с помощью третьей переменной: x = " + x + " y = " + y);
        swap = x * y;
        x = swap / x;
        y = swap / y;
        System.out.println("меняем с помощью арифметических операций: x = " + x + " y = " + y);
        swap = x ^ y;
        x = swap ^ x;
        y = swap ^ y;
        System.out.println("меняем с помощью побитовой операции ^: x = " + x + " y = " + y + "\n");

        System.out.println("6. Вывод символов и их кодов");
        dollarSign = 36; // $ 
        char starSign = '\u002A'; //  *
        char atSign = '\u0040'; //  @
        char lineSign = '\u007C'; // | 
        char tildeSign = '\u007E'; // ~ 
        System.out.println("код символа " + (int)dollarSign + " = " + (char)dollarSign);
        System.out.println("код символа " + (int)starSign + " = " + (char)starSign);
        System.out.println("код символа " + (int)atSign + " = " + (char)atSign);
        System.out.println("код символа " + (int)lineSign + " = " + (char)lineSign);
        System.out.println("код символа " + (int)tildeSign + " = " + (char)tildeSign + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slashSign = 47; //  /
        char backSlashSign = 92; //  \
        char leftParenthesisSign = 40; //  (
        char rightParenthesisSign = 41; //  )
        char lowLineSign = 95; //  _
        System.out.println("    " + slashSign + backSlashSign);
        System.out.println("   " + slashSign + "  " + backSlashSign);
        System.out.println("  " + slashSign + lowLineSign + leftParenthesisSign + " " + 
                rightParenthesisSign + backSlashSign);
        System.out.println(" " + slashSign + "      " + backSlashSign);
        System.out.println("" + slashSign + lowLineSign + lowLineSign + lowLineSign + lowLineSign + 
                slashSign + backSlashSign + lowLineSign + lowLineSign + backSlashSign + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = (number % 10);
        int sumOfDigits = hundreds + tens + units;
        number = hundreds * tens * units;
        System.out.println("Число N содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + units);
        System.out.println("Сумма его цифр: " + sumOfDigits);
        System.out.println("Произведение: " + number + "\n");
        
        System.out.println("9. Вывод времени: ");
        int seconds = 86399;
        int hours = seconds / (60*60);
        int minutes = (seconds % (60*60) / 60);
        int seconds2 = (seconds % 60);
        System.out.println(hours + ":" + minutes + ":" + seconds2);

    }
}