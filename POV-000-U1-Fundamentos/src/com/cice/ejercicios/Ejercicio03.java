package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 03
 * 
 * Realizar un programa que a partir de un número almacenado en una determinada variable entera, que representará la hora del día 
 * y por tanto estará comprendida entre 1 y 24, nos de los buenos días, las buenas tardes o las buenas noches.
 * 
 * El programa deberá ser capaz de comprobar si el número está realmente comprendido entre ese rango pues, en caso contrario, 
 * nos mostrará un mensaje de error
 */
public class Ejercicio03 {
	
	static public void main (String[] args){
		
        System.out.print("¿Qué hora es? (Introduce solo dos digitos)");
        Scanner sc = new Scanner(System.in);
        int horaIntroducida = sc.nextInt();
        
        if (horaIntroducida >= 6 && horaIntroducida < 12){
            System.out.println("Son las "+horaIntroducida+" - Buenos dias");
        } else if (horaIntroducida >= 12 && horaIntroducida < 20) {
            System.out.println("Son las "+horaIntroducida+" - Buenos tardes");
        } else if (horaIntroducida >= 20 && horaIntroducida < 24){
            System.out.println("Son las "+horaIntroducida+" - Buenos noches");
        } else {
            System.out.println("Ha introducido una hora incorrecta");
        }
    
    
//        switch (horaIntroducida){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//              System.out.println ("Buenas Noches");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//            case 11:
//            case 12:
//                System.out.println ("Buenas Días");
//                break;
//            case 13:
//            case 14:
//            case 15:
//            case 16:
//            case 17:
//            case 18:
//            case 19:
//            case 20:
//                System.out.println ("Buenas Tardes");
//                break;
//            case 21:
//            case 22:
//            case 23:
//            case 24:
//                System.out.println ("Buenas Noches");
//                break;
//            default:
//                System.out.println ("No has introducida una hora válida");
//        }
        
    }   

}
