package days18;

public class Extends10_Abstract02 {
	public static void main(String[] args) {
//		AbstractAnimal a = new AbstractAnimal();
		AbstractAnimal dog = new DogA();
		AbstractAnimal cat = new CatA();
		dog.sound();
		cat.sound();
	}
}

abstract class AbstractAnimal {
	public abstract void sound();
}

class DogA extends AbstractAnimal {
	@Override
	public void sound() {
		System.out.println("워워우얼워월월워월...");
	}
}

class CatA extends AbstractAnimal {
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹.");
	}
}