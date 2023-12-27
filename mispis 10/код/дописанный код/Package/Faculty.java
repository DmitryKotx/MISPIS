package Package;

import java.time.LocalDateTime;
import java.util.Date;

public class Faculty {

	public Employee dean = null;
	public String name = "";
	public Date dateOfCreation = null;
	public String officeAddress = "";

	public Faculty(Employee dean, String name, Date dateOfCreation, String officeAddress)  {
		this.dean = dean;
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.officeAddress = officeAddress;
	}

	public double age() {
		// TODO - implement Faculty.age

		LocalDateTime localDateTime = LocalDateTime.now();
		long age = localDateTime.toLocalDate().toEpochDay();
		return age;
	}

	/**
	 * 
	 * @param newOfficeAdress
	 */
	public void changeOfficeAdress(String newOfficeAdress) {
		// TODO - implement Faculty.changeOfficeAdress
		
		this.officeAddress = newOfficeAdress;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.dean.toString() + " " + this.name + " " + this.dateOfCreation + " " + this.officeAddress;
	}

}