public class Calculator {

	private int x, y;
	private char sign;
	private int result;
	private char signContinue;

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public char getSignContinue() {
		return signContinue;
	}

	public void setSignContinue(char signContinue) {
		this.signContinue = signContinue;
	}
	
	public int getInt1() {
		return x;
	}
	
	public int getInt2() {
		return y;
	}

	public void setInt1(int x) {
		this.x = x;
	}

	public void setInt2(int y) {
		this.y = y;
	}
	
	public int calculate() {
		switch(sign) {
			case '+':
				result = x + y;
				break;
			case '-':
				result = x - y;
				break;
			case '*':
				result = x * y;
				break;
			case '/':
				result = x / y;
				break;
			case '^':
				result = x;
				while (y > 1) { 
					result *=  x;
					y--;
				}
				break;
			case '%':
				result = x % y;
				break;		
		}	
		return result;
	}
}