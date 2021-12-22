package days14;

public class Class27 {
	public static void main(String[] args) {
		// 객체를 만든것이 아니라 배열을 만든 것
		Student2[] std = new Student2[5];
		std[0] = new Student2(98, 78, 98);
		std[1] = new Student2(98, 78, 98);
		std[2] = new Student2(98, 78, 98);
		std[3] = new Student2(98, 78, 98);
		std[4] = new Student2(98, 78, 98);
	}
}

class Student2 {
	int num;
	String name;
	int[] score;
	static int count = 0;
	Student2() {
		score = new int[3];
		num = ++count;
		name = "Std-" + num;
	}
	Student2(int a, int b, int c) {
		this();
		score[0] = a;
		score[1] = b;
		score[2] = c;
	}
}
