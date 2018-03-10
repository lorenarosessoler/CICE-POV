package com.cice.claseString;

public class ClaseStringBuilder {

	public static void main (String [] args) {
		
		//Es necesario que se defina como un objeto
		StringBuilder modificable = new StringBuilder ("Esta cadena es modificable");
		
		
		//.append (String s)
		//Añade la final de la cadena el texto suministrado como parámetro. Además de este metodo, existe una versión del mismo para cada tipo primitivo Java
		StringBuilder texto = new StringBuilder ("El número es ");
		int numero = 1234;
		System.out.println(texto.append(numero));
		
		
		//.toString() 
		//Nos permite recuperar el texto como un String
		System.out.println(texto.toString());

		
		//.delete(int pos1, int pos2)
		//Elimina el trozo de cadena comprendida entre las posiciones
		System.out.println(modificable.delete(15, 26)); // elimina la palabra "modificable"

		
		//.insert(int pos, String texto)
		//Inserta en la cadena, en la posición indicada por la variable pos, el texto suministrado como segundo parámetro
		System.out.println(modificable.insert(15, "se puede modificar")); // añade esta nueva cadena en la posición 15

		
		//.replace(int pos1, int pos2, String nuevaCadena)
		//Reemplaza los caracteres comprendidos entre las posiciones pos1 (incluida) y pos2 (no incluida) por la cadena que se suministra como tercer parametro
		System.out.println(texto.replace(13, 26, "56789"));
		
		//.length(). 
		//Devuelve el número de caracteres contenidos en la cadena
		System.out.println(modificable.length());
		
		
		//.indexOf(String texto). 
		//Como en el caso de String, devuelve la posición del texto dentro de la cadena
		System.out.println(texto.indexOf("es")); // Mostrará 10

		
		//indexOf(String texto, int pos)
		//Igual que el anterior pero comenzando la busqueda a partir de la posición indicada en pos
		System.out.println(texto.indexOf("ú", 1)); // Mostrará 4

		
	}


}
