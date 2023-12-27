package Package;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee {

	public int ssNo = 0;
	public String name = "";
	public Date birthday = null;
	public String email =  "";
	public int salary = 0;
	public int balance = 0;
	public static int counter = 0;

	public Employee(int ssNo, String name, Date birthday, String email, int salary) {
		this.ssNo = ssNo;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.salary = salary;
		counter++;
	}
	
	public double age() {
		// TODO - implement Employee.age

		LocalDateTime localDateTime = LocalDateTime.now();
		long age = localDateTime.toLocalDate().toEpochDay();
		return age;
	}

	public void getSalary() {
		// TODO - implement Employee.getSalary

		this.balance += this.salary;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newSalary
	 */
	public void changeSalary(int newSalary) {
		// TODO - implement Employee.changeSalary

		this.salary = newSalary;

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance;
	}

}