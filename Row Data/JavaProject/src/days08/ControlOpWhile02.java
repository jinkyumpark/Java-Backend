package days08;

public class ControlOpWhile02 {
	public static void main(String[] args) {
		int count = 1;
		while(count <= 100) {
			if(count % 2 == 0) {
				System.out.print(count + " ");
			}
			count++;
		}
	}
}