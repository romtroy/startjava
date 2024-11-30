public class Player {
    private String name;
    private int variant;
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public int getVariant() {
        return variant;
    }
   
    public void setVariant(int variant) {
        this.variant = variant;
    }
}