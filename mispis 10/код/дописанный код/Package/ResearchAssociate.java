package Package;

import java.util.Date;

public class ResearchAssociate extends Employee {


	public Project project;

	public ResearchAssociate(int ssNo, String name, Date birthday, String email, int salary, String fieldOfStudy) {
		super(ssNo, name, birthday, email, salary);
	}

	public void startProject(Project project) {
		this.project = project;
		Participation participation = new Participation();
	}
}