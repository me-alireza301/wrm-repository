package pe.com.spring.mvc.crud.dao;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.mvc.crud.domain.Person;
import pe.com.spring.mvc.crud.util.common.dao.GenericDAOHibernate;


public class PersonDaoImpl extends GenericDAOHibernate implements PersonDao {

	public void savePerson(Person person) {
		/*
		 * if (person == null) { throw new
		 * RuntimeException("Can't create Person because the object is NULL"); }
		 */
		super.save(person);
	}

	public Person updatePerson(Person person) {
		/*
		 * if (person == null) { throw new
		 * RuntimeException("Can't update Person because the object is NULL"); }
		 */
		return super.update(person);
	}

	public void deletePerson(Person person) {
		super.delete(person);
	}

	public Person findPersonById(Serializable id) {
		return (id == null ? null : findById(Person.class, id));
	}

	public List<Person> findPersons() {
		return find(Person.class, "from Person");
	}

}
