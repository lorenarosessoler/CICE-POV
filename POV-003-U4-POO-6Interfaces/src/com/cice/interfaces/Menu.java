package com.cice.interfaces;

//Para clases que utilicen interfaces se utiliza la palabra "implements"
//Podemos implementar más de una interfaz
//Se puede implementar y extender a la vez
public class Menu implements IGestionEmpresa {

	//En esta clase sólo me obliga a definir el método abstracto
	@Override
	public String getNombre() {
		return null;
	}
	
	//Para la clase Menu, los métodospor defecto estan ya definidos, para usarlos sólo necesitamos llamarlos
	//El método por defecto lo podemos reescribir, no tenemos porque utilizar lo definido por defecto
	@Override
	public void printNombre() {
		System.out.println("ya no pinto el nombre sino otra cosa");
	}

	@Override
	public void setNombre() {		
	}	
	
	
	

}
