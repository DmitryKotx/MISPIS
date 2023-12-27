package Package;

import java.util.Date;

public class AdministrativeEmployee extends Employee {

	public AdministrativeEmployee(int ssNo, String name, Date birthday, String email, int salary) {
		super(ssNo, name, birthday, email, salary);
	}

	/**
	 * 
	 * @param employee
	 */

	public void paySalary(Employee employee) {
		// TODO - implement AdministrativeEmployee.paySalary

		employee.getSalary();

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance;
	}

}