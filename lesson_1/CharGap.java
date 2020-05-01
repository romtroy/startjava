public class CharGap {	
	public static void main(String[] args) {
		char sign = '\u0033';
				
		do {
			System.out.print(" " + sign);
			sign++;
		} while (sign < '\u0126');
	} 
}