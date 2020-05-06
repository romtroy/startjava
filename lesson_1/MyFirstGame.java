public class MyFirstGame {	
	public static void main(String[] args) {
		int playerNum = 51;
		int hiddenNum = 51;
		boolean youWinner = false;

		System.out.println("Enter a number between 0 and 100");
		if(hiddenNum != playerNum) {
			System.out.println("You lose!");
			if(hiddenNum > playerNum) {
				System.out.println("The number that you entered is greater than what it is");
			} else if(hiddenNum < playerNum) {
				System.out.println("The number that you entered is less than what it is");
			}
		} else if(hiddenNum == playerNum) {
			youWinner = true;
			System.out.println("You guess! " + playerNum);
		}
	}
}