public class Calculator {	
	public static void main(String[] args) {
		int x = 80, y = 25;
		double result;
		char sign = '%'; //+_43; -_821; *_42; /_824; ^_708; %_37 DEC;
		
		if (sign == '+') {
			result = x + y;
			System.out.println(" x + y =  " + result);
		} else if (sign == '-') {
			result = x - y;
			System.out.println(" x - y =  " + result);
		} else if (sign == '*') {
			result = x * y;
			System.out.println(" x * y =  " + result);
		} else if (sign == '/') {
			result = x / y;
			System.out.println(" x / y =  " + result);
		} else if (sign == '^') {
			result = x;
			while (y > 1) { 
				result *=  x;
				y--;
			}
			System.out.println(" x ^ y =  " + result);
		} else if (sign == '%') {
			result = ((x*y)/100);
			System.out.println(" x % y =  " + result);
		}
	}
}