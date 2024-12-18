package practica1;

public class Estudiante {
	private String Apellido;
	private String nombre;
	private int comision;
	private String email;
	private String direccion;
	
	public Estudiante(String ap,String n,String d,String e,int com) {
		this.Apellido=ap;
		this.nombre=n;
		this.direccion=d;
		this.email=e;
		this.comision=com;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String Tus_datos() {
		return "Estudiante: " + getNombre() + " " + getApellido() +  " Comision: "
				+ getComision() + " Email: " + getEmail() + " Direccion: " + getDireccion();
	}

}
