package com.cice.clases;

import java.util.ArrayList;

public class Director extends Empleado {
	
	//Lista de empledos
	private ArrayList<Empleado> esclavos;

	//Constructores
	public Director() {
		//super - Hace referencia al constructor de la clase padre
		//Sirve para inicializar los parámetrosd el padre
		//Si elimino el constructor sin parametros de Empleado, el Director no se creara nunca
		super();
	}
	
	public Director(ArrayList<Empleado> esclavos) {
		//Se deberían inicializar los parámetros de Empleado
		//Si no pongo el super aqui no pasa nada, porque ya lo tengo en el anterior
		super(null,null,null,null);
		this.esclavos = esclavos;
	}


	//Getter y Setter
	public ArrayList<Empleado> getEsclavos() {
		return esclavos;
	}

	public void setEsclavos(ArrayList<Empleado> esclavos) {
		this.esclavos = esclavos;
	}
	
	
	//NOTA:Al hacer extends va a heredar todo de la clase Empleado (todo aquello
	//que no sea privado)
	

	//Si defino como private - no se podrá utilizar en las demas clases
	//Si lo defino como protected si (ver en el Main)
	//Protected se usa para la misma clase, clases heredadas y clases del mismo paquete
	protected boolean soyElMejorDirector() {
		return false;
	}

}
