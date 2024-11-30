import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        // Player player1 = new Player();
        // Player player2 = new Player();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя для игрока" + ": ");
        String player1Name = scan.next();
        Player player1 = new Player(player1Name);

        System.out.print("Введите имя для игрока" + ": ");
        String player2Name = scan.next();
        Player player2 = new Player(player2Name);

        GuessNumber game = new GuessNumber(player1, player2);
        String signContinue;
        
        do {
            game.playGameLogic(scan);
            do {
                System.out.println("Хотите продолжить игру? [yes/no] ");
                signContinue = scan.next();
            } while (!signContinue.equals("yes") && !signContinue.equals("no"));
        } while (!signContinue.equals("no"));
    }
}