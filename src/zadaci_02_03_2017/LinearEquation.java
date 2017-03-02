package zadaci_02_03_2017;

public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(){
		
	}
	//konstruktor sa argumentima
	LinearEquation (double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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
