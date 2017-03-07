package zadaci_07_03_2017;

public class Staff extends Employee {

	private String title;

	//no arg konstruktor
	public Staff() {

	}
	
	//konstruktor sa argumentom ime
	public Staff(String name) {
		this(name, "no title");

	}
	
	//konstruktor sa svim argumentima
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	//toString metoda
	@Override
	public String toString() {
		return "Staff name: " + getName() + "\nTitle: " + this.title;
	}
	
	//grt mrtoda
	public String getTitle() {
		return title;
	}


}
