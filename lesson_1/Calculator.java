public class Calculator {	
	public static void main(String[] args) {
		int x = 10, y = 2;
		double z;
		char sign = 37; //+_43; -_821; *_42; /_824; ^_708; %_37 DEC;
		
		if (sign == 43) {
			z = x + y;
			System.out.println(" x + y =  " + z);
		} else if (sign == 821){
			z = x - y;
			System.out.println(" x - y =  " + z);
		} else if (sign == 42) {
			z = x * y;
			System.out.println(" x * y =  " + z);
		} else if (sign == 824) {
			z = x / y;
			System.out.println(" x / y =  " + z);
		} else if (sign == 708) {
			z = x;
			while (y > 1) { 
				z = z * x;
				y--;
			}
			System.out.println(" x ^ y =  " + z);
		} else if (sign == 37) {
			z = x % y;
			System.out.println(" x % y =  " + z);
		}
	}
}