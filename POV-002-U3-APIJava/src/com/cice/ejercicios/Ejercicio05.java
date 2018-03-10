package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 05
 * 
 * En este ejercicio crearemos un sencillo programa que solicite al usuario la introducción de dos números y muestre en la consola un 
 * mensaje indicando cual es el mayor y cual el menor de los números suministrados.
 */

public class Ejercicio05 {
	public static void main (String[] args){
		//Atributos
		Scanner sc = new Scanner (System.in);
		int a, b;
		
		System.out.print("Introduce un número a: ");
		a = sc.nextInt();
		System.out.print("Introduce el número b: ");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println("El número a = " +a+ " es mayor que el número b = " +b);
		} else if (b > a){
			System.out.println("El número b = " +b+ " es mayor que el número a = " +a);
		} else if (a == b) {
			System.out.println("El número a = " +a+ " y el número b = " +b+ " son iguales");
		}
	}
}




