package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.Cliente;
import pe.com.sgp.util.constants.Constants;
import pe.com.sgp.util.dao.common.GenericDaoHibernate;

public class ClienteDAOImpl extends GenericDaoHibernate implements ClienteDAO{

	
	public Cliente findClienteById(Serializable id) {
		return (id == null ? null : findById(Cliente.class, id));
	}
	
	public List<Cliente> findCliente() {
		return find(Cliente.class, "from Cliente");
	}
	
	public void saveCliente(Cliente cliente) {
		if (cliente == null) {
			throw new RuntimeException(Constants.ERROR_CLIENTE_ID_INVALID);
		}
		super.save(cliente);
	}

}
