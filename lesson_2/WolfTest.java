public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf("wolfOne", "male", "black", 35.5f, 5);
        wolfOne.setNick("Wolf_1");
        wolfOne.setGender("male");
        wolfOne.setColor("white");
        wolfOne.setWeight(33.5f);
        wolfOne.setAge(9);
        System.out.println("nick: " + wolfOne.getNick());
        System.out.println("Gender: " + wolfOne.getGender());
        System.out.println("Color: " + wolfOne.getColor());
        System.out.println("Weight: " + wolfOne.getWeight());
        System.out.println("Age: " + wolfOne.getAge());
        wolfOne.howl(); 
    }
}