package pe.com.spring.ws.example.webservice;

import java.util.List;
import javax.jws.WebService;
import pe.com.spring.ws.example.domain.Person;
import pe.com.spring.ws.example.service.PersonService;

@WebService(endpointInterface = "pe.com.spring.ws.example.webservice.PublicWebService")
public class PublicWebServiceImpl implements PublicWebService {

	private PersonService personService;

	public Person findPersonById(Long id) {
		return personService.findPersonById(id);
	}

	public List<Person> findPersons() {
		return personService.findPersons();
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

}
