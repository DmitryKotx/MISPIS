package Package;

import java.util.Date;

public class University {

	public Employee rector = null;
	public String name = "";
	public Date dateOfCreation = null;
	public String mainOfficeAddress = "";

	public University(Employee rector, String name, Date dateOfCreation, String mainOfficeAddress) {
		this.rector = rector;
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.mainOfficeAddress = mainOfficeAddress;
	}

	/**
	 * 
	 * @param newOfficeAdress
	 */
	public void changeOfficeAddress(String newOfficeAdress) {
		// TODO - implement University.changeOfficeAdress

		this.mainOfficeAddress = newOfficeAdress;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.rector + " " + this.name + " " + this.dateOfCreation + " " + this.mainOfficeAddress;
	}

}