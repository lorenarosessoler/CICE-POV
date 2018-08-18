package com.cice.clases;

import com.cice.interfaces.IUsuario;

public class A implements IUsuario {
	
	//Esta es una clase normal que implementa una interfaz
	//Por eso estamos obligados a definir aquí el método no definido de la intefaz
	String a;
	
	@Override
	public void setNombre(String nombre) {
		this.a = nombre;
		System.out.println("El valor de A es " +this.a);
	}

}
