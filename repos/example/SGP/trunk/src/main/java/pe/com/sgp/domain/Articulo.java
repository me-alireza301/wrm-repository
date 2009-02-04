package pe.com.sgp.domain;


public class Articulo implements java.io.Serializable {

	private static final long serialVersionUID = 5378581335406346004L;
	private Long articuloId;
	private String descripcion;
	private float precio;
	//private List<PedidoItem> pedidoItems;

	public Articulo() {
	}

	public Articulo(String descripcion, float precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Long getArticuloId() {
		return this.articuloId;
	}

	public void setArticuloId(Long articuloId) {
		this.articuloId = articuloId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/*public List<PedidoItem> getPedidoItems() {
		if (pedidoItems == null) {
			pedidoItems = new ArrayList<PedidoItem>();
		}
		return pedidoItems;
	}

	public void setPedidoItems(List<PedidoItem> pedidoItems) {
		this.pedidoItems = pedidoItems;
	}*/

}
