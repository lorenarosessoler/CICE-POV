package com.cice.ejercicios;

/*
 * EJERCICIO 04
 * 
 * En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números enteros comprendidos entre dos números 
 * aleatorios generados por el propio programa. Los números aleatorios serán mayores de 0 y menores de 100.
 */

public class Ejercicio04 {
	
	public static void main (String[] args){
		
		//Declaramos los números y la variable suma
		double numA =0, numB =0;				
		double suma =0;	
		
		//Números aleatorios entre 0 y 100
		numA = Math.round(Math.random()*100);		
		numB = Math.round(Math.random()*100);
		//Para el for, buscamos el menor y el mayor
		double elMayor = Math.max(numA, numB);		
		double elMenor = Math.min(numA, numB);				
		for(double i=elMenor; i<elMayor; i++) {						
			System.out.println(i);			
			suma += i;					
		}				
		System.out.println("La suma es : "+suma);	
	}
}
