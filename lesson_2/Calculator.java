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
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
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