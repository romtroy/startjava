import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean isSomeonGuess = false;
    
    int digitComputer = (int) (Math.random() * 100) + 1;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void gameLogic() {
        System.out.println("загаданное число: " + digitComputer);
        
        if (player1.getPlayerVariant() == digitComputer) {
            System.out.println(player1.getName() + " Отгадал число!");
            isSomeonGuess = true;
        } else if (player2.getPlayerVariant() == digitComputer) {
            isSomeonGuess = true;
            System.out.println(player2.getName() + " Отгадал число!");
        } else {
            System.out.println("Никто не отгадал");
        }
        if (isSomeonGuess) {
            digitComputer = (int) (Math.random() * 100) + 1;
        }
    }
    
    /*
    метод принимает номер игрока и возвращает корректное значение для установки
    Принимает объект Player и Scanner как параметры;
     Запрашивает ввод и проверяет, чтобы он был в диапазоне от 1 до 100.
     Возвращает корректное значение.
   */
    
    public int getValidInput(Player player, Scanner scan) {
        int variant;
        do {
            System.out.print("Введите число между 1 и 100 для игрока" + player.getPlayerNumber() + " " + 
                    player.getName() + ": ");
            variant = scan.nextInt();
            if (variant < 1 || variant > 100) {
                System.out.println("Ошибочное значение! в игре разрешен ввод чисел в отрезке [1, 100] ");
            }
        } while (variant < 1 || variant > 100);
        return variant;
    }
    
    public boolean getIsSomeonGuess() {
        return isSomeonGuess;
    }
    
    public boolean setIsSomeonGuess() {
        return isSomeonGuess = false;
    }
}
