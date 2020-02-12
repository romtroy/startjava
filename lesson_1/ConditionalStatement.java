public class ConditionalStatement {	
	public static void main(String[] args) {
		int age = 22, height = 175;
		boolean human = false;
		char firstLetterOfName = 111;

		if (age > 20) {
			System.out.println(age + " more than 20");
		}
	
		if (human == true) {
			System.out.println(" man");
		}
		
		if (human == false) {
			System.out.println(" women");
		}
		
		if (height < 180) {
			System.out.println("below 180");
		} else {
			System.out.println("higher 180");
		}

		if (firstLetterOfName == 109) {
			System.out.println("first letter of name is M");
		} else if (firstLetterOfName == 111) {
			System.out.println("first letter of name is I");
		} else {
			System.out.println("another letter...");
		}
	}
}
