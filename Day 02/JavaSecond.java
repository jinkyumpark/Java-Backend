package days02;

// 클래스 이름은 영문과 숫자가 조합되어서 만들어 질 수도 있습니다.
// 다만, 반드시 첫 글자가 영문이어야 합니다.
// 이름 중간에 공백 또는 특수기호가 들어갈 수 없습니다.
// 사용 가능한 특수기호가 있다면 언더바(_) 정도만 사용합니다.

public class JavaSecond {
	public static void main(String[] args) {
//		System.out.printf("1\t겁나 쉬운 자바 프로그래밍~!\n");
//		System.out.printf("12\t겁나 쉬운 자바 프로그래밍~!\n");
//		System.out.printf("123\t겁나 쉬운 자바 프로그래밍~!\n");	
		/*
		 \t : Tab을 누른 것처럼 일정간격 띠움
		 \' : 작은 따움표 출력
		 \" : 큰 따움표 출력
		 %% : %출력
		 \\ : 백슬래쉬 출력
		 \b : 백스페이스 - 커서 왼쪽으로 이동하면서 앞글자를 한 글자씩 삭제, 다만 이클립스 콘솔창에서는 정상작동하지 않음
		 */
		
		int[][] scores = {{89, 87, 56},{87, 89, 54}, {56, 58, 58}};
		
		System.out.println("--------------------------------------");
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		for(int i = 0; i < scores.length; i++) {
				int sum = scores[i][0]+scores[i][1]+scores[i][2];
				double average = sum / scores[i].length;
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\n", i, scores[i][0], scores[i][1], scores[i][2], sum, average);
		}
		System.out.println("--------------------------------------");
		
		System.out.println("겁나 쉬운 \"자바\" 프로그래밍");
		// 큰 따움표를 화면에 직접 출력하면 \" 라고 써야 큰따움표만 출력됩니다.
		// \없이 " 만 사용한다면 끝나는 따움표로 인식되어 오류를 발생시킵니다.
		
		System.out.println("대통령은 조약을 \"체결-비준\"하고,");
		System.out.println("외교사절을 \"신임-접수\" 또는 \"파견\"하여,");
		System.out.println("\'선전포고\'와 \'강화\'를 한다.\n");
		System.out.println("대통령의 임기가 만료되는 때에는");
		System.out.printf("임기완료 70%% 내지 40%% 전에 후임자를 선거한다");
	
		
	}
}

