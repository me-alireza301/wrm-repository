package pe.com.sgp.domain;

public class PedidoItem implements java.io.Serializable {

	private static final long serialVersionUID = 5378581335406346004L;
	private Long pedidoItemId;
	private Articulo articulo;
	private Pedido pedido;
	private float cantidad;
	private float precio;

	public PedidoItem() {
	}

	public PedidoItem(Articulo articulo, Pedido pedido, float cantidad,
			float precio) {
		this.articulo = articulo;
		this.pedido = pedido;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Long getPedidoItemId() {
		return this.pedidoItemId;
	}

	public void setPedidoItemId(Long pedidoItemId) {
		this.pedidoItemId = pedidoItemId;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public float getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
