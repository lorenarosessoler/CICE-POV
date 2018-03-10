package com.cice.ejercicios;

	/*
	 * EJERCICIO 06
	 * 
	 * Vamos a realizar un programa que dado una lista de números existentes en una cadena de caracteres separados por una coma (“,”), 
	 * realice la suma de todos los números contenidos en la misma y muestre el resultado en pantalla.
	 */

	public class Ejercicio06 {
		public static void main (String[] args){
			
			//Cadena de caracteres que contiene una list de números seprados por una coma
			String numeros = "1,2,3,4,5,6,7,8,9";
			
			//resultado
			int resultado = 0;
			
			//Creo un array donde voy a almacenar cada numero
			String [] arrayNumeros = numeros.split(",");
			
			//Recorro el array con un for each y los sumo
			for (String numero : arrayNumeros) {
				int auxiliar = 0;
				auxiliar = Integer.parseInt(numero);
				resultado = resultado + auxiliar; // Esto es igual a resultado += auxiliar
			}
			System.out.println("La suma de todos los números es "+resultado); //Resultado = 45
		}
	}

