package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 01
 * 
 * En este ejercicio vamos a crear un programa que de todas las cadenas de caracteres suministradas desde la línea de comandos 
 * al iniciar la ejecución del programa (recordemos que cada cadena se separa de la siguiente por un espacio), nos muestre la cadena 
 * de mayor longitud.
 * 
 */

public class Ejercicio01 {
	
	public static void main (String [] args) {
		
		//Atributos
		Scanner sc = new Scanner (System.in);
		String a = null;
		String b = null;
		String c = null;
		
		
		System.out.print("Introduce la primera cadena de caracteres: ");
		a = sc.nextLine();
		System.out.print("Introduce la segunda cadena de caracteres: ");
		b = sc.nextLine();
		System.out.print("Introduce la tercera cadena de caracteres: ");
		c = sc.nextLine();
		
		if ((a.length() > b.length()) && (a.length() > c.length())) {
			System.out.print("La cadena de caracteres más larga es: " +a);
		} else if ( (b.length() > a.length()) && (b.length() > c.length())) {
			System.out.print("La cadena de caracteres más larga es: " +b);
		} else if ( (c.length() > a.length()) && (c.length() > b.length())) {
			System.out.print("La cadena de caracteres más larga es: " +c);
		}
	}


}
