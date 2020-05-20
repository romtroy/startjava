import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		Scanner scanInt = new Scanner(System.in);
		System.out.print("first number: ");
		int number1 = scanInt.nextInt();
		System.out.print("second number: ");
		int number2 = scanInt.nextInt();
		calc.x = number1;
		calc.y = number2;
		Scanner scan = new Scanner(System.in);
		System.out.print("your sign: ");
		String sign = scan.nextLine();
		calc.setSign(sign);
		System.out.println("result = " + calc.calculate());
	}
}