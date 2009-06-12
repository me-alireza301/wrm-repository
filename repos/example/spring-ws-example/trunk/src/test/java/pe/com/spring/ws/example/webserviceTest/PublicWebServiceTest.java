package pe.com.spring.ws.example.webserviceTest;

import junit.framework.TestCase;


public class PublicWebServiceTest extends TestCase{

	public void testFindPersons() {
		/*
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(PublicWebService.class);
		factory.setAddress("http://localhost:8080/spring-ws-example/services/publicWebService");

		System.out.println("testFindPersons");
		PublicWebService webServiceClient = (PublicWebService) factory.create();
		List<Person> personList = webServiceClient.findPersons();
		for (Person person : personList) {
			System.out.println("Person = " + person.toString());
		}
		*/
	}
}
