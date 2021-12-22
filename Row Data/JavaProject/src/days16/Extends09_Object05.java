package days16;
import java.util.Vector;

// 상품과 구매자를 클래스로 만들고 구매, 환불 등의 동작을 매서드로 제작

public class Extends09_Object05 {
	public static void main(String[] args) {
		TV t = new TV();
		Computer c = new Computer();
		Audio a = new Audio();
		
		System.out.println(t);
		System.out.println(c);
		System.out.println(a);
		
		Buyer b = new Buyer();
		b.buy(c);
		b.buy(a);
		b.buy(t);
		
		b.refund(c);
		b.summary();
	}
}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = price/10;
	}
}

class Computer extends Product {
	Computer() {
		super(100);
	}
	
	public String toString() {
		return "Computer";
	}
	
}

class TV extends Product {
	TV() {
		super(100);
	}
	public String toString() {
		return "TV";
	}
}

class Audio extends Product {
	Audio() {
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();

	public void buy(Product p) {
		// Determine whether money is sufficient to buy a certain product
		if(!(this.money > p.price)) {
			System.out.println("Insufficient Balance");
			return;
		}
		
		this.money -= p.price;
		
		this.bonusPoint += p.bonusPoint;
		System.out.println("You have successfully purchased " + p);
		
		item.add(p);
	}
	
	public void summary() {
		int sum = 0;
		String itemList = "";
		if(item.isEmpty()) {
			System.out.println("You didn't purchase any item");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemList += " " + p;
		}
		System.out.println("Total: " + sum + ", List: " + itemList);
	}
	
	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println("You have refund " + p);
		} else {
			System.out.println("You didn't Purchase that item");
		}
	}
}
