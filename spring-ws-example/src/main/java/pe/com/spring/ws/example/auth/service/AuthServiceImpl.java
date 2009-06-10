package pe.com.spring.ws.example.auth.service;

import java.util.List;

import javax.jws.WebService;

import pe.com.spring.ws.example.auth.dao.EmployeeDAO;
import pe.com.spring.ws.example.auth.domain.Employee;

@WebService(endpointInterface = "pe.com.spring.ws.example.auth.service.AuthService")
public class AuthServiceImpl implements AuthService {

	public Employee findEmployeeById(String id) {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.findEmployeeById(id);
	}

	public List<Employee> findEmployees() {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.findEmployees();
	}

}
