package com.cice.clases;

import com.cice.interfaces.IUsuario;

public class B implements IUsuario{
	
	//Esta es una clase normal que implementa una interfaz
	//Por eso estamos obligados a definir aquí el método no definido de la intefaz
	String b;
	
	@Override
	public void setNombre(String nombre) {
		this.b = nombre;
		System.out.println("El valor de B es " +this.b);
	}


}
