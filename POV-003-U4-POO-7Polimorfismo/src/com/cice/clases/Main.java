package com.cice.clases;


import java.util.List;

import com.cice.interfaces.IUsuario;

public class Main {
	
	public static void main (String [] args) {
		A a = new A();
		a.setNombre("aminuscula");
		
		B b = new B();
		b.setNombre("bminuscula");
		
		//Error - no son iguales aunque su funcionalidad sea idéntica
		//a es de tipo A y b es de tipo B así que no se pueden igualar.
		//a = b;
		
		//Aquí NO daría error porque las dos son del mismo tipo, tienen el IUsuario en común
		//IUsuario c = a;
		//c = b;
		
		//Error - un hijo no puede contener a un padre
		//C c = (C) a;
		
		//Esto si se puede - un padre puede contener un hijo
		//a tiene la misma estructura que C
		//a = new C();
		
		
		//Implementación hace como la herencia, la interfaz es como un contenedor
		//Todos han implementado a la interfaz, de un modo u otro
		//C es hijo de A
		C cc = new C();
		IUsuario iu = cc;
		//Ahora aquí mostraría por pantalla A = nombre
		iu.setNombre("nombre");
		//Ahora aquí mostraría por pantalla B = otro nombre
		iu = b;
		iu.setNombre("otro nombre");	
	}


}
