package com.cice.ejercicio1;

import java.util.Scanner;

/**
 * EJERCICIO 01
 * 
 * Desarrollar un programa que nos permita realizar cálculos geométricos (área y perímetro) sobre círculos.
 * 
 * El programa recibirá como argumento de la línea de comandos el radio de un círculo y nos mostrará en pantalla 
 * el área y perímetro de la figura.
 * 
 * Vamos a dividir el programa en dos clases; por un lado tendremos la clase Círculo que definirá las operaciones 
 * sobre un círculo y por otro lado tendremos una clase a la que llamaremos Cliente que se encargará de recuperar
 * el radio, crear el objeto Circulo y llamar a los métodos del mismo, así como presentar los resultados en pantalla.
 */

public class Cliente {
	
	public static void main(String[] args) {
		
		//Objeto clase Círculo
		Circulo c = new Circulo ();
		
		
		//Variables locales
		Scanner sc = new Scanner (System.in);
        int opcion = 0;
        int radio = 0;

        
        //Menu
        do {
        		System.out.println ("==================================");
            System.out.println ("CALCULOS GEOMETRICOS DE UN CIRCULO");
            System.out.println ("==================================");
            System.out.println ("1. Calcula el area de un circulo");
            System.out.println ("2. Calcula el perimetro de un circulo");
            System.out.println ("0. Salir"); 
            System.out.print ("Seleccione la opcion que desea realizar: ");
            opcion = sc.nextInt();
              
            switch (opcion){
            		case 1:
            			System.out.print ("Introduce el radio de un circulo: ");
            			radio = sc.nextInt();
            			c.areaCirculo(radio);
            			System.out.println ("EL AREA DEL CIRCULO ES: " +c.getArea());
            			System.out.println ("");
            			break;
                 
            		case 2:
            			System.out.print ("Introduce el radio de un circulo: ");
            			radio = sc.nextInt();
            			c.perimetroCirculo(radio);
            			System.out.println ("EL PERIMETRO DEL CIRCULO ES: " +c.getPerimetro());
            			System.out.println ("");
            			break;
            }
                      
         } while (opcion != 0);
          
         System.out.print ("HASTA PRONTO!");
    }
  
}
