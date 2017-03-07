package zadaci_07_03_2017;

public class Faculty extends Employee {

	protected String officeHours;
    protected String rank;
	
    //no arg konstruktor
    public Faculty() {
    	
    }
    
    //konstruktor sa argumentom ime
    public Faculty(String name) {
        this(name, "8-16h", "Employee");
    }
    
    //konstruktor sa svim argumentima
    public Faculty(String name, String officeHours, String rank) {
    	super(name);
    	this.officeHours = officeHours;
    	this.rank = rank;
    }
    
    //toString metoda
    @Override
    public String toString() {
    	return "Faculty name: " + getName();
    }

    //get metode
	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}
    
    
}
