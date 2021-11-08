package days16;

public class Extends08_TypeCasting03 {
	public static void main(String[] args) {
		SuperG s = new SuperG();
		SubG1 s1 = new SubG1();
		SubG2 s2 = new SubG2();
		SubG3 s3 = new SubG3();
		
		if(s instanceof SubG1)
			System.out.println("SubG1 class type");
		else if(s instanceof SubG2)
			System.out.println("SubG2 class type");
		else if(s instanceof SubG3)
			System.out.println("SubG3 class type");
		else if(s instanceof SuperG)
			System.out.println("SuperG class type");
		// When you use instanceof to compare parent/child class type, compare parent class at last
		// since child class could be classified as parent class first
		
		if(s1 instanceof SubG1)
			System.out.println("SubG1 class type");
		else if(s1 instanceof SuperG)
			System.out.println("SuperG class type");
	}
}

class SuperG {}
class SubG1 extends SuperG {}
class SubG2 extends SuperG {}
class SubG3 extends SuperG {}
