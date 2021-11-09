package days17;

public class StringMethod {
	public static void main(String[] args) {
		String[] k = {"Korea", "Japan", "Canada", "China", "Brazil"};
		for(int i = 0; i < k.length; i++) {
			for(int j = i+1; j < k.length; j++) {
				if(k[i].compareTo(k[j]) > 0) {
					String temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
	}
}
