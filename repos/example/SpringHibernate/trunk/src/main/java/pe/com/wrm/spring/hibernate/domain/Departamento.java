package pe.com.wrm.spring.hibernate.domain;

public class Departamento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String descripcion;
	private String estado;

	public Departamento() {
	}

	public Departamento(int id, String estado) {
		this.id = id;
		this.estado = estado;
	}

	public Departamento(int id, String descripcion, String estado) {
		this.id = id;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
