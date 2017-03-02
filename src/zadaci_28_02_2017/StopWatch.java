package zadaci_28_02_2017;

import java.text.SimpleDateFormat;
import java.util.Date;


public class StopWatch {
	//pravimo data fildove
	private long startTime;
	private long endTime;
	
	//kreiramo get metode
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		endTime = System.currentTimeMillis();
		return endTime;
	}
	//pravimo konstruktor
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	//startujemo stopericu
	public long start() {
		return getStartTime();
	}
	//zaustavljamo stopericu
	public long stop() {
		return getEndTime();
	}
	//vracamo razliku u vremenu
	public long getElapsedTime() {
		return (endTime - startTime);
	}
	
	public static void main(String[] args) throws Exception {
		
		//pravimo novi objekat
		StopWatch s1 = new StopWatch();
		int[] niz = new int[100000];
		napuniNiz(niz);
		
		//startujemo stopericu
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss.SSS");
		String start = sdf1.format(new Date(s1.start()));
		System.out.println("Stoperica je startovana u: " + start);
		
		//radimo selection sort
		selectionSort(niz);
		System.out.println("Selection sort...");
		
		//zaustavljamo stopericu
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS");
		String stop = sdf2.format(new Date(s1.stop()));
		System.out.println("Stoperica je zaustavljena u: " + stop);
		
		//vracamo razliku u vremenu na stoperici
		SimpleDateFormat sdf = new SimpleDateFormat("00:mm:ss.SSS");
		String date = sdf.format(new Date(s1.getElapsedTime()));
		System.out.println("Zaustavno vrijeme na stoperici je: " + date);

	}
	
	//metoda puni niz nasumicnim brojevima
	public static void napuniNiz(int... niz) {
		
		for(int i = 0; i < niz.length; i++) {
			niz[i] =(int)(Math.random()*100);
		}
	}
	
	//metoda koja radi selection sort
	public static void selectionSort(int... niz) {
		
		for(int i = 0; i < niz.length; i++) {
			
			int min = i;
			for(int j = i; j < niz.length; j++) {
				
				if(niz[min] > niz[j])
					min = j;
			}
			
			int temp = niz[min];
			niz[min] = niz[i];
			niz[i] = temp;
		}
}
}
