package zadaci_09_03_2017;

import java.util.Date;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	// defaultni konstruktor
	public Loan() throws IllegalArgumentException {
		this(3.5, 1, 1400);
	}

	// konstruktor sa svim parametrima
	public Loan(double annualInterestRate, int numberOdYears, double loanAmount) throws IllegalArgumentException {

		if (annualInterestRate <= 0)
			throw new IllegalArgumentException("Kamatna stopa mora biti mora biti veca od nule.");
		else if (numberOdYears <= 0)
			throw new IllegalArgumentException("Broj godina mora biti veci od nule.");
		else if (loanAmount <= 0)
			throw new IllegalArgumentException("Iznos pozajmice mora biti veci od nule.");
		else {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOdYears;
			this.loanAmount = loanAmount;
			loanDate = new Date();
		}
	}

	// toString metoda
	@Override
	public String toString() {
		return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount="
				+ loanAmount + ", loanDate=" + loanDate + "]";
	}

	// metoda vraca anual inerest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// metoda setuje annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if (annualInterestRate > 0)
			this.annualInterestRate = annualInterestRate;
		else
			throw new IllegalArgumentException();
	}

	// vracamo broj godina pozajmice
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// setujemo broj godina pozajmice
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if (numberOfYears > 0)
			this.numberOfYears = numberOfYears;
		else
			throw new IllegalArgumentException();
	}

	// vracamo iznos pozajmice
	public double getLoanAmount() {
		return loanAmount;
	}

	// setujemo novu vrijednost za pozajmicu
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if (loanAmount > 0)
			this.loanAmount = loanAmount;
		else
			throw new IllegalArgumentException();
	}

	// vracamo datum kreiranja pozajmice
	public Date getLoanDate() {
		return loanDate;
	}

	// vracamo mjesecni iznos
	public double getMonthlyPayment() {

		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

		return monthlyPayment;
	}

	// vracamo totalni iznos uplate
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
}

