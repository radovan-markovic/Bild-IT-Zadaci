package zadaci_07_03_2017;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	// no arg konstruktor
	public Triangle() {
		this(1.0, 1.0, 1.0);
	}

	// konstruktor sa argumentima koji na osnovu proslijedjenih strana kreira
	// trougao
	public Triangle(double side1, double side2, double side3) {

		if (isTriangle(side1, side2, side3)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			try {
				throw new Exception("Trougao ne moze biti kreiran.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// konstruktor koji kreira trougao na osnovu proslijedjenih stranica,
	// popunjava ga
	// i boji po izboru
	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// metoda vraca obim trougla
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	// metoda vraca povrsinu trougla
	public double getArea() {
		double side = (side1 + side2 + side3) / 2.0;
		double calculateSides = ((side - side1) * (side - side2) * (side - side3));
		double area = Math.sqrt(side * calculateSides);
		return area;
	}

	// toString metoda
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
	}

	// metoda provjerava da li je objekat trougao
	public static boolean isTriangle(double side1, double side2, double side3) {
		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
	}

	// metode vracaju stranicu trougla
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
}
