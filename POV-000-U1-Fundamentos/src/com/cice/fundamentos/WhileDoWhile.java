package com.cice.fundamentos;

public class WhileDoWhile {
	public static void main (String[] args){
        
        //Ejemplo de Bucle infinito
        //while(true)
        
        //WHILE
        int [] numeros;
        numeros = new int[] {1,2,3,4,5};
        int condicion = 3;
        
        while(numeros[4] > condicion){
            //Saca por pantalla 3 y 4
            //mientras 5>3 --> saca por pantalla 3 y luego suma 1
            //mientras 5>4(condicion +1) --> saca por pantalla 4 y luego suma 1
            //mientras 5>5 --> termina
           System.out.println(condicion++);
        }
        
        System.out.println("--------------------");
        
        
        //DOWHILE
        //Aqui condicion es igual a 5
        //Saca por pantalla 5 y luego suma 1
        //5>5 --> no --> termina
        do{
            System.out.println(condicion++);
        }while(numeros[4] > condicion);

    }

}
