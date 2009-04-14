package pe.com.spring.mvc.crud.domain;

public class Person implements java.io.Serializable {

	private static final long serialVersionUID = 5378581335406346004L;
	private Long id;
	private String firstName;
	private String lastName;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer("<person>" + "\n");
		stringBuffer.append("	<id>" + ((id != null) ? id : "") + "</id>" + "\n");
		stringBuffer.append("	<firstName>" + ((firstName != null) ? firstName : "") + "</firstName>" + "\n");
		stringBuffer.append("	<lastName>" + ((lastName != null) ? lastName : "") + "</lastName>" + "\n");
		stringBuffer.append("</person>");
		return stringBuffer.toString();
	}

}
