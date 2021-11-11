package days19;
import java.util.HashMap;

public class Collection09 {
	public static void main(String[] args) {
		HashMap<Rect, Integer> map = new HashMap<>();
		map.put(new Rect(10, 10), 10);
		map.put(new Rect(20, 20), 20);
		map.put(new Rect(30, 30), 30);
		for(Rect k : map.keySet())
			System.out.printf("(%s) -> %d ", k, map.get(k));
	}
}

class Rect {
	private int x;
	private int y;
	public Rect(int x, int y) {
	
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Rect))
			return false;
		Rect target = (Rect)obj;
		boolean flag = ((this.x == target.x) && this.y == target.y);
		return flag;
	}
	
}