import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		Calculator firstCalc = new Calculator();
		firstCalc.x = 2;
		firstCalc.y = 10;
		System.out.println("first int- " + firstCalc.x);
		Scanner scan = new Scanner(System.in);
		System.out.print("your sign: ");
		firstCalc.sign = scan.nextLine();
		System.out.println("second int- " + firstCalc.y);
		System.out.println("result = " + firstCalc.getResult());
	}
}