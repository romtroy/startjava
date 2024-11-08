import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        calc.firstNumber(); //вызываем метод ввода
        int number1 = scan.nextInt();
        calc.setNumber1(number1); // делаем 1ю цифру
        
        calc.sighMath();
        char sign = scan.next().charAt(0);
        calc.setSign(sign);    
        calc.secondNumber(); //вызываем метод ввода
        int number2 = scan.nextInt();
        calc.setNumber2(number2); // делаем 2ю цифру
        
        calc.count(); //вызываем метод расчёта
        // почему здесь не работает console.nextLine() или scan.nextLine() ???
        String signContinue = scan.next();
        calc.setSignContinue(signContinue);
        calc.continueYesOrNot();
    }
}
