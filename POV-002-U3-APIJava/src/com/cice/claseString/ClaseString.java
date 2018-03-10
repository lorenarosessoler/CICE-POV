package com.cice.claseString;


public class ClaseString {
	
	public static void main (String [] args) {
		
		//Concatenación --> No es aconsejable utilizar concatenación de String, podría petar la maquina virtual
		String s1 = "Esto es una cadena ";
		s1+= "Esto es otra cadena";
		System.out.println(s1); //Mostrará: Esto es una cadena Esto es otra cadena
		
		
		//.length()
		//Nos devuelve el número de caracteres
		String tamaño = "Mi nombre es Lorena";
		System.out.println(tamaño.length()); //Mostrará 19
		
		
		//.equals(Object cad)
		//Compara una cadena con otra que se le pasa como parámetro, devolviendo true si ambas son iguales
		String tamaño2 = "Mi nombre es Lorena";
		String tamaño3 = "mi nombre es LORENA";
		if (s1.equals(tamaño)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas NO son iguales");
		}
		
		if (tamaño2.equals(tamaño)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas NO son iguales");
		}
		
		//.equalsIgnoreCase(Object cad)
		//Realiza la misma función que el método anterior, solo que en este caso no se hace distinción entre mayúsculas y minúsculas
		if (tamaño3.equalsIgnoreCase(tamaño)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas NO son iguales");
		}
		
		
		//.charAt(int pos)
		//Nos devuelve el char que hay en una posisción suministrada como parámetro
		System.out.println(tamaño.charAt(13)); //Mostrará L
		
		
		//.indexOf(String cadena)
		//Nos devuelve la posición que ocupa dentro de la cadena el texto suministrado como parámetro. Si no lo encuentra devuelve -1
		System.out.println(tamaño.indexOf('L')); //Mostrará 13
		System.out.println(tamaño.indexOf('u')); //Mostrará -1

		//.indexOf (String cadena, int pos)
		//Nos devuelve la posición del char o cadena introducido como primer parámetro, donde el segundo parámetro representa la posición a 
		//partir de la cual comienza la búsqueda. Si no encuentra devuelve -1
		System.out.println(tamaño.indexOf('L', 10)); //Busca la L a partir de la posición 10 -- Mostrará 13
		System.out.println(tamaño.indexOf('L', 14)); //Busca la L a partir de la posición 14 -- Mostrará -1

		
		//.lastIndexOf(String cad)
		//Realiza la misma función que indexOf(), solo que en este caso la búsqueda del texto comienza desde el final de la cadena hacia el principio.
		System.out.println(tamaño.lastIndexOf('M')); 
		System.out.println(tamaño.lastIndexOf('L'));

		//.lastIndexOf(String cad, int pos)
		//Igual que el anterior, indicando mediante el segundo parámetro la posición de comienzo de la búsqueda.
		System.out.println(tamaño.lastIndexOf('n', 4)); 

		
		//.substring(int posicion1, int posicion 2)
		//Nos devuelve un string con el trozo de cadena comprendido entre las posisciones dadas
		System.out.println(tamaño.substring(13, 19)); //Mostrará Lorena

		
		//.split(String separador)
		//Este método devuelve un array formado por las subcadenas que componen la cadena. Como parámetro se debe indicar el separador de subcadena.
		String cadena = "Vamos a separar esta cadena";
		String [] palabras = cadena.split(" ");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
		
		//.replace(char anterior, char nuevo)
		// Este método devuelve una cadena resultante de reemplazar en la cadena original todas las ocurrencias del carácter en el primer parámetro 
		//por el segundo.
		String cad = "Abracadabra";
		System.out.println(cad.replace('a', 'e')); //Mostrará Abrecedebre
		
		//.replaceString (String cad1, Sring cad2) 
		//Sustituir un trozo de cadena por otro
		String mes = "Yo nací en el mes de Octubre";
		System.out.println(mes.replaceAll("Octubre", "Abril")); //Mostrará Abril en lugar de Octubre

		
		//.valueOf(tipo primitivo) - Nos devuelve un String
		//Este método nos introduce el tema de los parseos
		//PARSEOS - Clases de envoltura: clases que representan al tipo primitivo
		int numero = 2345;
		System.out.println(String.valueOf(numero)); // Lo muestra como String
		System.out.println(String.valueOf(numero).length()); //Muestra el tamaño que es 4

		
		//.trim() - Eliminar los espacios en blanco en una cadena de caracteres al inicio y al final
		String espacios = "                    Hola! Que tal?           ";
		System.out.println(espacios.trim()); //Mostrará la cadena sin espacios
	
		
		//.toLowerCase () - Pasa toda la cadena a minúsculas
		String may = "CARCAIXENT VALENCIA ESPAÑA";
		System.out.println(may.toLowerCase());
		
	}

}
