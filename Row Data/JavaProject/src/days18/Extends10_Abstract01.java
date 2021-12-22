package days18;

public class Extends10_Abstract01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println("Dog barks");
		dog.sound();
		System.out.println("Cat meows");
		cat.sound();
	}
}

class Animal {
	public void sound() {
		System.out.println("울음 소리");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	
}