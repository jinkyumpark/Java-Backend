package days19;
import java.util.HashSet;
import java.util.Iterator;

public class Collection04 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}

		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext())
			System.out.printf("%d ", iter.next());
		System.out.println();
		
		for(Integer i : lotto)
			System.out.printf("%d ", i);
		System.out.println();
	}
}
