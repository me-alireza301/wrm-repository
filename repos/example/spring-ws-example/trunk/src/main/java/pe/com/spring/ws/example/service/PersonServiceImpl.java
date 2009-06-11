package pe.com.spring.ws.example.service;

import java.util.List;

import pe.com.spring.ws.example.dao.PersonDao;
import pe.com.spring.ws.example.domain.Person;

public class PersonServiceImpl implements PersonService {

	private PersonDao personDao;

	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}

	public Person updatePerson(Person person) {
		return this.personDao.updatePerson(person);
	}

	public void deletePerson(Person person) {
		this.personDao.deletePerson(person);
	}

	public Person findPersonById(Long id) {
		return this.personDao.findPersonById(id);
	}

	public List<Person> findPersons() {
		return this.personDao.findPersons();
	}


	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

}
