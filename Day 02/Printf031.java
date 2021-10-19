public class Printf031 {
	public static void main(String[] args) {
		System.out.printf("\t ### 성적표 ###\n");
		System.out.printf("-----------------------------------\n");
		
		int[][] scores = {{31, 41, 59}, {26, 53, 100}, {97, 93, 23}};
		
		System.out.printf("번호\t국어\t수학\t영어\t총점\t평균\n");
		System.out.printf("-----------------------------------\n");

		for(int i = 0; i < scores.length; i++) {
			int sum = scores[i][0] + scores[i][1] + scores[i][2];
			double average = sum / scores[i].length;
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", i, scores[i][0], scores[i][1], scores[i][2], sum, average);
		}
	
		
	}
}
