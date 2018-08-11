package com.cice.ejercicios;

/**
 * EJERCICIO 05
 * 
 * Realizar un programa que, dado un array de números enteros, calcule la suma de todos los números contenidos en el mismo y 
 * la muestre por pantalla.
 * 
 * Se empleará una instrucción foreach para realizar el recorrido del array.
 */

public class Ejercicio05 {
	 
	public static void main (String[] args){
		
		//Creamos el array y la variable que almacenará el resultado
		int [] arrayNumeros = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int resultado = 0;
		
		//Recorro el array y hago la suma
		for (int numero : arrayNumeros) {
			System.out.println(numero);
			resultado = resultado + numero;
		}
		System.out.println("La suma de todos los números contenidos en el array es igual a " +resultado);
	}
}
