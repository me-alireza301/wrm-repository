package pe.com.sgp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements java.io.Serializable {

	private static final long serialVersionUID = 5378581335406346004L;
	private Long pedidoId;
	private Cliente cliente;
	private Date fechaPedido;
	private List<PedidoItem> pedidoItems;

	public Pedido() {
	}

	public Pedido(Cliente cliente, Date fechaPedido) {
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
	}

	public Pedido(Cliente cliente, Date fechaPedido,
			List<PedidoItem> pedidoItems) {
		this.cliente = cliente;
		this.fechaPedido = fechaPedido;
		this.pedidoItems = pedidoItems;
	}

	public Long getPedidoId() {
		return this.pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public List<PedidoItem> getPedidoItems() {
		if (pedidoItems == null) {
			pedidoItems = new ArrayList<PedidoItem>();
		}
		return pedidoItems;
	}

	public void setPedidoItems(List<PedidoItem> pedidoItems) {
		this.pedidoItems = pedidoItems;
	}
}
