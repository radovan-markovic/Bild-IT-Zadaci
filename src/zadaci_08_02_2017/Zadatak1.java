package zadaci_08_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Zadatak1 {

	private static Integer b;

	public static void main(String[] args) {
		
		//kreiramo listu koja prihvata integere
		ArrayList<Integer> list = new ArrayList<>();
		
		
		Scanner input = new Scanner(System.in);
		
		/*dodajemo elemente u listu a sa 0 prekidamo unos, ako prvi unos 
		bude 0 lista nece imati elemenata*/
		System.out.println("Unesite broj:");
		int i = input.nextInt();
		
		while (i != 0){
			list.add(i);
			System.out.println("Unesite jos jedan broj: ");
			i = input.nextInt();
		}
		
		/*ispisujemo najveci element u listi ili vracamo null ako 
		nema elemenata u listi*/
		System.out.println(max(list));
		
	}
	
	public static Integer max (ArrayList<Integer> list){
		
		int max = 0;
		Integer a = 1;
		
		if (!list.isEmpty()){
			for (int i = 0; i<list.size(); i++){
				//pronalazimo najveci element u listi
				if (list.get(i) > max){
					max = list.get(i);
				}
			}
			
			return max;	
		}
		//vracamo null ako nema elemenata u listi
		return null;
	}

}