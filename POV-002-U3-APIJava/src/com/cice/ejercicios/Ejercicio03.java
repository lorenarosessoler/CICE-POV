package com.cice.ejercicios;

/*
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
		
		StringBuilder texto = new StringBuilder ("Esto es una cadena de caracteres");
		int resultado = 0;

		for (int i = 0; i < texto.length(); i++) {
			resultado = resultado + i;
			//if (texto.charAt(resultado) == texto.indexOf(" ")){
			//}
			

		}

		System.out.println(texto.insert(resultado, "/"));

	}


}
