public class Jaeger {
    private String modelName;
    private String origin;
    private float height;
    private int speed;
    
    public Jaeger(String modelName, String origin, float height, int speed) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.speed = speed;
    }
    
    public Jaeger() {
    }

    @Override
        public String toString() {
        return String.format("modelName: %s; origin: %s; height: %.2f; speed: %s", modelName.toString(), origin.toString(), height, speed);
    }

    public String getModelName() {
        return modelName; 
    }
    
    void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public String getOrigin() {
        return origin; 
    }
    
    void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public float getHeight() {
        return height; 
    }
    
    void setHeight(float height) {
        this.height = height;
    }
    
    public int getSpeed() {
        return speed; 
    }
    
    void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean drift() {
        System.out.println("drift!!!");
        return true; 
    }
}