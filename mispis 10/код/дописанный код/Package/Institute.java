package Package;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Institute {

	public String name = "";
	public Date dateOfCreation = null;
	public String address = "";
	public List<ResearchAssociate> researchAssociates = new ArrayList<>();

	public Institute(String name, Date dateOfCreation, String address) {
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		this.address = address;
	}

	public double age() {
		// TODO - implement Institute.age

		LocalDateTime localDateTime = LocalDateTime.now();
		long age = localDateTime.toLocalDate().toEpochDay();
		return age;
	}

	/**
	 * 
	 * @param newAdress
	 */
	public void changeAdress(String newAdress) {
		// TODO - implement Institute.changeAdress

		this.address = newAdress;

		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void addResearchAssociate(ResearchAssociate researchAssociate) {
		// TODO - implement Institute.addResearchAssociate

		if (!this.researchAssociates.contains(researchAssociate)) {
			this.researchAssociates.add(researchAssociate);
		}

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.name + " " + this.dateOfCreation + " " + this.address + " " + this.researchAssociates;
	}

}