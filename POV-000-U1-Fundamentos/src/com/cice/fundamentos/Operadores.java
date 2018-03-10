package com.cice.fundamentos;

public class Operadores {
	
	public static void main (String[] args) {
		
		//OPERADORES DE COMPARACIÓN
		boolean esMayor = 2 > 4; //false
        boolean esMenor = 4 < 6; //true
	    boolean esIgual = 4 == 5; //false
	    boolean esDistinto = 4 != 5; //true
	        
	    //OPERADORES DE ASIGNACIÓN
	    int numero = 2;
	    int numeroo = 2;
	    int numeroCalcular = 2;
	    //numero ++; //numero +1; numero+=1
	        
	     //Saca por pantalla, luego calcula 
	     System.out.println(numero++);
	     //Calcula y luego saca por pantalla
	     System.out.println(++numero);
	        
	     System.out.println(numeroo++);
	     System.out.println(--numeroo);
	     System.out.println(++numeroo);
	     System.out.println(numeroo-- );
	        
	     numeroCalcular *= 4; //8
	     System.out.println(numeroCalcular);
	        
	     numeroCalcular /= 2; //4
	     System.out.println(numeroCalcular);
	        
	     numeroCalcular %= 3; //1 - el resto de una división
	     System.out.println(numeroCalcular);
	        
	     numeroCalcular <<= 5; // no se usa mucho - binario
	     System.out.println("Desplazamiento = " + numeroCalcular);   
	    }	

}
