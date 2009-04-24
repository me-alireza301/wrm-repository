package pe.com.spring.mvc.crud.serviceTest;

import java.util.List;
import pe.com.spring.mvc.crud.configTest.AbstractUnitTest;
import pe.com.spring.mvc.crud.domain.Person;
import pe.com.spring.mvc.crud.service.PersonService;


public class PersonServiceTest extends AbstractUnitTest {

	private PersonService personService;

	public void testSavePerson() {
		System.out.println("testSavePerson");
		Person person = new Person();
		person.setFirstName("Julio");
		person.setLastName("Maguina");
		this.personService.savePerson(person);
		System.out.println("savePerson = " + person.toString());
		assertNotNull(person.getId());
		setComplete();
	}

	public void testUpdatePerson() {
		System.out.println("testUpdatePerson");
		Person person = new Person();
		person.setId(5L);
		person.setFirstName("Leopoldo");
		person.setLastName("Villacorta");
		Person uPerson = this.personService.updatePerson(person);
		System.out.println("Person = " + person.toString());
		System.out.println("updatePerson = " + uPerson.toString());
		assertTrue(uPerson.getFirstName().equals(person.getFirstName()));
	}

	public void testDeletePerson() {
		System.out.println("testDeletePerson");
		Person person = this.personService.findPersonById(5L);
		System.out.println("deletePerson = " + person.toString());
		this.personService.deletePerson(person);
		Person dPerson = this.personService.findPersonById(5L);
		assertNull(dPerson);
	}

	public void testFindPersonById() {
		System.out.println("testFindPersonById");
		Person person = this.personService.findPersonById(3L);
		System.out.println("findPersonById = " + person.toString());
		assertNotNull(person);
	}

	public void testFindPersons() {
		System.out.println("testFindPersons");
		List<Person> personList = this.personService.findPersons();
		for (Person person : personList) {
			System.out.println("Person = " + person.toString());
		}
		assertNotNull(personList);
		//assertTrue(personList != null && personList.size() > 0);
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

}
