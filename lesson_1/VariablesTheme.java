public class VariablesTheme {	
	public static void main(String[] args) {
	int n, x, y, z, x2, y2, z2, x3, y3, z3, s, p, hours, minutes, seconds2, seconds;
	char ch1, ch2, ch3, ch4, ch5;
	double pr0, pr1, pr2;
	
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
	/*Вывод характеристик компьютера (это название задачи)
	объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
	в качестве значений используйте характеристики компьютера: 
	количество ядер, частота процессора и т. д.
	выведите в консоль:
	значения этих переменных
	описание характеристик
	*/

	System.out.println("2. Расчет стоимости товара со скидкой: ");
	x3 = 100;
	y3 = 200;
	z3 = 11;
	pr0 = (x3 + y3);
	System.out.println("стоимость товаров без скидки: " + pr0 + " руб.");
	pr1 = ((x3 + y3) * 0.11);
	System.out.println("сумму скидки " + pr1 + " руб.");
	pr2 = pr0 - pr1;
	System.out.println("общую стоимость товаров со скидкой " + pr2 + " руб.");

	System.out.println("3. Вывод слова JAVA");
	System.out.println("   J    a  v     v  a\nJ   a a  v   v  a a\nJ  J  aaaaa  V V  aaaaa\nJJ  a     a  V  a     a\n");
	
	System.out.println("4. Вывод min и max значений целых числовых типов");
	byte by = 127;
	short sh = 32767;
	int int2 = 2147483647;
	long lo = 9223372036854775807L;
	System.out.println("" + by);
	System.out.println("" + (by - 1));
	System.out.println("" + (by + 1));
	System.out.println("" + sh);
	System.out.println("" + (sh - 1));
	System.out.println("" + (sh + 1));
	System.out.println("" + int2);
	System.out.println("" + (int2 - 1));
	System.out.println("" + (int2 + 1));
	System.out.println("" + lo);
	System.out.println("" + (lo - 1));
	System.out.println("" + (lo + 1) + "\n");

	
	System.out.println("5. Перестановка значений переменных");
	x2 = 2;
	y2 = 5;
	System.out.println("Исходные значения x2 = " + x2 + " y2 = " + y2);
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
	ch1 = '\u0024'; // $ 
	ch2 = '\u002A'; //  *
	ch3 = '\u0040'; //  @
	ch4 = '\u007C'; // | 
	ch5 = '\u007E'; // ~ 
	System.out.println("код символа 36 = " + ch1);
	System.out.println("код символа 42 = " + ch2);
	System.out.println("код символа 64 = " + ch3);
	System.out.println("код символа 124 = " + ch4);
	System.out.println("код символа 126 = " + ch5 + "\n");

	System.out.println("7. Вывод в консоль ASCII-арт Дюка");
	ch1 = 47; //  /
	ch2 = 92; //  \
	ch3 = 40; //  (
	ch4 = 41; //  )
	ch5 = 95; //  _
	System.out.println("    " + ch1 + ch2);
	System.out.println("   " + ch1 + "  " + ch2);
	System.out.println("  " + ch1 + ch5 + ch3 + " " + ch4 + ch2);
	System.out.println(" " + ch1 + "      " + ch2);
	System.out.println("" + ch1 + ch5 + ch5 + ch5 + ch5 + ch1 + ch2 + ch5 + ch5 + ch2 + "\n");

	System.out.println("8. Вывод количества сотен, десятков и единиц числа");
	n = 123;
	x = n / 100;
	y = (n % 100) / 10;
	z = (n % 10);
	s = x + y + z;
	n = x * y * z;
	System.out.println("Число N содержит:");
	System.out.println("сотен - " + x);
	System.out.println("десятков - " + y);
	System.out.println("единиц - " + z);
	System.out.println("Сумма его цифр: " + s);
	System.out.println("Произведение: " + n + "\n");
		
	System.out.println("9. Вывод времени: ");
	seconds = 86399;
	hours = seconds / (60*60);
	minutes = (seconds % (60*60) / 60);
	seconds2 = (seconds % 60);
	System.out.println(hours + ":" + minutes + ":" + seconds2);

	}
}