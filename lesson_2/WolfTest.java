public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf("wolfOne", "male", "black", 35.5f, 5);
        System.out.println(wolfOne.nick + " Gender: " + wolfOne.gender + " Color: " + 
                    wolfOne.color + " Weight: " + wolfOne.weight + " Age: " + wolfOne.age);
        wolfOne.sound(); 
    }
}