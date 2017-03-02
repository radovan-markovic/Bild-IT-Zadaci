package zadaci_02_03_2017;

public class TestRegularPolygon {

	public static void main(String[] args) {
		
		//kreiramo tri objekta za testiranje
		RegularPolygon rp1 = new RegularPolygon();
		System.out.println("Obim je: " + rp1.getPerimeter());
		System.out.println("Povrsina je: " + rp1.getArea());
		
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		System.out.println("Obim je: " + rp2.getPerimeter());
		System.out.println("Povrsina je: " + rp2.getArea());
		
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Obim je: " + rp3.getPerimeter());
		System.out.println("Povrsina je: " + rp3.getArea());

	}

}
