import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя для игрока" + player1.getPlayerNumber() + ": ");
        player1.setName(scan.next());
        System.out.print("Введите имя для игрока" + player2.getPlayerNumber() + ": ");
        player2.setName(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String signContinue;
        do {
            do {
                int variant1 = game.getValidInput(player1, scan);
                player1.setPlayerVariant(variant1);
                int variant2 = game.getValidInput(player2, scan);
                player2.setPlayerVariant(variant2);

                game.gameLogic();
            } while (!game.getIsSomeonGuess());
            game.setIsSomeonGuess();
            
            do {
                System.out.println("Хотите продолжить игру? [yes/no] ");
                signContinue = scan.next();
            } while (!signContinue.equals("yes") && !signContinue.equals("no"));
        } while (!signContinue.equals("no"));
    }
}