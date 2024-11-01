public class Wolf {
    String nick;
    String gender;
    String color;
    float weight;
    int age;
    
    public void move() {
        System.out.println("move");
    }

    public void sit() {
        System.out.println("sits");
    }

    public void run() {
        System.out.println("runs");
    }

    public void sound() {
        System.out.println("Woof!");
    }
    
    public void hunt() {
        System.out.println("hunts");
    }
    
    public Wolf(String nick, String gender, String color, float weight, int age) {
        this.nick = nick;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }
}