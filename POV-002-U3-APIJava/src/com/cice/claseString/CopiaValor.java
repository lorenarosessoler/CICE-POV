package com.cice.claseString;

import java.util.ArrayList;

public class CopiaValor {

	public static void main(String[] args) {
		
		//Ejmeplo de Copia-Valor
		int a = 2;
		int b = a;
		
		//Al cambiar el valor de a, b sera por lógica el primer valor de a
		a = 3;
		
		System.out.println(a);
		System.out.println(b);

		
		
		//Ejemplo de Referencia-Valor
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("cadena 1");
		ArrayList<String> lista2 = lista;
		lista.add("cadena 2");
		
		for (String cadena : lista) {
			System.out.println(cadena);
		}

		for (String cadena : lista2) {
			System.out.println(cadena);
		}
		
		System.out.println("=======");

		System.out.println(lista);
		System.out.println(lista2);
		
		Empleado emp = new Empleado ();
		emp.setNombre ("pepe");
		Empleado emp2 = emp;
		
		emp.setNombre ("pepito");

		System.out.println(emp.getNombre());
		System.out.println(emp2.getNombre());	
	}
}

	class Empleado {
		private String nombre;
		
		public String getNombre () {
			return nombre;
		}
		
		public  void setNombre (String nombre) {
			this.nombre = nombre;
		}
	}

