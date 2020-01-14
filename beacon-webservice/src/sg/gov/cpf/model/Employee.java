package sg.gov.cpf.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String enterpriseId;
	private String firstName;
	private String position;

	public Employee() {

	}

	public Employee(String enterpriseId, String firstName, String position) {

		this.enterpriseId = enterpriseId;
		this.firstName = firstName;
		this.position = position;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	@XmlElement
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPosition() {
		return position;
	}

	@XmlElement
	public void setPosition(String position) {
		this.position = position;
	}

}
