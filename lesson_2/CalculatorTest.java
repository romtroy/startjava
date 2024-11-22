import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String signContinue = "yes";
        
        do {
            System.out.print("Введите первое число: ");
            calc.setNumber1(scan.nextInt());
            
            do {
                System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
                char sign = scan.next().charAt(0);
                calc.setSign(sign);
                
                if (calc.checkSign()) {
                    System.out.println("Ошибка: операция " + sign + " не поддерживается ");
                }
            } while (calc.checkSign());
            
            System.out.print("Введите второе число: ");
            calc.setNumber2(scan.nextInt());
            calc.calculate(); 

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                signContinue = scan.next();
            } while (!signContinue.equals("yes") && !signContinue.equals("no"));
        } while (!signContinue.equals("no"));
    }
}