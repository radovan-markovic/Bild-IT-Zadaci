package zadaci_07_03_2017;

public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String eMail;
	
	//no arg konstruktor
	public Person() {
	}
	
	//konstruktor sa argumentom ime
	 public Person(String name) {
	        this.name = name;
	    }
	 
	//konstruktor sa svim argumentima
	public Person(String name, String address, String phoneNumber, String eMail) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	
	//toString metoda
	@Override
	public String toString() {
		return "Person's name: " + this.name + "\nAddress: " + this.address + "\nPhoneNumber: " + this.phoneNumber
				+ "\neMail: " + this.eMail; 
	}
	
	//get metode
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String geteMail() {
		return eMail;
}
}
