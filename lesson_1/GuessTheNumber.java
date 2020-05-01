public class GuessTheNumber {	
	public static void main(String[] args)
		throws java.io.IOException{
			int num_answer = 51;
			System.out.println("Enter a number between 0 and 100");
			int num_user = 51;
			if(num_user == num_answer) 
				System.out.println("You guess! " + num_answer);
			if(num_user > num_answer){
				System.out.println("The number you entered is greater than what it is");
			}
			if(num_user < num_answer){
				System.out.println("The number you entered is less than what it is");
			}
		}
	}