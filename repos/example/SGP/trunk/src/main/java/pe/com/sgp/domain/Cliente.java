package pe.com.sgp.domain;

import java.util.ArrayList;
import java.util.List;



public class Cliente implements java.io.Serializable {

	private static final long serialVersionUID = 5378581335406346004L;
	private Long clienteId;
	private String razonSocial;
	private String ruc;
	private String telefono;
	private String direccion;
	private String representante;
	private String dni;
	private List<Pedido> pedidos;

	public Cliente() {
	}

	public Cliente(String razonSocial, String ruc, String telefono,
			String direccion, String representante, String dni) {
		this.razonSocial = razonSocial;
		this.ruc = ruc;
		this.telefono = telefono;
		this.direccion = direccion;
		this.representante = representante;
		this.dni = dni;
	}

	public Cliente(String razonSocial, String ruc, String telefono,
			String direccion, String representante, String dni,
			List<Pedido> pedidos) {
		this.razonSocial = razonSocial;
		this.ruc = ruc;
		this.telefono = telefono;
		this.direccion = direccion;
		this.representante = representante;
		this.dni = dni;
		this.pedidos = pedidos;
	}

	public Long getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Pedido> getPedidos() {
		if (pedidos == null) {
			pedidos = new ArrayList<Pedido>();
		}
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
