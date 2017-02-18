package zadaci_18_02_2017;

import java.text.SimpleDateFormat;
import java.util.Date;
// milisekunde u datum
public class Zadatak3 {

	public static void main(String[] args) {
		
		long milliseconds = System.currentTimeMillis();
		//formatiramo datum na osnovu proslijedjenih milisekundi
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM, yyyy. HH:mm:ss");    
		Date resultdate = new Date(milliseconds);
		System.out.print("Trenutni datum i vrijeme: ");
		System.out.println(sdf.format(resultdate));

	}

}
