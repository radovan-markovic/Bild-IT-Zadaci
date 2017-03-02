package zadaci_02_03_2017;

public class TestFan {

	public static void main(String[] args) {
		
		//testiramo klasu Fan kreirajuci dva nova objekta
		Fan f1 = new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);

		System.out.println(f1.toString());
		
		Fan f2 = new Fan();
		f2.setSpeed(2);
		
		System.out.println(f2.toString());

	}

}
