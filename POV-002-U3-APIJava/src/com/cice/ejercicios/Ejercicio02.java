package com.cice.ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 02
 * 
 * Este ejercicio consiste en realizar un programa que nos muestre el número de vocales existentes en una cadena de caracteres dada.
 * 
 * Utilizaremos los dos métodos de la clase String vistos anteriormente para extraer cada uno de los caracteres de la cadena, realizándose 
 * la comparación a través de una estructura tipo switch.
 * 
 */

public class Ejercicio02 {
	
	public static void main (String [] args) {
			
			Scanner sc = new Scanner (System.in);
			String a = null;
			char aux;
			int counter = 0;
		
			System.out.print("Introduce una cadena de caracteres: ");
			a = sc.nextLine(); // Si introduzco: Hola, mi nombre es Lorena Roses Soler
			
			for (int i = 0; i < a.length(); i++) {
				aux = a.charAt(i);
				
				switch (aux) {
					case 'A':
					case 'Á':
					case 'a':
					case 'á':
					case 'E':
					case 'É':
					case 'e':
					case 'é':
					case 'I':
					case 'Í':
					case 'i':
					case 'í':
					case 'O':
					case 'Ó':
					case 'o':
					case 'ó':
					case 'U':
					case 'Ú':
					case 'u':
					case 'ú':
						counter++;
				}
			}
			System.out.println("El número de vocales es de: " +counter); //13 vocales
	}
}
