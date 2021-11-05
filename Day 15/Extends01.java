package days15;

public class Extends01 {
	public static void main(String[] args) {
		PersonA a = new PersonA();
		PersonB b = new PersonB();
		a.name = "Jin";
		b.age = 26;
		System.out.println(a.name);
		System.out.println(b.age);
	}
}

class Person {
	String name;
	int age;
}

class PersonA extends Person {
	String hakbun;
}

class PersonB extends Person {
	String empbum;
}