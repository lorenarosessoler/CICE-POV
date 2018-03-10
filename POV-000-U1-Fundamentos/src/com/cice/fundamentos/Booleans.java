package com.cice.fundamentos;

public class Booleans {
	static public void main (String[] args){
        
		boolean esCierto = true;
        boolean esFalso = false;
       
        if (esCierto || esFalso){
            System.out.println ("Es Cierto");
        } else {
            System.out.println ("Es Falso");   
        }
        
        
        boolean test = !(2 == 2);     
      
        if (test){
            System.out.println ("Es Cierto");
        } else {
            System.out.println ("Es Falso");   
        }
    }

}
