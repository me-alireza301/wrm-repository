package pe.com.spring.ws.example.auth.service;


import java.util.List;

import javax.jws.WebService;
import javax.jws.WebParam;

import pe.com.spring.ws.example.auth.domain.Employee;

@WebService
public interface AuthService {
	Employee findEmployeeById(@WebParam(name="id") String id);
	List<Employee> findEmployees();

}
