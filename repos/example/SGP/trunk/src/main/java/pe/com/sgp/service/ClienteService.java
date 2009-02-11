package pe.com.sgp.service;

import pe.com.sgp.domain.Cliente;
import pe.com.sgp.util.service.common.GenericService;

public interface ClienteService extends GenericService{

	public void saveCliente(Cliente cliente);
	
}
