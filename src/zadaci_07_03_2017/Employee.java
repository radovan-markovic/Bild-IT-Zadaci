package zadaci_07_03_2017;

public class Employee extends Person {
	
	private String office;
	private double salary;
	private MyDate dateHired = new MyDate();
	
	//no arg konstuktor
	public Employee() {
		
	}
	
	//konstruktor sa  argemntom ime
	public Employee(String name) {
		this(name, "none", 0, new MyDate());
	}
	
	//konstruktor sa svim argumentima iz zadatka
	public Employee(String name, String office, double salary, MyDate dateHired) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	//toString metoda
	@Override
	public String toString() {
		return "Employee name: " + getName() + "\nOffice: " + this.office + "\nSalary: " + this.salary
				+ "\nDate hired: " + this.dateHired;
	}
	
	//get metode
	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

}
