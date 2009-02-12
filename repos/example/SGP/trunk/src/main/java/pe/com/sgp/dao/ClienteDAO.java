package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.Cliente;
import pe.com.sgp.util.dao.common.GenericDao;

public interface ClienteDAO extends GenericDao{
	
	public Cliente findClienteById(final Serializable id);
	
	public List<Cliente> findCliente();
	
	public void saveCliente(Cliente cliente);
	
}
