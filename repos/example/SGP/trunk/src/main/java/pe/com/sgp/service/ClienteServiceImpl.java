package pe.com.sgp.service;

import pe.com.sgp.dao.ClienteDAO;
import pe.com.sgp.domain.Cliente;
import pe.com.sgp.util.service.common.GenericServiceImpl;

public class ClienteServiceImpl extends GenericServiceImpl implements ClienteService {

	private ClienteDAO clienteDAO;
	
	public void saveCliente(Cliente cliente) {
		clienteDAO.saveCliente(cliente);
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

}
