import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String signContinue = "yes";
        char sign;
        
        do {
            System.out.print("Введите первое число: ");
            calc.setNumber1(scan.nextInt());
            
            while (true) {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                sign = scan.next().charAt(0);
                calc.setSign(sign);
                if (!isValidSign(sign)) {
                    System.out.println("Ошибка: операция " + sign + " не поддерживается");
                    continue;
                }
                break;
            }
        
            System.out.print("Введите второе число: ");
            calc.setNumber2(scan.nextInt());
            calc.calculate(); 

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                signContinue = scan.next();
            } while (!signContinue.equals("yes") && !signContinue.equals("no"));
        } while (!signContinue.equals("no"));
    }
    
    static boolean isValidSign(char sign) {
        return (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%');
    }
}