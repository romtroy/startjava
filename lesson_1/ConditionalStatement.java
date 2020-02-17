public class ConditionalStatement {	
	public static void main(String[] args) {
		int age = 22;
				
		if (age > 20) {
			System.out.println(age + " more than 20");
		}
		
		boolean isMan = false;
		if (isMan) {
			System.out.println(" man");
		}
		
		if (!isMan) {
			System.out.println(" women");
		}
		
		int height = 175;
		if (height < 180) {
			System.out.println("below 180");
		} else {
			System.out.println("higher 180");
		}
		
		char firstLetterOfName = 111;
		if (firstLetterOfName == 109) {
			System.out.println("first letter of name is M");
		} else if (firstLetterOfName == 111) {
			System.out.println("first letter of name is I");
		} else {
			System.out.println("another letter...");
		}
	}
}
