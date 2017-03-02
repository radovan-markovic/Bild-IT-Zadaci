package zadaci_02_03_2017;

public class QuadraticEquation {
	
	private double a, b, c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//get metode za a, b ,c
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	//racunamo diskriminantu
	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}
	
	//racunamo korijen 1
	public double getRoot1() {
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}
	
	//racunamo korijen 2
	public double getRoot2() {
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}
	
	
}
