package pe.com.spring.ws.example.auth.dao;


import java.util.List;

import junit.framework.TestCase;
import pe.com.spring.ws.example.auth.domain.Employee;

public class EmployeeDAOTest extends TestCase {

	EmployeeDAO dao = new EmployeeDAO();

	public void testFindEmployeeById() {
		System.out.println("testFindEmployeeById");
		Employee employee = dao.findEmployeeById("1006");
		System.out.println("employee = " + employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		assertNotNull(employee.getId());
	}

	public void testFindEmployees() {
		System.out.println("testFindEmployees");
		List<Employee> employeeList = dao.findEmployees();
		for (Employee employee : employeeList) {
			System.out.println("employee = " + employee.getId() + " " + employee.getFirstName() + " " + employee.getLastName());
		}
		assertNotNull(employeeList);
	}

}
