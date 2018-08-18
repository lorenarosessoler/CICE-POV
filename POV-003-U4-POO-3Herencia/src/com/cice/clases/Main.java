package com.cice.clases;

public class Main {
	
	public static void main (String [] args) {
		
		Presidente florentino = new Presidente();
		
		//La clase presindente podra utilizar todos los métodos de
		//Empleado, Director & Presidente
		florentino.getLameculos();
		florentino.getEsclavos();
		florentino.getIdentificador();
		
		//florentino.soyElMejorDirector();
		//florentino.getLameculos().get(0).soyElMejorDirector();
		
		//Sacará por pantalla el resultado en la Clase Director - false
		Director director = new Director();
		System.out.println(director.soyElMejorDirector());
		
		//Sacará por pantalla el resultado en la Clase Presidente - true
		System.out.println(florentino.soyElMejorDirector());

	}

}
