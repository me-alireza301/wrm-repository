package pe.com.spring.jpa.hibernate.dao.test;

import pe.com.spring.jpa.hibernate.config.test.AbstractJpaUnitTest;
import pe.com.spring.jpa.hibernate.dao.PartyTypeDao;
import pe.com.spring.jpa.hibernate.dao.PersonDao;
import pe.com.spring.jpa.hibernate.dao.StatusDao;
import pe.com.spring.jpa.hibernate.domain.PartyType;
import pe.com.spring.jpa.hibernate.domain.Person;
import pe.com.spring.jpa.hibernate.domain.Status;

public class PersonDaoTest extends AbstractJpaUnitTest {
	
	private PersonDao personDao;
	private PartyTypeDao partyTypeDao;
	private StatusDao statusDao;
	

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public PartyTypeDao getPartyTypeDao() {
		return partyTypeDao;
	}

	public void setPartyTypeDao(PartyTypeDao partyTypeDao) {
		this.partyTypeDao = partyTypeDao;
	}
	
	public StatusDao getStatusDao() {
		return statusDao;
	}

	public void setStatusDao(StatusDao statusDao) {
		this.statusDao = statusDao;
	}

	public void testSavePersonDao(){
		PartyType partyType = this.getPartyTypeDao().findPartyTypeById(1L);
		Status status = this.getStatusDao().findStatusById(1L);
	
		Person person = new Person();
		person.setPartyType(partyType);
		person.setExternalId("2010");
		person.setDescription("deco");
		person.setStatus(status);
		person.setFirstName("deyvi");
		person.setMiddleName("Oliveira");
		person.setLastName("romero");
		person.setPersonalTitle("engineer");
		person.setGender('M');
		this.getPersonDao().savePerson(person);
		
		//assertNotNull(person.getParty().getPartyId());
		setComplete();
	}
	

}

