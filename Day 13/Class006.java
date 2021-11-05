package days13;

public class Class006 {
	public static void main(String[] args) {
		Cat c1 = new Cat("Jin", 22, "01045398503");
		System.out.println(c1.toString());
	}
}

class Cat {
	private String name;
	private int age;
	private String phone;
	
	public Cat(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public String toString() {
		return "Name: " + name + " age: " + age + " phone: " + phone;
	}
}