package days02;

public class Println01 {
	public static void main(String[] args) {
		// println은 printf("\n")과 같은 동작을 합니다.
		// println은 \n이 없어도 모든 출력 후 줄바꿈을 한 번 실행해 줍니다.
		// System.out.println("\n") <- 두 줄 바꿈
		
		// printf와 같은 format 양식 글자(%d, %f 등)를 사용하지 못 합니다.
		// 다만 printf 보다 출력이 간단합니다.
		
		System.out.println(10);
		System.out.println(12.123);
		System.out.println("Java Programming");
		
		System.out.println(10 + 12.123 + "" + "Java Programming");
		// + 연산자는 문자와 다른 형식의 데이터가 연산되면 = 이어 붙이기, 숫자들끼리 연산하면 산술 덧셈 연산이 됩니다.
		
		// 문자와 숫자가 다른 점
		// 1. 표면상으로 그 둘은 따움표로 안에 쓰여졌느냐 아니냐에 따라 구분합니다.
		// 2. 123은 백이십삼 이라고 읽지만, "123"은 일이삼이라고 읽습니다.
		// 3. 987 은 1234 보다 작지만, "987"은 "1234" 보다 크다고 표현합니다.
		
		// 문자들간의 비교는 첫 글자부터 하나씩 같은 위치의 글자와 비교합니다.
		// 첫 글자에서 크기가 결정되면 그 다음은 비교하지 않습니다.
		// 두 번째 글자를 비교하는 경우는 첫 번째 글자가 같은 글자일때 한해서만 비교합니다.
		// 두 번째 글자도 같은 글자라면 세 번째 글자를 비교합니다.
		// 사전에서 찾았을때 먼저 나오는 글자를 작다라고 하고 뒤에 나오는 글자를 크다라고 합니다.
		
		// 모두 10 + 5 = 15
		System.out.println(10 + " + " + 5 + " = " + (10+5));
		System.out.println("10 + 5" + " = " + (10 + 5));
		System.out.println("10 + 5 = " + (10 + 5));
		System.out.println("10 + 5 = 1" + 5);
		System.out.println("10 + 5 = 15");
		
	}
}
