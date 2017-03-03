package zadaci_03_03_2017;

public class TestTime {

	public static void main(String[] args) {
		
		//testiramo klasu Time kreirajuci dva objekta (kako je navedeno u zadatku)
		Time t1 = new Time();
		System.out.println(t1.hours + 1 +":" +t1.minutes +":" +t1.seconds);
		
		Time t2 = new Time(555550000);
		System.out.println(t2.hours + 1 +":" +t2.minutes+":" +t2.seconds);
	}

}
