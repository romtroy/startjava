public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.nick = "wolfy";
		wolfOne.gender = "male";
		wolfOne.color = "gray";
		wolfOne.weight = 23.5f;
		wolfOne.age = 5;
		
		System.out.println("nick- " + wolfOne.nick + ", gender- " + wolfOne.gender);
		System.out.println("color- " + wolfOne.color + ", weight- " + wolfOne.weight + ", age - " + wolfOne.age);
		wolfOne.sound();
	}

}