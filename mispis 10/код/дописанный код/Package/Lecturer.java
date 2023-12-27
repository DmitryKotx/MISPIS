package Package;

import java.util.Date;

public class Lecturer extends ResearchAssociate {


	public Lecturer(int ssNo, String name, Date birthday, String email, int salary, String fieldOfStudy) {
		super(ssNo, name, birthday, email, salary, fieldOfStudy);
	}

	public void conductClass(int classNumber) {
		// TODO - implement Lecturer.conductClass


		// read selected material for students

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.ssNo + " " + this.name + " " + this.birthday + " " + this.email + " " + this.salary + " " + this.balance;
	}

}