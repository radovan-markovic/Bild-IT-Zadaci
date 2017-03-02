package zadaci_02_03_2017;

public class IntersectingPoint {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// racunamo zadate tacke i prosljedjujemo ih klasi linearne jednacine da
	// bismo dobili rezultat
	public void getIntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3,
			double x4, double y4) {

		this.a = (y1 - y2);
		this.b = (-x1 + x2);
		this.c  = (y3 - y4);
		this.d = (-x3 + x4);
		this.e = -y1 * (x1 - x2) + (y1 - y2) * x1;
		this.f = -y3 * (x3 - x4) + (y3 - y4) * x3;

	}
	
	//ako ad-bc nije nije nula
		public boolean isSolvable (){
			if (((a*d) - (b*c)) != 0){
				return true;
			}
			return false;
		}
		
		//moguce rjesenje jednacine
		public double getX(){
			return (((e*d) - (b*f)) / ((a*d) - (b*c)));
		}
		//moguce rjesenje jednacine
		public double getY(){
			return (((a*f) - (e*c)) / ((a*d) - (b*c)));
		}
}
