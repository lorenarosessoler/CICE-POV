package com.cice.colecciones;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Diccionario {
	
	public static void main (String [] args) {
		Hashtable <Integer, String> diccionario = new Hashtable<>();
		
		//Dos claves con el mismo valor, se sobreescribe
		diccionario.put(10, "JAMES RODRIGUEZ");
		diccionario.put(3, "GERARD PIQUE");
		diccionario.put(69, "RENE HIGUITA");
		diccionario.put(7, "RAUL GONZALEZ");
		diccionario.put(10, "LEO MESSI");
		diccionario.put(69, "RENE HIGUITA");
		diccionario.put(23, "MICHAEL JORDAN");
		diccionario.put(32, "MAGIC JOHNSON");
		
		//Nos devuelve una enumeracion
		Enumeration<Integer> claves = diccionario.keys();
		
		while (claves.hasMoreElements()) {
			Integer clave = claves.nextElement();
			System.out.println(diccionario.get(clave));

		}
		for (Integer string : diccionario.keySet()) {
			//En pantalla, nunca sale en orden
			System.out.println(string);
		}
		
		Collection<String> values = diccionario.values();
		
		for (Iterator iterator = values.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
		}

		//Esto compila pero es un bucle infinito - EXAMEN
		//for (;;) {
		
		
			
		}

}
