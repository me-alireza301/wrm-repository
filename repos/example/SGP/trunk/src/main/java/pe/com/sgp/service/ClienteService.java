package pe.com.sgp.service;

import java.util.List;

import pe.com.sgp.domain.Cliente;
import pe.com.sgp.util.service.common.GenericService;

public interface ClienteService extends GenericService{

	public Cliente findClienteById(Long clienteId);
	
	public List<Cliente> findCliente();
	
	public void saveCliente(Cliente cliente);
	
}
