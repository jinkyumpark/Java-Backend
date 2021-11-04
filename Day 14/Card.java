package days14;

public class Card {
	final static int SPADE = 4;
	final static int DIAMOND = 3;
	final static int HEART = 2;
	final static int CLOVER = 1;
	
	private int kind;		// 4: Spade  3: Diamond  2: Heart  1: Clover
	private int number;	// 1-13
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	 // 호출되면 호출객체의 무늬와 숫자를 String으로 return해 주는 맴버매소드
	public String toString() {
		String[] kinds = {"Clover", "Heart", "Diamond", "Spade"};
		String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		String result = "[" + kinds[this.kind-1] + ":" + numbers[this.number-1] + "]";
				
		return result;
	}
}
