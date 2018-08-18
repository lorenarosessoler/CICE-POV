package com.cice.main;

import com.cice.logica.Agenda;

/**
 * EJERCICIO 08
 * 
 * Como ejemplo practico de uso de colecciones basadas en claves, vamos a realizar un programa que permita realizar la gestión de un lista de contactos. 
 * Cada contacto esta caracterizado por un nombre de persona (valor) con un DNI (clave) que lo identifica y que será de tipo numérico, pudiéndose 
 * localizar los contactos a partir de ese campo clave.
 * 
 * Al iniciar el programa se mostrara el siguiente menú de opciones:
 * 	1. Añadir contacto
 * 	2. Eliminar contacto
 * 	3. Mostar contactos
 * 	4. Salir
 * 
 * Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así hasta que elija “salir”.
 */

public class Main {
	
	public static void main (String [] args) {
		
		//Objeto de la clase Agenda
		Agenda agenda = new Agenda();
		
		//LLamada al método mostrarMenu de la clase Agenda
		agenda.mostrarMenu();
		
	}

}
