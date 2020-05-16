public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setNick("Wolfy");
        System.out.println("nick- " + wolfOne.getNick());
		wolfOne.setAge(7);
		if(wolfOne.getAge() < 8){
			System.out.println("age- " + wolfOne.getAge());
		}
		wolfOne.setGender("male");
        System.out.println("gender- " + wolfOne.getGender());
        wolfOne.setWeight(13.7f);
        System.out.println("weight- " + wolfOne.getWeight());
        wolfOne.setColor("gray");
        System.out.println("color- " + wolfOne.getColor());
	}
}