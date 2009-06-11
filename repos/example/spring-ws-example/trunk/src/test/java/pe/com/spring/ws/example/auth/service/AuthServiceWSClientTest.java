package pe.com.spring.ws.example.auth.service;

import java.util.List;

import junit.framework.TestCase;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import pe.com.spring.ws.example.auth.domain.Employee;

public class AuthServiceWSClientTest extends TestCase {

	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

	public AuthServiceWSClientTest(){
		factory.getInInterceptors().add(new LoggingInInterceptor());
    	factory.getOutInterceptors().add(new LoggingOutInterceptor());
    	factory.setServiceClass(AuthService.class);
    	factory.setAddress("http://localhost:8080/spring-ws-example/services/swAuth");
	}

	public void testWSClientFindEmployeeById() {
		System.out.println("testWSClientFindEmployeeById");
		AuthService webServiceclient = (AuthService) factory.create();
    	Employee employee = webServiceclient.findEmployeeById("1004");
		System.out.println("employee = " + employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		assertNotNull(employee.getId());
	}

	public void testWSClientFindEmployees() {
		System.out.println("testWSClientFindEmployees");
		AuthService webServiceclient = (AuthService) factory.create();
		List<Employee> employeeList = webServiceclient.findEmployees();
		for (Employee employee : employeeList) {
			System.out.println("employee = " + employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		}
		assertNotNull(employeeList);
	}
}
