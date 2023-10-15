package com.hospital.attmp2;

public class SaludInvalidaException extends Exception {

	private static final long serialVersionUID = -7191259765348125219L;
	private String msg;
	private String salud;

	public SaludInvalidaException(String msg, String salud) {
		this.msg = msg;
		this.salud = salud;
	}

	public String getMsg() {
		return msg;
	}

	public String getSalud() {
		return salud;
	}

	@Override
	public String toString() {
		return "SaludInvalidaException [msg=" + msg + ", salud=" + salud + "]";
	}

}
