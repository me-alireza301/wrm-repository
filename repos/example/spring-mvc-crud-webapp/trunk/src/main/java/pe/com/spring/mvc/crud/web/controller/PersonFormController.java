package pe.com.spring.mvc.crud.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import pe.com.spring.mvc.crud.domain.Person;
import pe.com.spring.mvc.crud.service.PersonService;

public class PersonFormController extends SimpleFormController {

	private PersonService personService;

	public Object formBackingObject(HttpServletRequest request)
			throws ServletException {

		Person person = new Person();
		System.out.println("formBackingObject");

		/*
		 * The backing object should be set up here, with data for the initial
		 * values of the form’s fields. This could either be hard-coded, or
		 * retrieved from a database.
		 */
		return person;
	}

	public ModelAndView onSubmit(Object command) throws ServletException {
		Person person = (Person) command;
		System.out.println("onSubmit person : " + person.toString());

		personService.savePerson(person);

	 	//Now you can validate to database
        return new ModelAndView("succes");
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

}
