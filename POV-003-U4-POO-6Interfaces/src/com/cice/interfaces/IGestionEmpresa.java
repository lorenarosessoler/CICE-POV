package com.cice.interfaces;

public interface IGestionEmpresa extends IControlUsuario {
	
	//Estamos ante una INTERFAZ FUNCIONAL (java 8) ya que:
		//sólo puede tener 1 método abstracto
		//y puede tener muchos métodos por defecto
	
		//Al heredar la interfaz IControlUsuario, sigue siendo funcional? No porque hereda el método abastracto de IControlUsuario
	

	//Método abstracto
	//No se pone abstract porque va implícito
	//No hace falta poner el ámbito
	String getNombre();
		
	//Método por defecto
	default void printNombre() {
		System.out.println("Pintamos un nombre");
	}

}
