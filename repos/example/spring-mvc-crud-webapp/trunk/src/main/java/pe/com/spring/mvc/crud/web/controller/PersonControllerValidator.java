package pe.com.spring.mvc.crud.web.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pe.com.spring.mvc.crud.domain.Person;

public class PersonControllerValidator implements Validator{

	@SuppressWarnings("unchecked")
	public boolean supports(Class clazz) {
        return clazz.equals(Person.class);
	}

	public void validate(Object object, Errors errors) {

		Person person = (Person) object;

		System.out.println("validate person = " + person);

        if (person == null) {
            errors.rejectValue("person", "error.login.not-specified", null,"Value required.");
        } else {
            if (person.getFirstName()== null || person.getFirstName().trim().length() <= 0) {
            	System.out.println("firstName null value");
                errors.rejectValue("firstName", "error.login.invalid-user",
						null, "firstName is Required.");
            }
            if (person.getLastName()== null || person.getLastName().trim().length() <= 0) {
            	System.out.println("lastName null value");
                    errors.rejectValue("lastName", "error.login.invalid-dept",
						null, "lastName is Required.");
            }
       }
	}

}
