package com.cice.ejercicios;

import java.util.Scanner;

/**
 * EJERCICIO 04
 * 
 * Realizar un programa que calcule el factorial de un número existente en una determinada variable entera.
 * 
 * El factorial de un número es el resultado de multiplicar entre sí todos los números naturales menores comprendidos entre 1 y el número 
 * en cuestión.
 * 
 * Por ejemplo: A este número, 6! = 1*2*3*4*5*6
 */
public class Ejercicio04 {
	
    static public void main (String[] args){
        System.out.println("Factorial de un número");
        
        //Introducir el número por el teclado
        Scanner sc = new Scanner (System.in);
        int numeroSolicitado;
        long factorial = 1;
        
        System.out.println("Por favor introduce un número para calcular su factorial:");
        numeroSolicitado = sc.nextInt();
        
         for (int i = 1; i <= numeroSolicitado; i++){
            factorial = factorial*i;  //igual a factorial *= i; 
        }
        System.out.println("El factorial del número " +numeroSolicitado+ " es igual a: " +factorial);
    }

}
