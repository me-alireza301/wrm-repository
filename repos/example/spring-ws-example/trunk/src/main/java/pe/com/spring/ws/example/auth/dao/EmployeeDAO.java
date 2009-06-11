package pe.com.spring.ws.example.auth.dao;

import java.util.ArrayList;
import java.util.List;

import pe.com.spring.ws.example.auth.domain.Employee;

public class EmployeeDAO {

	private Employee employee = new Employee();
	private List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeDAO() {
		loadEmployeeData();
	}

	private void loadEmployeeData() {

		employee = new Employee();
		employee.setId("1001");
		employee.setFirstName("LeBron");
		employee.setLastName("James");
		employeeList.add(employee);

		employee = new Employee();
		employee.setId("1002");
		employee.setFirstName("Kobe");
		employee.setLastName("Bryant");
		employeeList.add(employee);

		employee = new Employee();
		employee.setId("1003");
		employee.setFirstName("Dirk");
		employee.setLastName("Nowitzki");
		employeeList.add(employee);

		employee = new Employee();
		employee.setId("1004");
		employee.setFirstName("Steve");
		employee.setLastName("Nash");
		employeeList.add(employee);

		employee = new Employee();
		employee.setId("1005");
		employee.setFirstName("Kevin");
		employee.setLastName("Garnett");
		employeeList.add(employee);

		employee = new Employee();
		employee.setId("1006");
		employee.setFirstName("Tim");
		employee.setLastName("Duncan");
		employeeList.add(employee);

		employee = new Employee();
		employee.setId("1007");
		employee.setFirstName("Allen");
		employee.setLastName("Iverson");
		employeeList.add(employee);

	}

	public Employee findEmployeeById(String id) {
		Employee employeeById = new Employee();
		for (Employee employee : employeeList) {
			if (employee.getId().equals(id)) {
				employeeById = employee;
				break;
			}
		}
		return employeeById;
	}

	public List<Employee> findEmployees() {
		return this.getEmployeeList();
	}

	// getters and setters
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

}
