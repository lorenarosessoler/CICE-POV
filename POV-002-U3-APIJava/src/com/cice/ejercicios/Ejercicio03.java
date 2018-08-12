package com.cice.ejercicios;

/**
 * EJERCICIO 03
 *
 * Vamos a realizar un ejercicio en el que, dada una determinada cadena de caracteres, se inserte una barra / adicional entre palabras.
 * 
 * Mediante el método indexOf() se irán buscando las posiciones donde se encuentran los espacios para insertar el espacio adicional, 
 * operación que se realizará a través del método insert().
 * 
 */
public class Ejercicio03 {
	
	public static void main (String [] args) {
		
		//OPCIÓN 1
		String cadena = "Hola soy Lorena Roses";
		System.out.println(cadena.replace(" ", "/"));
		System.out.println("-------------------------------------");

		
		//OPCIÓN 2 - NO FUNCIONA
		StringBuilder cadena2 = new StringBuilder ("Esta opcion no me sale");		
		int posicionEspacio = 0;
		
		for (int i = 0; i < cadena2.length(); i++) {
			posicionEspacio = cadena2.indexOf(" ", i);
			System.out.println("Espacio en la posición: " +posicionEspacio); //4 11 14 17	
		}
		
		if (posicionEspacio >= 0) {
			System.out.println(cadena2.insert(posicionEspacio, "/"));
		}
		
		

		
	

		
		
		
		

	}
}
