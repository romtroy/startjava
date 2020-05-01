public class MyFirstGame {	
	public static void main(String[] args){
		int numAnswer = 51;
		System.out.println("Enter a number between 0 and 100");
		int numUser = 100;
		if(numUser != numAnswer) {
			System.out.println("You lose!");
			if(numUser > numAnswer) {
				System.out.println("The number that you entered is greater than what it is");
			}
			else if(numUser < numAnswer) {
				System.out.println("The number that you entered is less than what it is");
			}
		}
		else if(numUser == numAnswer) {
			System.out.println("You guess! " + numAnswer);
		}
	}
}