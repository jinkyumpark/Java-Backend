package days03;

public class Variable01 {
	public static void main(String[] args) {
		System.out.println(35 + "+" + 38 + "=" + (35+38));
		System.out.println(35 + "-" + 38 + "=" + (35-38));
		System.out.println(35 + "x" + 38 + "=" + (35*38));
		System.out.println(35 + "/" + 38 + "=" + (35/38.0));
		System.out.println(35 + "+" + 38 + "=" + (35+38));
		System.out.println(35 + "%" + 38 + "=" + (35%38));
		
		// 변수 : 프로그램 실행 중 발생 또는 입력되는 데이터를 저장할 목적으로 만들어서 사용하는 임시 저장장소
		// 생성 명령 실행시 생성되고, 프로그램 종료시 소멸됩니다.
		
		// 변수의 이름을 만드는 규칙
		// 1. 인터넷 사이트의 회원가입 시 만드는 아이디 이름 규칙과 비슷합니ㅏㄷ.
		// 2. 영문과 숫자, 그리고 일부 특수문자(_)를 섞어서 사용가능하지만 첫글자는 반드시 영문으로 사용합니다.
		// 3. 중간에 공백이 있을 수 없습니다.
		// 4. 너무 짧지 않게 약간의 의미를 부여해서 이름 생성하는 편입니다.
		// 5. 변수의 이름이 너무 짧으면, 변수의 수가 많아졌을때 서로의 용도를 구분하기 어렵습니다.
		// 6. 변수의 이름이 너무 길면, 사용할 때 마다 그 긴 이름을 파이팅해야하는 불편함이 있습니다.
		// 7. 두 가지 의미의 단어가 조합되어 변수이름이 만들어 진다면 첫 단어는 소문자로, 두 번째 단어 첫 글자 대문자로 생성합니다.
		// ex) 덧셈의 결과를 저장할 변수 이름 : plusResult
		
		// 8. 변수는 자료형(정수, 실수, 문자)에 따라 만드는 명령이 달라집니다.
		// int : Integer, double : Real Number, String : Letter etc.
		
		int a;
		double b;
		int plusResult, minusResult, mutiplyResult; // Declare multiple variables at once
		double dividisionResult; 
		
		boolean b1; // Store true or false
		b1 = true;
		System.out.printf("Variable b1=%b\n", b1);
		
	}
}
