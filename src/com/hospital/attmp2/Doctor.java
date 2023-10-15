package com.hospital.attmp2;

import java.util.Collections;
import java.util.LinkedList;

public class Doctor extends Persona {
	LinkedList<String> especialidades;
	LinkedList<Paciente> cantPacientes;

	public Doctor(String name, String lastName, int identi, String esp) {
		super(name, lastName, identi);
		especialidades.add(esp);

	}

	public void setEspecialidades(String esp) {
		especialidades.add(esp);
	}

	public LinkedList<String> getEspecialidades() {
		return especialidades;
	}

	public void setCantPacientes(Paciente nvoP) {
		for (Paciente paciente : cantPacientes) {
			if (!paciente.getIdentificacion().equals(nvoP.getIdentificacion())) {
				cantPacientes.add(nvoP);
			} else {
				System.out.println("el paciente ya esta registrado \n");
			}
		}
	}

	public LinkedList<Paciente> getCantPacientes() {
		return cantPacientes;
	}

	public void BuscaPaciente(Integer id) {
		for (Paciente paciente : cantPacientes) {
			if (paciente.getIdentificacion().equals(id)) {
				System.out.println("\n " + paciente + "\n");
			}
		}
	}

	public void ShowOrder() {
		System.out.println("lista de pacientes del doctor " + super.getNombre() + " " + super.getApellido() + " sin ordenar \n");

		cantPacientes.forEach(e -> System.out.println(e));

		Collections.sort(cantPacientes, (paciente1, paciente2) -> paciente1.getSalud().compareTo(paciente2.getSalud()));

		System.out.println("lista de pacientes del doctor " + super.getNombre() + " " + super.getApellido() + " sin ordenar \n");

		cantPacientes.forEach(e -> System.out.println(e));
	}

	public void buscarPaciente(int pacienteId) {
		for (Paciente paciente : cantPacientes) {
			if (paciente.equals(paciente)) {
				System.out.println( paciente + " asignado al doctor " + this.nombre+ " " + this.apellido+ " \n");
			}
		}
	}
public void borrarPaciente(int pacientId) {
	for (Paciente paciente : cantPacientes) {
		if (paciente.getIdentificacion().equals(pacientId)) {
			cantPacientes.remove(paciente);
		}
	}
}

public void darAltaPaciente(int pacientId) {
	for (Paciente paciente : cantPacientes) {
		if (paciente.getIdentificacion().equals(pacientId)) {
			paciente.setAlta(true);
		}
	}
}

public void calcularPromedioAlta() {
int count =0 ;
int total;
for (Paciente paciente : cantPacientes) {
	if(paciente.getAlta()) {
		count ++;
	}
}
total = cantPacientes.size()/count;


System.out.println("el porcentaje total de pacientes " + total + "%\n");
}
	@Override
	public String toString() {
		return "Doctor [especialidades=" + especialidades + ", cantPacientes=" + cantPacientes + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", identitificacion=" + identitificacion + ", getEspecialidades()="
				+ getEspecialidades() + ", getCantPacientes()=" + getCantPacientes() + "]";
	}

}
