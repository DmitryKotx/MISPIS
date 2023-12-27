package Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

	public String name = "";
	public Date start = null;
	public Date end = null;
	public List<String> reports = new ArrayList<>();

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}


	/**
	 * 
	 * @param researchAssociate
	 */
	public void createReport(ResearchAssociate researchAssociate) {
		// TODO - implement Project.createReport

		String newReport = null;

		// create report

		newReport += "\n [" + researchAssociate.name + "]";
		reports.add(newReport);

		throw new UnsupportedOperationException();
	}

	public String toString() {
		return this.name + " " + this.start + " " + this.end + " " + this.reports;
	}

}