package com.hospital.attmp2;

import java.util.HashMap;

public class GestorHospital {
private HashMap<Integer, Paciente> dirPacient;
protected Doctor doc;
protected Paciente paciente;
public void addPacient(Paciente p) {
	dirPacient.put(paciente.getIdentificacion(), p);
}
public void doctorIn(String name, String lastName, int id, String especialidades) {
    doc = new Doctor(name,lastName, id, especialidades);
}
public void asignarPaciente(int idPacient) {
	paciente = dirPacient.get(idPacient);
	doc.setCantPacientes(paciente);
}
public void buscarPaciente(int pacientId) {
	if(dirPacient.containsKey(pacientId)) {
		paciente = dirPacient.get(pacientId);
		System.out.println("informacion " + paciente + " esta a la espera de ser asinado \n");
	}else {
		doc.BuscaPaciente(pacientId);
	}
}
public void BorrarPaciente(int pacientId) {
	if(dirPacient.containsKey(pacientId)) {
		dirPacient.remove(pacientId);
	}else {
		doc.borrarPaciente(pacientId);
	}
}

}