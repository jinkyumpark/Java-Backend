package days19;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Enumeration;

public class Collection05 {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		HashMap<Integer, ArrayList<String>> kk = new HashMap<>();
		
		Enumeration<String> e1 = ht.keys();
		while(e1.hasMoreElements()) {
			String key = e1.nextElement();
			int value = ht.get(key);
			System.out.printf("key(%s)=Value(%d)", key, value);
		}
	}
}
