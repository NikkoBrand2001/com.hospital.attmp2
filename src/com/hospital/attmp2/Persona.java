package com.hospital.attmp2;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected int identitificacion;

	public Persona(String name, String lastName, int identi) {
		this.nombre = name;
		this.apellido = lastName;
		this.identitificacion = identi;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String lastName) {
		this.apellido = lastName;
	}

	public String getApellido() {
		return apellido;
	}

	public void setIdentificacion(int ident) {
		this.identitificacion = ident;
	}

	public Integer getIdentificacion() {
		return identitificacion;
	}

}
