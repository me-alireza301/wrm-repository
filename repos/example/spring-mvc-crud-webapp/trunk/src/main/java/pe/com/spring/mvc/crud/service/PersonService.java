package pe.com.spring.mvc.crud.service;

import java.util.List;
import pe.com.spring.mvc.crud.domain.Person;

public interface PersonService {

	public void savePerson(Person person);

	public Person updatePerson(Person person);

	public void deletePerson(Person person);

	public Person findPersonById(Long id);

	public List<Person> findPersons();

}
