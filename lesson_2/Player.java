public class Player {
    private String name;
    private int playerVariant;
    private int playerNumber;
    
    public Player(int playerNumber) {
        // this.name = name;
        // this.playerVariant = playerVariant;
        this.playerNumber = playerNumber;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public int getPlayerNumber() {  
        return playerNumber;
    }
    
    public int getPlayerVariant() {
        return playerVariant;
    }
    
    public void setPlayerVariant(int playerVariant) {
        this.playerVariant = playerVariant;
    }
}
