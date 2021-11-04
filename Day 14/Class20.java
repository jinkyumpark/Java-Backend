package days14;

public class Class20 {
	public static void main(String[] args) {
		Student s1 = new Student("Jin", 98, 69, 87);
		Student s2 = new Student("Yerim", 45, 87, 78);
		Student s3 = new Student("Rona", 56, 99, 55);
		Student s4 = new Student(s3);
		s1.prn();
		s2.prn();
		s3.prn();
		s4.prn();
	}
}

class Student {
	private int bun;
	private String name;
	private int[] scores;
	
	static int count = 0;
	
	Student() {
		scores = new int[3];
		bun = ++count;
	}
	
	Student(String name) {
		this();
		this.name = name;
	}
	
	Student(String name, int kor, int eng, int mat) {
		this(name);
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = mat;
	}
	
	Student(Student s) {
		this(s.name, s.scores[0], s.scores[1], s.scores[2]);
	}
	
	public void prn() {
		System.out.println(bun + name + scores[0] + scores[1] + scores[2]);
	}
}
