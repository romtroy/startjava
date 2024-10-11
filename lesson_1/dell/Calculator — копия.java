import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result = 1;
        char signContinue = 'y';
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("first number: ");
            int number1 = scan.nextInt();
            System.out.print("your sign: ");
            char sign = scan.next().charAt(0);
            System.out.print("second number: ");
            int number2 = scan.nextInt();
            if (sign == '+') {
                result = number1 + number2;
                System.out.println(result);
            } else if (sign == '-') {
                result = number1 - number2;
                System.out.println(result);
            } else if (sign == '*') {
                result = number1 * number2;
                System.out.println(result);
            } else if (sign == '/') {
                result = number1 / number2;
                System.out.println(result);
            } else if (sign == '^') {
                for (int z = 1; z <= number2; z++) {
                    result = result * number1;
                }
                System.out.println(result);
            } else if (sign == '%') {
                result = number1 % number2;
                System.out.println(result);
            }
            System.out.println("Would you like to continue?(y/n)");
            for ( ; ; ) {
                signContinue = scan.next().charAt(0);
                if (signContinue == 'y' | signContinue == 'n') break;
                System.out.println("for continue please enter (y/n) ");
            }
        } while (signContinue == 'y');
    }
}