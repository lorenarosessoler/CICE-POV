package com.cice.clases;

public class Empleado {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private String identificador;
	private String puesto;
	
	//Constructores
	public Empleado() {
		//Si pusieranos super(); haríamos aquí referencia a object
		//va implícito
	}

	public Empleado(String nombre, String apellidos, String identificador, String puesto) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.identificador = identificador;
		this.puesto = puesto;
	}


	//Getters y Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
