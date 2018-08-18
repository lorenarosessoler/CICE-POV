package com.cice.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class Conjunto {
	
	public static void main (String [] args) {
		
		//No sale ordenado
		HashSet<String> conjunto = new HashSet();
		conjunto.add("Lorena");
		conjunto.add("Elena");
		conjunto.add("Maria");
		conjunto.add("Loles");
		conjunto.add("Bego");
		conjunto.add("Paula");
		conjunto.add("Rosa");
		
		//Lambda
		//conjunto.forEach(k-> System.out.println(k));
		
		//Iterator
		for (Iterator<String> iterator = conjunto.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
	}


}
