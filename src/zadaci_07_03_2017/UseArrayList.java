package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class UseArrayList {

	// testiramo klase Circle i Loan
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();

		Loan loan = new Loan();
		Date date = new Date();
		String str = "abc";
		Circle circle = new Circle();

		list.add(loan);
		list.add(date);
		list.add(str);
		list.add(circle);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}
}
