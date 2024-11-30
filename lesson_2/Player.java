public class Player {
    private String name;
    private int playerVariant;
    
    public Player(String name) {
        this.name = name;
        // this.playerVariant = playerVariant;
    }
    
    public String getName() {
        return name;
    }

    public int getPlayerVariant() {
        return playerVariant;
    }
   
    public void setPlayerVariant(int playerVariant) {
        this.playerVariant = playerVariant;
    }
}