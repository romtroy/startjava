public class MyFirstGamee {	
	public static void main(String[] args) {
		int playerNum = 55;
		int hiddenNum = 51;
		//boolean youWinner = false;

		System.out.println("Enter a number between 0 and 100");
		if (hiddenNum != playerNum) {
			do{
				//System.out.println("You lose!");
				if(hiddenNum < playerNum) {
					System.out.println("The number that you entered is greater than what it is");
					playerNum--;
					} else if(hiddenNum > playerNum) {
					System.out.println("The number that you entered is less than what it is");
					playerNum++; }
			} while (hiddenNum == playerNum);
			
		} else {
		//	youWinner = true;
			System.out.println("You guess! " + playerNum);
	}
}}