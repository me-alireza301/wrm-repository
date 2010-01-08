package pe.com.spring.jpa.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.jpa.hibernate.domain.Person;

public interface PersonDao {
	
	void savePerson(Person person);

    Person updatePerson(Person person);

    void deletePerson(Person person);

    Person findPersonById(final Serializable id);

    List<Person> findPersonAll();

}
