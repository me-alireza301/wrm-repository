package pe.com.spring.mvc.crud.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pe.com.spring.mvc.crud.domain.Person;
import pe.com.spring.mvc.crud.service.PersonService;

public class PersonController implements Controller {

	protected final Log logger = LogFactory.getLog(getClass());

	private PersonService personService;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("PersonController");
		List<Person> personList = personService.findPersons();
		for (Person person : personList) {
			logger.info("person = " + "\n" + person.toString());
			System.out.println("person = " + "\n" + person.toString());
		}
		return new ModelAndView("personList", "personList", personList);

	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

}
