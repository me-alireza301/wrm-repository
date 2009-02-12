package pe.com.sgp.dao;

import java.io.Serializable;
import java.util.List;

import pe.com.sgp.domain.PedidoItem;
import pe.com.sgp.util.dao.common.GenericDao;

public interface PedidoItemDAO extends GenericDao{

	public PedidoItem findPedidoItemById(final Serializable id);

	public List<PedidoItem> findPedidoItem();

	public void savePedidoItem(PedidoItem pedidoItem);
	
}
