package pe.com.spring.ws.example.webserviceTest;

import java.util.List;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.com.spring.ws.example.domain.Person;
import pe.com.spring.ws.example.webservice.PublicWebService;

public class PublicWebServiceClientTest extends TestCase {
	public void testFindPersons() {
		System.out.println("testFindPersons");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] {"pe/com/spring/ws/example/config/AppContext-web-service-client-test.xml" });
		PublicWebService webServiceClient = (PublicWebService) context.getBean("webServiceClient");
		List<Person> personList = webServiceClient.findPersons();
		for (Person person : personList) {
			System.out.println("Person = " + person.toString());
		}
		assertNotNull(personList);
	}
}
