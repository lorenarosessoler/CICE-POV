package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 02
 * 
 * Realizar un programa que dado un determinado número entero almacenado en una variable nos muestre un mensaje en la consola indicando 
 * si el número es par o impar.
 */
public class Ejercicio02 {
	
	static public void main (String[] args){

		//OPCIÓN 1
		
//		int numero = 157;
//      int numeroDivision = numero % 2;
//     
//      if(numeroDivision ==0){
//          System.out.println("El número "+numero+" es par");
//          
//      } else {
//          System.out.println("El número "+numero+" es impar");
//      }
      
		
      //OPCIÓN 2
      System.out.println("Introduce un numero para que pueda decirte si es par o impar: ");
      
      //Utilidad para introducir por teclado
      Scanner sc = new Scanner(System.in);
      int numeroTeclado = sc.nextInt();
      int numeroDivision = numeroTeclado % 2;
      
         if(numeroTeclado ==0){
          System.out.println("El número "+numeroTeclado+" es par");
          
      } else {
          System.out.println("El número "+numeroTeclado+" es impar");
      }
         
  }
	

}
