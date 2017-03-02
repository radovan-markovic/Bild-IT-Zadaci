package zadaci_02_03_2017;

public class Fan {
	
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = 1;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	//kreiramo default konstruktor
	Fan(){
		
	}
	//kreiramo konstruktor sa argumentima
	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	//generisemo get i set metode
	public int getSpeed() {
		if (speed == 2){
			return MEDIUM;
		}
		if (speed == 3){
			return FAST;
		}
		return SLOW;
	}
	public boolean isOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//toString metoda
	@Override
	public String toString() {
		return "Fan speed=" + getSpeed() + ", is on=" + on
				+ ", radius=" + radius + ", color=" + color;
	}
	
}
