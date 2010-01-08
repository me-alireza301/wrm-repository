package pe.com.spring.jpa.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;
import pe.com.spring.jpa.hibernate.dao.PersonDao;
import pe.com.spring.jpa.hibernate.domain.Person;
import pe.com.spring.jpa.hibernate.generic.dao.GenericJpaDaoHibernate;

public class PersonDaoImpl extends GenericJpaDaoHibernate implements PersonDao {

	public final void deletePerson(Person person) {
		super.delete(person);
	}

	public final List<Person> findPersonAll() {
		return super.find(Person.class, "from Person");
	}

	public final Person findPersonById(Serializable id) {
		return super.findById(Person.class, id);
	}

	public final void savePerson(Person person) {
		super.save(person);

	}

	public final Person updatePerson(Person person) {
		return super.update(person);
	}

}
