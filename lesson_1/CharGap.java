public class CharGap {	
	public static void main(String[] args) {
		char sign = '\u0033';
				
		do {
			System.out.print(" " + sign);
			sign++;
			} while (sign < '\u0126');
	} 
}

//Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. Если выводятся кракозябры, то [33, 126]