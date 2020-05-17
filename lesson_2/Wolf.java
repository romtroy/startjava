public class Wolf {
	private String nick;
	private String gender;
	private String color;
	private float weight;
	private int age;
	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age");
		}
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void move() {
	}

	public void sit() {
	}

	public void run() {
	}

	public void sound() {
		System.out.println("Woof!");
	}
	
	public void hunt() {
	}
}