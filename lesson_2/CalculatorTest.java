import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("first number: ");
			int number1 = scan.nextInt();
			calc.setInt1(number1);

			System.out.print("your sign: ");
			char sign = scan.next().charAt(0);
			calc.setSign(sign);

			System.out.print("second number: ");
			int number2 = scan.nextInt();
			calc.setInt2(number2);

			System.out.println("result = " + calc.calculate());
			System.out.println("Would you like to continue?(y/n)");
			char signContinue = scan.next().charAt(0);
			calc.setSignContinue(signContinue);
		} while(calc.getSignContinue() == 'y');
	}
}