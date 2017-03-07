package zadaci_07_03_2017;

import java.util.ArrayList;

public class ShuffleArrayList {
	
	public static void main(String[] args) {

		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i<6; i++){
			list.add(i);
		}
		
		System.out.println(list);
		
		shuffle(list);
		
		System.out.println(list);
	}
	
	//metoda mijesa elemente u listi
	public static void shuffle(ArrayList<Integer> list) {

		for(int i = 0; i < list.size(); i++) {
			int random = (int)(Math.random() * i);
			zamijeni(list, i, random);
		}
	}

	//metode minja pozicije dva elementa u listi
	private static void zamijeni(ArrayList<Integer> list, int i, int random) {
		int temp = list.get(i);
		list.set(i, list.get(random));
		list.set(random, temp);
}
}
