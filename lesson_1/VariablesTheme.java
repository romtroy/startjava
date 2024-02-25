public class VariablesTheme {   
    public static void main(String[] args) {
    
    System.out.println("1. Вывод характеристик компьютера:");
    byte cpu = 4;
    short mhz = 3000;
    int memory = 8388608;
    int price2 = 1500;
    long hdd = 1073741824;
    float weight = 1.85f;
    double monitor = 13.3;
    char m = '\u0024';
    boolean avaible = true;
    System.out.println("компьютер: cpu " + cpu + "core, " + mhz + "mhz");
    System.out.println("память " + memory + " byte, hdd: " + hdd + " byte");
    System.out.println("экран: " + monitor + " вес: " + weight + "кг");
    System.out.println("Наличие: " + avaible + " цена: " + price2 + m + "\n");
    
    System.out.println("2. Расчет стоимости товара со скидкой: ");
    int penCost = 100, bookCost = 200;
    double discount = 11, priceFull, priceNumberOfDiscount, priceWithDiscount;
    priceFull = (penCost + bookCost);
    System.out.println("стоимость товаров без скидки: " + priceFull + " руб.");
    priceNumberOfDiscount = ((penCost + bookCost) * (discount/100));
    System.out.println("суммa скидки: " + priceNumberOfDiscount + " руб.");
    priceWithDiscount = priceFull - priceNumberOfDiscount;
    System.out.println("общую стоимость товаров со скидкой: " + priceWithDiscount + " руб." + "\n");

    System.out.println("3. Вывод слова JAVA");
    System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a\nJ  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a\n");
    
    System.out.println("4. Вывод min и max значений целых числовых типов");
    byte byteMaxNumber = 127;
    short shortMaxNumber = 32767;
    int intMaxNumber = 2147483647;
    long longMaxNumber = 9223372036854775807L;
    System.out.println(byteMaxNumber);
    System.out.println(byteMaxNumber - 1);
    System.out.println(byteMaxNumber + 1);
    System.out.println(shortMaxNumber);
    System.out.println(shortMaxNumber - 1);
    System.out.println(shortMaxNumber + 1);
    System.out.println(intMaxNumber);
    System.out.println(intMaxNumber - 1);
    System.out.println(intMaxNumber + 1);
    System.out.println(longMaxNumber);
    System.out.println(longMaxNumber - 1);
    System.out.println(longMaxNumber + 1 + "\n");
    
    System.out.println("5. Перестановка значений переменных");
    int x2 = 2, y2 = 5, z2;
    System.out.println("Исходные значения: x2 = " + x2 + " y2 = " + y2);
    z2 = x2;
    x2 = y2;
    y2 = z2;
    System.out.println("меняем с помощью третьей переменной: x2 = " + x2 + " y2 = " + y2);
    z2 = x2 * y2;
    x2 = z2 / x2;
    y2 = z2 / y2;
    System.out.println("меняем с помощью арифметических операций: x2 = " + x2 + " y2 = " + y2);
    z2 = x2 ^ y2;
    x2 = z2 ^ x2;
    y2 = z2 ^ y2;
    System.out.println("меняем с помощью побитовой операции ^: x2 = " + x2 + " y2 = " + y2 + "\n");

    System.out.println("6. Вывод символов и их кодов");
    char char1, char2, char3, char4, char5;
    char1 = '\u0024'; // $ 
    char2 = '\u002A'; //  *
    char3 = '\u0040'; //  @
    char4 = '\u007C'; // | 
    char5 = '\u007E'; // ~ 
    System.out.println("код символа 36 = " + char1);
    System.out.println("код символа 42 = " + char2);
    System.out.println("код символа 64 = " + char3);
    System.out.println("код символа 124 = " + char4);
    System.out.println("код символа 126 = " + char5 + "\n");

    System.out.println("7. Вывод в консоль ASCII-арт Дюка");
    char1 = 47; //  /
    char2 = 92; //  \
    char3 = 40; //  (
    char4 = 41; //  )
    char5 = 95; //  _
    System.out.println("    " + char1 + char2);
    System.out.println("   " + char1 + "  " + char2);
    System.out.println("  " + char1 + char5 + char3 + " " + char4 + char2);
    System.out.println(" " + char1 + "      " + char2);
    System.out.println("" + char1 + char5 + char5 + char5 + char5 + char1 + char2 + char5 + char5 + char2 + "\n");

    System.out.println("8. Вывод количества сотен, десятков и единиц числа");
    int number, hundreds, tens, units, sumOfDigits;
    number = 123;
    hundreds = number / 100;
    tens = (number % 100) / 10;
    units = (number % 10);
    sumOfDigits = hundreds + tens + units;
    number = hundreds * tens * units;
    System.out.println("Число N содержит:");
    System.out.println("сотен - " + hundreds);
    System.out.println("десятков - " + tens);
    System.out.println("единиц - " + units);
    System.out.println("Сумма его цифр: " + sumOfDigits);
    System.out.println("Произведение: " + number + "\n");
    
    System.out.println("9. Вывод времени: ");
    int hours, minutes, seconds2, seconds;
    seconds = 86399;
    hours = seconds / (60*60);
    minutes = (seconds % (60*60) / 60);
    seconds2 = (seconds % 60);
    System.out.println(hours + ":" + minutes + ":" + seconds2);

    }
}