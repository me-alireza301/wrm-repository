package pe.com.wrm.spring.hibernate.domain;

class Empleado implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Departamento departamento;
	private String nombre;
	private String apellido;
	private String direccion;
	private String estado;

	public Empleado() {
	}

	public Empleado(int id, String estado) {
		this.id = id;
		this.estado = estado;
	}

	public Empleado(int id, Departamento departamento, String nombre,
			String apellido, String direccion, String estado) {
		this.id = id;
		this.departamento = departamento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.estado = estado;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
