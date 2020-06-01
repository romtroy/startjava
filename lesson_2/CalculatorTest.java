import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		char signContinue = 'y';
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("first number: ");
			int number1 = scan.nextInt();
			calc.setX(number1);

			System.out.print("your sign: ");
			char sign = scan.next().charAt(0);
			calc.setSign(sign);

			System.out.print("second number: ");
			int number2 = scan.nextInt();
			calc.setY(number2);

			System.out.println("result = " + calc.calculate());
			System.out.println("Would you like to continue?(y/n)");
			for( ; ; ) {
				signContinue = scan.next().charAt(0);
				if (signContinue == 'y' | signContinue == 'n') break;
				System.out.println("for continue please enter (y/n) ");
			}
		} while(signContinue == 'y');
	}
}