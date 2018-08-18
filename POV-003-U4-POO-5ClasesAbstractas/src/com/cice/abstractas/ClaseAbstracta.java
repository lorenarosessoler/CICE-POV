package com.cice.abstractas;

public abstract class ClaseAbstracta {
		
	//Clase Abstracta: donde algunos de sus métodos se encuentran sin definir
	//Una clase abstracta puede o no contener métodos abstractos
	//Se suelen utilzar más las interfaces que las clase abstractas

	//Declaración de un método: Tipo de devolución, nombre y número de parámetros de entrada
	//Definición de un método: está declarado pero no se le ha especificado una funcionalidad (no hay nada dentro las llaves)
	//Inicialización de un método: asignas un valor, cuando utilizamos new...
	
	
	//Método definido
	public void metodo() {
		System.out.println("Método definido");
	}
	
	
	//Método abstracto
	//Obligas a cualquier clase que herede de ésta a definir este método
	public abstract String nombreUsusario(Integer id);
	
	public abstract void otroMetodo();
	
}
