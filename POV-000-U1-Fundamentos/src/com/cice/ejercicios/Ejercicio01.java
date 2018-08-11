package com.cice.ejercicios;

/**
 * EJERCICIO 01
 * 
 * Dado un número definido en el interior de una variable, se muestre en la pantalla el cuadrado de dicho número.
 */
public class Ejercicio01 {
	
	static public void main (String [] args) {
		int numero = 2;
		int cuadrado = numero * numero;
		System.out.println("El cuadrado del numero " +numero+ " es igual a " +cuadrado);
        
		//Con la clase Math de Java
		System.out.println (Math.pow(numero, 2));

	}

}
