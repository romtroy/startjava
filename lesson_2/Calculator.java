public class Calculator {	
	int x, y;
	String sign;
	int result;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getResult() {
		switch(getSign()) {
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