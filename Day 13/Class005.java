package days13;

public class Class005 {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.init(6, 8);
		Complex c2 = new Complex();
		c2.init(8, 9);
		
		c1.prn();
		c2.prn();
		
		Complex c3 = new Complex();
		c3 = c1.add(c2);
		c1.prn();
		c2.prn();
		c3.prn();
		
		c2.init(2, 3);
		c3 = c1.substract(c2);
		c1.prn();
		c2.prn();
		c3.prn();
	}
} 

class Complex {
	int real;
	int image;
	
	public void init(int real, int image) {
		this.real = real;
		this.image = image;
	}
	
	public void prn() {
		System.out.print(real + " + " + image + "i\n");
	}
	
	public Complex add(Complex num) {
		int realResult = this.real + num.real;
		int imageResult = this.image + num.image;
		Complex output = new Complex();
		output.init(realResult, imageResult);
		return output;
	}
	
	public Complex substract(Complex num) {
		int realResult = this.real - num.real;
		int imageResult = this.image - num.image;
		Complex output = new Complex();
		output.init(realResult, imageResult);
		return output;
	}
}