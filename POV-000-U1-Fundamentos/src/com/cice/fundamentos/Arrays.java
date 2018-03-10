package com.cice.fundamentos;


public class Arrays {
	
	//Array
	static int [] arrayNumeros = {1,2};
    
	//Método Main
    public static void main (String...args) {                
    		
    		arrayNumeros = new int [] {1,2,3,4,5};
        arrayNumeros [0] = 2;
        arrayNumeros [1] = 4;
        
        //PREGUNTA EXAMEN
        //Compila? Sí, pero se prefiere lo anterior
        int nombreArray[] = {1,2,3};

        
        //ARRAYS BIDIMENSIONALES
        // Piensa en posiciones, la primera caja tienes 2 posiciones y la segunda cajita 4 posiciones
        int[][] bidi = new int [2][4];
        /*
            [ [1,1,1,1] , [1,1,1,1] ]
        */
        
        int[][][] tri = new int [2][4][8];
        /*
            [ [ [8,8,8,8,8,8,8,8] , [] ,[] , [] ] , [] ]
        */
         
        //int el tipo de datos y bi el nombre
        //podemos definir el tamaño luego
        //array de arrays
        int [] bi[] = new int[2][3];
        
        bi [0] = new int [3];
        bi [1] = new int [3];
        
        bi [0] = new int [] {1,2};
        bi [1] = new int [] {1,2,3,4};
        System.out.println("----------");
        for (int[] is : bi){
            for (int i : is){
                System.out.println(i);
                
            }
        }
    }
}
