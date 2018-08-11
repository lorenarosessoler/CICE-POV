package com.cice.ejercicios;

/**
 * EJERCICIO 06
 * 
 * Realizar un programa que, dado un determinado array de números enteros, realice el recorrido de éste y muestre cada uno de estos 
 * números hasta que se encuentre un número negativo, momento en el cual se finalizará el recorrido del array y se indicará el total 
 * de números recuperados.
 * 
 * Para realizar este recorrido utilizaremos una instrucción while en vez de for, ya que se desconoce el número de iteraciones 
 * que debemos realizar.
 */

public class Ejercicio06 {

	public static void main (String[] args){
		
		int [] arrayNumeros = {1, 2, 3, 4, 5, -2, 1, 2};
		int resultado = 0;
		
		System.out.println("Los números positivos del array son: ");
		for (int numero : arrayNumeros) {
			
			while (numero >= 0) {
				System.out.println(numero);			
				resultado = resultado + numero;
				break;
				// Debe parar al encontrar el número negativo --> TO CHECK IT
			}
		}
		System.out.println("La suma de todos los números positivos del array es: " +resultado);
	}
}
