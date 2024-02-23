import java.util.concurrent.ThreadLocalRandom;

public class VariableNamesTheme {	
	public static void main(String[] args) {
		byte a, a1, a2, day, month;
		short sum, year;
		int b, d, zero, error, a3, rand_int, stringMaxLength, math, count2 ;
		long l, capacity;
		float dog;
		double p, price, size;
		char ch;
		boolean oneHundred, pc,smtNew, isA1A2, str_b, power, email, str_u, object;
		String text, text2, pathToFile, title, name, surname, surname2, str, x, x1, item;
		int[] myArray;

		/* Разные переменные */
		//цифра
		System.out.println("1. Разные переменные: ");
		a = 100;
		System.out.println("переменная типа byte a = " + a);
		
		//сумма чисел
		sum = (short) (a + a);
		System.out.println("сумма двух чисел sum = " + sum);
		
		//произведение цифр
		b = a * sum;
		System.out.println("произведение b = " + b);
		
		//максимальное число
		l = 9223372036854775807L;
		System.out.println("максимальное число l = " + l);
		
		//количество десятков
		d = b / 10;
		System.out.println("количество десятков d = " + d + " в переменной b");
		
		//вес собаки
		dog = 15.3f;
		System.out.println("вес собаки = " + dog + "кг");
		
		//исходное число ???
		b = a * sum;
		System.out.println("произведение b = " + b + " исходное число а" + a);
		
		//процент по вкладу
		p = 1000 * 0.12;
		System.out.println("12 процентов по вкладу на 1000р составляют " + p + " рублей");
		
		//(переменная хранит символ) &
		ch = '&';
		System.out.println("Символ & в char: " + ch);
		
		//код ошибки
		error = 10;
		String formattedNumber = String.format("%04d", error);
		System.out.println("Код ошибки:  " + formattedNumber);
		
		//тип сообщения
		text2 = " тип сообщения ";
		System.out.println(text2);

		//число нулей
		zero = 000;
		String formattedNumber2 = String.format("%04d", zero);
		System.out.println("число нулей: " + formattedNumber2);
		
		//уникальное число ???
		a3 = 12345;
		System.out.println("уникальное число : " + a3);

		//случайное число
		rand_int = ThreadLocalRandom.current().nextInt();
		System.out.println("Случайное число: " + rand_int);
		
		//математическое выражение
		math = (b / d);
		System.out.println("математическое выражение math: " + b +" / " + d + " = " + math);
		
		//выбор (чего-либо) ???
		a1 = 1;
		a2 = 2;
		System.out.println("Выберите пункт меню " + a1 + " или " + a2);
		
		//счет (в игре)
		a1 = 2;
		a2 = 3;
		System.out.println("счёт в игре: " + a1 + ":" + a2);
		
		//максимальная длина (строки)
		stringMaxLength = 2147483647;
		System.out.println("Максимальная длина строки " + stringMaxLength);
		
		//пункт меню
		item = "1. пункт меню";
		System.out.println(item);
		
		//стоимость кофе на вынос
		price = 155.5;
		System.out.println("Цена кофе: " + price + "рублей");
		
		//дата начала (чего-либо)
		day = 15; 
		month = 02; 
		year = 2024;
		System.out.println("Дата: " + day + "." + month + "." + year);
		
		//окончание диапазона???
		myArray = new int[10]; 
		System.out.println("окончание диапазона: " + myArray.length);

		//полное имя работника месяца
		name = "Иван";
		surname = "Иванов";
		surname2 = "Иванович";
		System.out.println("имя работника: " + name + surname + surname2);
		
		//заголовок электронной книги
		title = "Java. Руководство для начинающих";
		System.out.println("заголовок электронной книги:" + title);
		
		//размер
		size = 3.5;
		System.out.println("размер: " + size + " метра");
		
		//вместимость (чего-либо)
		capacity = 512;
		System.out.println("вместимость: " + capacity + "Gb");
		
		//счетчик
		count2 = 0;
		count2++;
		System.out.println("Счётчик: " + count2);
		
		//путь до файла
		pathToFile = "D:/java/lesson1/";
		System.out.println(pathToFile);
		
		//количество чисел в каждой строке
		text = "данный текст №1 содержит 2 цыфры";
        long count = text.codePoints().filter(Character::isDigit)
            .count();
        System.out.println("количество чисел в тексте: " + count + "\n");

        /* Разные переменные */
		//цифра
		System.out.println("2. boolean-переменные: ");
		
		//сотни равны?
		oneHundred = (a == 100);
		System.out.println(oneHundred);
		
		//компьютер включен?
		pc = false;
		if(pc) System.out.println("компьютер включен ");
		else 
		System.out.println("компьютер выключен ");
		
		//есть равные цифры?
		a1 = 2;
		a2 = 3;
		isA1A2 = (a1 == a2);
		System.out.println("цифры равны: " + isA1A2);
		
		//(что-либо) создано?
		object = false;
		if (object) System.out.println("объект создан ");
		
		//(что-либо) пустое?
		str = "12";
		if (str_b = (str.isEmpty())) {
			System.out.println("строка пустая " + str_b);
		}else{
   			System.out.println("Строка не пустая");
		}
		
		//(что-либо) активное?
		power = true;
		if (power) System.out.println("Питание активно " + power);
		
		//новый?
		smtNew = false;
		if(smtNew) System.out.println("новый: " + smtNew);
		
		//электронная почта действительная?
		email = true;
		if (email) System.out.println("e-mail активен: " + email);
		
		//имеются уникальные строки?
		if (str_u = (surname == surname2)) {
			System.out.println("есть уникальные строки " + str_u);
		}else{
			System.out.println("нет уникальных строк " + str_u + "\n");
		}
		
		System.out.println("3. Аббревиатуры");
		
		//старый universally unique identifier
		String str_a = "старый Universally Unique Identifier ";
		String[] myName = str_a.split(" ");
		for (int i = 0; i < myName.length; i++) {
        String s = myName[i];
        System.out.print("" + s.charAt(0));
    	}

		//производитель оперативной памяти
		x = "производитель оперативной памяти";
	    System.out.println(x);
    			
		//емкость жесткого диска
		x = "емкость жесткого диска";
	    System.out.println(x);

		//протокол передачи гипертекста
		x = "протокол передачи гипертекста";
	    System.out.println(x);

		//сокращенный uniform resource locator
		x = "сокращенный uniform resource locator";
	    System.out.println(x);

		//новый идентификатор клиента
		x = "новый идентификатор клиента";
	    System.out.println(x);

		//кодировка american standard code for information interchange
		x1 = "american standard code for information interchange";
		System.out.print("Кодировка: ");
	    String[] myName1 = x1.split(" ");
		for (int i = 0; i < myName1.length; i++) {
        String s = myName1[i];
        System.out.print("" + s.charAt(0));
    	}
	}
}

//Над каждой переменной указывайте комментарий с ее описанием из ДЗ
