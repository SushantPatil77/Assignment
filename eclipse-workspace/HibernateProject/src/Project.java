import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long projectID;
	    private String projectName;
	    private String contactPerson;
		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Project(Long projectID, String projectName, String contactPerson) {
			super();
			this.projectID = projectID;
			this.projectName = projectName;
			this.contactPerson = contactPerson;
		}
		@Override
		public int hashCode() {
			return Objects.hash(contactPerson, projectID, projectName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Project other = (Project) obj;
			return Objects.equals(contactPerson, other.contactPerson) && Objects.equals(projectID, other.projectID)
					&& Objects.equals(projectName, other.projectName);
		}
		public Long getProjectID() {
			return projectID;
		}
		public void setProjectID(Long projectID) {
			this.projectID = projectID;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		@Override
		public String toString() {
			return "Project [projectID=" + projectID + ", projectName=" + projectName + ", contactPerson="
					+ contactPerson + "]";
		}
	    
}
