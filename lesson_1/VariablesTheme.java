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
        char dollar = '\u0024';
        boolean avaiblePc = true;
        System.out.println("компьютер: cpu " + cpu + "core, " + mhz + "mhz");
        System.out.println("память " + ramMemory + " byte, hdd: " + hddCapacity + " byte");
        System.out.println("экран: " + monitorSize + " вес: " + weightPc + "кг");
        System.out.println("Наличие: " + avaiblePc + " цена: " + pricePc + dollar + "\n");
        
        System.out.println("2. Расчет стоимости товара со скидкой: ");
        int penCost = 100; 
        int bookCost = 200;
        double discount = 11;
        double fullPrice = (penCost + bookCost);
        System.out.println("стоимость товаров без скидки: " + fullPrice + " руб.");
        double discountPrice = (fullPrice * (discount / 100));
        System.out.println("суммa скидки: " + discountPrice + " руб.");
        double priceWithDiscount = fullPrice - discountPrice;
        System.out.println("общую стоимость со скидкой: " + priceWithDiscount + " руб." + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a\n");
        
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println(byteMax);
        System.out.println((byte)(byteMax++));
        System.out.println(byteMax--);
        System.out.println(shortMax);
        System.out.println((short)(shortMax++));
        System.out.println(shortMax--);
        System.out.println(intMax);
        System.out.println(intMax++);
        System.out.println(intMax--);
        System.out.println(longMax);
        System.out.println(longMax++);
        System.out.println((longMax--) + "\n");
        
        System.out.println("5. Перестановка значений переменных");
        int x = 2;
        int y = 5;
        System.out.println("Исходные значения: x = " + x + " y = " + y);
        int swap = x;
        x = y;
        y = swap;
        System.out.println("меняем с помощью третьей переменной: x = " + x + " y = " + y);
        System.out.println("Исходные значения: x = " + x + " y = " + y);
        x += y;
        y = x - y;
        x -= y;
        System.out.println("меняем с помощью арифметических операций: x = " + x + " y = " + y);
        System.out.println("Исходные значения: x = " + x + " y = " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("меняем с помощью побитовой операции ^: x = " + x + " y = " + y + "\n");

        System.out.println("6. Вывод символов и их кодов");
        dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("код символа " + (int) dollar + " = " + dollar);
        System.out.println("код символа " + (int) asterisk + " = " + asterisk);
        System.out.println("код символа " + (int) atSign + " = " + atSign);
        System.out.println("код символа " + (int) verticalBar + " = " + verticalBar);
        System.out.println("код символа " + (int) tilde + " = " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char lowLine = '_';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + lowLine + leftParenthesis + " " + 
                rightParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + lowLine + lowLine + lowLine + lowLine + 
                slash + backSlash + lowLine + lowLine + backSlash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = (number % 10);
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("Число N содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр: " + sum);
        System.out.println("Произведение: " + multiplication + "\n");
        
        System.out.println("9. Вывод времени: ");
        int ss = 86399;
        int hh = ss / (3600);
        int mm = (ss / 60 % 60);
        int seconds2 = (ss % 60);
        System.out.println(hh + ":" + mm + ":" + seconds2);
    }
}