package com.cice.modelo;

/*
 * Modelo de Datos de Contacto
 */

public class Contacto {
	
	//Definir las variables de Contacto
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;		
	
	//Constructor sin parámetros
	public Contacto() {
			
	}
		
	//Constructor con parámetros
	public Contacto(String nombre, String primerApellido, String segundoApellido, String dni) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
	}



	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreCompleto) {
		this.nombre = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Override
	public String toString() {
		String respuesta = (nombre+ " " +primerApellido+ " " +segundoApellido);
		return respuesta;
	}
}
