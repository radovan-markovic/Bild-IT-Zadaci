package zadaci_07_03_2017;

import java.util.Date;

public class GeometricObject {

	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;

	// no arg konstruktor
	public GeometricObject() {
		dateCreated = new Date();
	}

	// konstriktor sa argumentima
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// toString metoda
	@Override
	public String toString() {
		return "Created on " + this.dateCreated + "\ncolor " + this.color + " and filled " + this.filled;
	}

	/**
	 * Accessor method for color.
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	// accessor metoda za boju
	public void setColor(String color) {
		this.color = color;
	}

	// metoda za provjeru da li je popunjen geometrijski objekat
	public boolean isFilled() {
		return filled;
	}

	// metoda za provjeru da li je popunjen geometrijski objekat
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// metoda vraca datum
	public Date getDateCreated() {
		return dateCreated;
	}

	// metoda za setovanje datuma
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}
