package pe.com.spring.ws.example.webservice;

import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;
import pe.com.spring.ws.example.domain.Person;

@WebService
public interface PublicWebService {

	public Person findPersonById(@WebParam(name="id") Long id);

	public List<Person> findPersons();

}
