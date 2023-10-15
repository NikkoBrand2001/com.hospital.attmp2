package com.hospital.attmp2;

import java.util.LinkedList;

public class Paciente extends Persona implements Tratamiento{
private LinkedList <String> enfermedades;
private String salud;
private boolean alta;
	public Paciente(String name, String lastName, int identi, String enfermedad,String sld) throws SaludInvalidaException {
		super(name, lastName, identi);
		enfermedades.add(enfermedad);
		if(sld.equalsIgnoreCase("Bien")||sld.equalsIgnoreCase("Mal")||sld.equalsIgnoreCase("Regular")) {
			this.salud = sld;
		}else {
			throw new SaludInvalidaException("salud invalida ", sld);
		}

	}
	public void setSalud(String sld) throws SaludInvalidaException {
		if(sld.equalsIgnoreCase("Bien")||sld.equalsIgnoreCase("Mal")||sld.equalsIgnoreCase("Regular")) {
			this.salud = sld;
		}else {
			throw new SaludInvalidaException("salud invalida ", sld);
		}
	}
	public String getSalud() {
		return salud;
	}
	public void setEnfermedades(String enfermedad) {
		enfermedades.add(enfermedad);
	}
	public LinkedList<String> getEnfermedades() {
		return enfermedades;
	}
    public void setAlta(boolean alt) {
    	this.alta = alt;
    }
    public boolean getAlta() {
    	return alta;
    }
	@Override
	public void realizarTratamiento() {
	System.out.println("el paciente " + super.getNombre()+ " va a realizar su tratamiento \n");
		
	}
	@Override
	public String toString() {
		return "Paciente [enfermedades=" + enfermedades + ", salud=" + salud + ", alta=" + alta + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", identitificacion=" + identitificacion + "]";
	}

}
