package zadaci_07_03_2017;

public class Circle {

	private double x;
	private double y;
	private double radius;

	// no arg konstruktor
	public Circle() {
		this(0, 0, 1);
	}

	// konstruktor sa svim argumentima
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// racunamo distancu
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + (Math.pow((this.y - y), 2)));
	}

	// racunamo obim
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	// racunamo povrsinu
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	//toString metoda
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
}

	// acessor metode
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
}
