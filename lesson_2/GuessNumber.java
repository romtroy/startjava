import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play(Scanner scan) {
        secretNum = (int) (Math.random() * 100) + 1;
        while (true) {
            player1.setVariant(getValidPlayerNumber(player1, scan));
            player2.setVariant(getValidPlayerNumber(player2, scan));

            System.out.println("Загаданное число: " + secretNum);
            if (player1.getVariant() == secretNum) {
                System.out.println(player1.getName() + " отгадал число!");
                break;
            } else if (player2.getVariant() == secretNum) {
                System.out.println(player2.getName() + " отгадал число!");
                break;
            } else {
                System.out.println("Никто не отгадал.");
            }
        }
    }

    private int getValidPlayerNumber(Player player, Scanner scan) {
        int playerNumber;
        do {
            System.out.print("Введите число между 1 и 100 для игрока " + player.getName() + ": ");
            playerNumber = scan.nextInt();
            if (playerNumber < 1 || playerNumber > 100) {
                System.out.println("Ошибочное значение! В игре разрешен ввод чисел в отрезке [1, 100].");
            }
        } while (playerNumber < 1 || playerNumber > 100);
        
        if (playerNumber > secretNum) {
            System.out.println(playerNumber + " - больше того, что загадал компьютер");
        } else if (playerNumber < secretNum) {
            System.out.println(playerNumber + " - меньше того, что загадал компьютер");
        }           
        return playerNumber;
    }
}