import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя для игрока 1" + ": ");
        Player player1 = new Player(scan.next());

        System.out.print("Введите имя для игрока 2" + ": ");
        Player player2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String signContinue;
        
        do {
            game.play(scan);
            do {
                System.out.println("Хотите продолжить игру? [yes/no] ");
                signContinue = scan.next();
            } while (!signContinue.equals("yes") && !signContinue.equals("no"));
        } while (!signContinue.equals("no"));
    }
}