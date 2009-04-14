package pe.com.spring.mvc.crud.dao;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.mvc.crud.domain.Person;


public interface PersonDao{

	public void savePerson(Person person);

	public Person updatePerson(Person person);

	public void deletePerson(Person person);

	public Person findPersonById(final Serializable id);

	public List<Person> findPersons();

}
