package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.Pedido;
import pe.com.sgp.util.dao.common.GenericDaoHibernate;

public class PedidoDAOImpl extends GenericDaoHibernate implements PedidoDAO{

	public Pedido findPedidoById(Serializable id) {
		return null;
	}
	
	public List<Pedido> findPedido() {
		return null;
	}

	public void savePedido(Pedido pedido) {
		
	}

}
