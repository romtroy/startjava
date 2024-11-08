public class Calculator {
 
        private int number1;
        private int number2;
        private char sign;
        private int result;
        private String signContinue;
        private String signContinueYes = "yes";
        private String signContinueNo = "no";
        
        public void firstNumber() {
            System.out.print("Введите первое число: " );
        }
        public void sighMath() {
            System.out.print("Введите знак операции (+, -, *, /, ^, %): " );
        }

        public void secondNumber() {
            System.out.print("Введите второе число: " );
        }
        
        public int getNumber1() {
            return number1;
        }
        
        public void setNumber1(int number1) {
            this.number1 = number1;     
        }
        
        public int getNumber2() {
            return number1;
        }
        
        public void setNumber2(int number2) {
            this.number2 = number2;     
        }
        
        public char getSign() {
            return sign;
        }
        
        public void setSign(char sign) {
            this.sign = sign;     
        }
        
        public String getSignContinue() {
            return signContinue;
        }
        
        public void setSignContinue(String signContinue) {
            this.signContinue = signContinue;     
        }
        
        public void count() {
            if (sign == '+') {
                result = number1 + number2;
            } else if (sign == '-') {
                result = number1 - number2;
            } else if (sign == '*') {
                result = number1 * number2;
            } else if (sign == '/') {
                if(number2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else { 
                    result = number1 / number2;
                }
            } else if (sign == '^') {
                for (int j = 1; j <= number2; j++) {
                    result *= number1;
                }
            } else if (sign == '%') {
                result = number1 % number2;
            }
            System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
            System.out.println("Хотите продолжить вычисления? [yes/no] ");
        }
   
        public void continueYesOrNot() {
            //System.out.println(signContinue);
            //System.out.println(this.signContinue.equals(signContinueYes));
            if (signContinue.equals(signContinueYes)) {
                System.out.print("ответ: " + signContinue);
                //как перезагрузить метод на выполнение повторно?
                //count(); 
            } else if (this.signContinue.equals(signContinueNo)) {
                System.out.print("ответ: " + signContinue);
            } else {
                System.out.print("продолжить вычисления? [yes/no] ");
            }
        }
}
