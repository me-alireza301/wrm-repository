package pe.com.sgp.service;

import java.util.List;

import pe.com.sgp.AbstractUnitTest;
import pe.com.sgp.domain.Cliente;

public class ClienteServiceTest extends AbstractUnitTest {

	protected ClienteService clienteService;

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public void testFindClienteById(){
		Cliente cliente = this.clienteService.findClienteById(new Long(1));
		assertNotNull(cliente);
		/*List<Pedido> list = cliente.getPedidos();
		assertNotNull(list != null && list.size() > 0);*/
	}
	
	public void testFindCliente(){
		List<Cliente> list = this.clienteService.findCliente();
		assertTrue(list != null && list.size() > 0);
	}
	
	public void testSaveCliente(){
		Cliente cliente = new Cliente();
		cliente.setRazonSocial("roberto Software Inc");
		cliente.setRuc("10408696688");
		cliente.setTelefono("3625844");
		cliente.setDireccion("lima");
		cliente.setRepresentante("Adolfo");
		cliente.setDni("11111111");

		this.clienteService.saveCliente(cliente);
		assertNotNull(cliente.getClienteId());
	}
	
}
