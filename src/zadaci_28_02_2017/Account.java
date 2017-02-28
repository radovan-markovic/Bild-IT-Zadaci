package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//default konstruktor
	Account (){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	//konstruktor sa argumentima
	Account (int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	//metoda za kreiranje datuma
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//kreiramo get i set metode za annualInterestRate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//kreiramo get i set metode za id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//kreiramo get i set metode za balance
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//kreiramo get i set metode za Monthly Interest Rate
	public double getMonthlyInterestRate(){
		return (getAnnualInterestRate()/100) / 12;
	}
	
	public double getMonthlyInterest(){
		return balance * getMonthlyInterestRate();
	}
	//motda withdraw povlaci novac sa racuna
	public void withdraw (double amount){
		balance = balance - amount;
	}
	//metoda deposit uplacuje novac na racun
	public void deposit (double amount){
		balance = balance + amount;
	}
	
	//testiramo klasu Account
	public static void main(String[] args) {
		
		//unosimo podatke iz zadatka
		Account acc1 = new Account(1122, 20000);
		System.out.println("Korisnik "+acc1.getId()+ " ima na racunu: "+ acc1.getBalance());
		acc1.setAnnualInterestRate(4.5);
		System.out.println("Podignuto sa racuna 2500");
		acc1.withdraw(2500);
		System.out.println("Uplaceno na racun 3000");
		acc1.deposit(3000);
		System.out.println("Korisnik "+acc1.getId()+ " ima na racunu: "+ acc1.getBalance() + " Mjesecna kamata inosi: " + 
		acc1.getMonthlyInterest() + " Racun je kreiran: " + acc1.getDateCreated());

	}
}
