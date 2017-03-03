package zadaci_03_03_2017;

public class TestMyPoint {

	public static void main(String[] args) {
		
		//testiramo klasu myPoint sa primjerima iz zadatka
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		
		double distance = p1.distance(-5, 5);
		double distance2 = p1.distance(p2);
		
		System.out.println("Distanca p1 od x = " +  p1.getX() + ", do y = " + p1.getY() + 
				" je: " + distance);
		
		System.out.println("Distanca p1 od x = " +  p1.getX() + ", i y = " + p1.getY() + 
				" i p2 od x = " + p2.getX() + ",i y = " + p2.getY() + " je: " + distance2);
	}

}
