public class Calculator {
//класс Calculator будет отвечать за проверку знака и мат. вычисления	
	private int x,y;
	private String sign;
	private int result;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
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
			case "+":
				result = x + y;
				break;
			case "-":
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				result = x / y;
				break;
			case "^":
				result = x;
				while (y > 1) { 
					result *=  x;
					y--;
				}
				break;
			case "%":
				result = x % y;
				break;		
		}	
		return result;
	}
}