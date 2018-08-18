package com.cice.abstractas;

public class Subclase extends ClaseAbstracta {
	
	//Si hago herencia de una clase abstracta debo definir la subclase como abstracta o DEFINIR el o los métodos no definidos
	@Override
	public String nombreUsusario(Integer id) {
		return null;
	}
	
	//Si creamos otro método no definido en la clase abstracta, tenemo la obligción de definirlo aquí
	@Override
	public void otroMetodo() {
		System.out.println("definido");
	}

	
}
