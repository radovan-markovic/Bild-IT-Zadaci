package zadaci_03_03_2017;

public class MyPoint {

	private double x, y;
	
	//konstruktor
	MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	//konstruktor sa parametrima
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//metoda vraca distancu od jedne tacke do druge tacke
	public double distance(MyPoint myPoint) {
		return distance(myPoint.x, myPoint.y);
	}
	
	//metoda vraca distancu od jene do druge tacke sa proslijedjenim x i y koordinatama
	public double distance(double x, double y) {
		double distance = Math.sqrt((Math.pow((this.x - x), 2)) + (Math.pow((this.y - y), 2)));
		return distance;
	}
	
	//get metode
		public double getX(){
			return x;
		}

		public double getY() {
			return y;
		}
	
}
