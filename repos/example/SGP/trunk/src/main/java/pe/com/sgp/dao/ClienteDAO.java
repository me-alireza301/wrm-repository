package pe.com.sgp.dao;

import pe.com.sgp.domain.Cliente;
import pe.com.sgp.util.dao.common.GenericDao;

public interface ClienteDAO extends GenericDao{
	
	public void saveCliente(Cliente cliente);
	
}
