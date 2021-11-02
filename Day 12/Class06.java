package days12;
import java.util.Scanner;

public class Class06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectMenu = -1;
		
		AccountWithPermission a = new AccountWithPermission();
		a.initBalance(50000);
		
		while(selectMenu != 4) {
			System.out.printf("Select Menu : 1. Deposit  2. Withdraw  3. Check Balance  4. End : ");
			selectMenu = sc.nextInt();

			switch(selectMenu) {
			case 1:
				a.deposit();
				break;
			case 2:
				a.withdraw();
				break;
			case 3:
				a.display();
				break;
			}
		}
	}
}

class AccountWithPermission {
	private double balance;
	private int password = 1234;
	public void initBalance(int money) {
		balance = money;
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many krw do you want to deposit? : ");
		double money = sc.nextDouble();
		
		balance += money;
	}

	public void withdraw() {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many krw do you want to deposit : ");
		double money = sc.nextDouble();
		
		System.out.print("Enter Password : ");
		int pass = sc.nextInt();
		
		if(pass != password) {
			System.out.println("Wrong Password");
			return;
		}
		if(money > balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		balance -= money;
	}

	public void display() {
		System.out.println("Your current balance is : " + balance);
	}
}