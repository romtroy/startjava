import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean isSomeonGuess = false;
    private int digitComputer = (int) (Math.random() * 100) + 1;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void playGameLogic(Scanner scan) {
        while (!isSomeonGuess) {
            player1.setPlayerVariant(getValidInput(player1, scan));
            player2.setPlayerVariant(getValidInput(player2, scan));

            System.out.println("Загаданное число: " + digitComputer);
            if (player1.getPlayerVariant() == digitComputer) {
                System.out.println(player1.getName() + " отгадал число!");
                isSomeonGuess = true;
            } else if (player2.getPlayerVariant() == digitComputer) {
                System.out.println(player2.getName() + " отгадал число!");
                isSomeonGuess = true;
            } else {
                System.out.println("Никто не отгадал.");
            }

            if (isSomeonGuess) {
                digitComputer = (int) (Math.random() * 100) + 1;
            }
        }
        isSomeonGuess = false;
    }

    private int getValidInput(Player player, Scanner scan) {
        int variant;
        do {
            System.out.print("Введите число между 1 и 100 для игрока " + player.getName() + ": ");
            variant = scan.nextInt();
            if (variant < 1 || variant > 100) {
                System.out.println("Ошибочное значение! В игре разрешен ввод чисел в отрезке [1, 100].");
            }
        } while (variant < 1 || variant > 100);
        return variant;
    }
}