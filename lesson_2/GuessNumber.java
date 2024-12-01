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
        System.out.println("Загаданное число: " + secretNum);
        while (true) {
            player1.setNumber(inputNumber(player1, scan));
            checkNumber(player1);
           
            if (player1.getNumber() == secretNum) {
                System.out.println(player1.getName() + " отгадал число!");
                break;
            }
            
            player2.setNumber(inputNumber(player2, scan));
            checkNumber(player2);
            
            if (player2.getNumber() == secretNum) {
                System.out.println(player2.getName() + " отгадал число!");
                break;
            } else {
                System.out.println("Никто не отгадал.");
            }
        }
    }

    private int inputNumber(Player player, Scanner scan) {
        int playerNumber;
        do {
            System.out.print("Введите число между 1 и 100 для игрока " + player.getName() + ": ");
            playerNumber = scan.nextInt();
            if (playerNumber < 1 || playerNumber > 100) {
                System.out.println("Ошибочное значение! В игре разрешен ввод чисел в отрезке [1, 100].");
            }
        } while (playerNumber < 1 || playerNumber > 100);
        return playerNumber;
    }

    private void checkNumber(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber > secretNum) {
            System.out.println(playerNumber + " - больше того, что загадал компьютер");
        } else if (playerNumber < secretNum) {
            System.out.println(playerNumber + " - меньше того, что загадал компьютер");
        }
    }
}