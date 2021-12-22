package days12;

public class Class07 {
	public static void main(String[] args) {
		GetSetTest gs = new GetSetTest();
		gs.setIntVar(123);
	}
}

class GetSetTest {
	private int intVar;
	private double doubleVar;
	private String stringVar;
	
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	
	/*
	 * public void setIntVar(int n) { intVar = n; } public int getIntVar() { return
	 * intVar; }
	 * 
	 * public void setDoubleVar(int doubleVar) { this.doubleVar = doubleVar; }
	 * public double getDoubleVar() { return doubleVar; }
	 * 
	 * public void setStringVar(String stringVar) { this.stringVar = stringVar; }
	 * public String getStringVar() { return stringVar; }
	 */
}

// 접근지정자
// private : 클래스 내부에서만 사용 가능한 맴버를 정의하는 키워드
// public : 접근에 제한이 없는 맴버를 정의하는 키워드
// protected : child class 에서만 자유롭게 접근이 가능, 상속단원에서 자세히 학습
// default : 접근 지정자 미지정시 자동으로, 같은 패키지 내에서 자유롭게 접근 가능


