package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.Pedido;
import pe.com.sgp.util.dao.common.GenericDao;

public interface PedidoDAO extends GenericDao{
	
	public Pedido findPedidoById(final Serializable id);

	public List<Pedido> findPedido();

	public void savePedido(Pedido pedido);

}
