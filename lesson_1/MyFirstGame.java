public class MyFirstGame {	
	public static void main(String[] args) {
		int playerNum = 45;
		int hiddenNum = 51;

		System.out.println("Enter a number between 0 and 100");
		if (hiddenNum != playerNum){ 
			do {
				if(hiddenNum < playerNum) {
				System.out.println("The number that you entered is greater than what it is. Your number: " + playerNum);
				playerNum--;
				} else if(hiddenNum > playerNum) {
				System.out.println("The number that you entered is less than what it is. Your number: " + playerNum);
				playerNum++; }
			}while(hiddenNum != playerNum);
		}
		if (hiddenNum == playerNum) System.out.println("You guess! " + playerNum);
	}	
}