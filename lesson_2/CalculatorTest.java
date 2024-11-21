import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        
        String signContinue = "yes";
        
        do {
            calc.firstNumber(); //вызываем метод ввода
            int number1 = scan.nextInt();
            calc.setNumber1(number1); // делаем 1ю цифру
            
            calc.sighMath();
            char sign = scan.next().charAt(0);
            while((sign != '+') && (sign != '-') && (sign != '*') && (sign != '/') && (sign != '^') && (sign != '%')) {
                System.out.println("Ошибка: операция " + sign + " не поддерживается ");
                calc.sighMath();
                sign = scan.next().charAt(0);
            }
            calc.setSign(sign);
            
            calc.secondNumber(); //вызываем метод ввода
            int number2 = scan.nextInt();
            calc.setNumber2(number2); // делаем 2ю цифру
            
            calc.calculate(); //вызываем метод расчёта
            //String signContinue = scan.next();
            System.out.println("Хотите продолжить вычисления? [yes/no] ");
            signContinue = scan.next();
            while(!signContinue.equals("yes") && !signContinue.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no] ");
                signContinue = scan.next();
            }
        } while(signContinue.equals("yes") || !signContinue.equals("no"));

    }   
}


