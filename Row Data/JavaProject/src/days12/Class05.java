package days12;

public class Class05 {
	public static void main(String[] args) {
		Account a = new Account();
		a.initBalance(100000);
		a.display();
		a.withdraw(5000); 	a.display();
		a.deposit(20000);		a.display();
	}
}

// 정보은닉
// 맴버필드는 현실에 존재하는 정보를 저장, 그렇기 때문에 private로 선언, 제어할 매소드를 public으로 선언

class Account {
	private double balance; // 계좌정보 클래스에 잔액이 저장된 맴버변수
	// 클래스의 맴버필드/매소드의 접근지정자(private, protected, public)에 의해서 외부에서의 접근을 제어 가능
	// 접근지정자 사용하지 않을 경우 public 기본값, 클래스 외부에서 임의로 조작 가능
	// 이를 방지하기 위해 private 사용, 자기자신 class의 맴버매서드에서만 접근 가능
	// 맴버매서드는 보통 public
	
	public void initBalance(int i) {
		balance = i;
	}
	
	public void display() {
		System.out.printf("Current balance is %.2f krw.\n", balance);
	}
	
	public void withdraw(int money) {
		if(money > balance) {
		} 
	}
	
	public void deposit(int money) {
		balance += money;
	}
} 