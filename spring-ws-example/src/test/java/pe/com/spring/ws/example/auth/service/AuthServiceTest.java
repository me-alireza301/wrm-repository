package pe.com.spring.ws.example.auth.service;

import java.util.List;

import junit.framework.TestCase;
import pe.com.spring.ws.example.auth.domain.Employee;

public class AuthServiceTest extends TestCase {

	AuthService authService = new AuthServiceImpl();

	public void testFindEmployeeById() {
		System.out.println("testFindEmployeeById");
		Employee employee = authService.findEmployeeById("1006");
		System.out.println("employee = " + employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		assertNotNull(employee.getId());
	}

	public void testFindEmployees() {
		System.out.println("testFindEmployees");
		List<Employee> employeeList = authService.findEmployees();
		for (Employee employee : employeeList) {
			System.out.println("employee = " + employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		}
		assertNotNull(employeeList);
	}

}
