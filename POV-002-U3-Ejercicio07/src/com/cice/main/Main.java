package com.cice.main;

import com.cice.precios.Precios;

/**
 * EJERCICIO 07:
 * Como ejemplo de utilización de colecciones basadas en índices vamos a desarrollar un programa que nos permita registrar una serie de precios de 
 * productos en una colección, ofreciéndonos además la posibilidad de obtener unos datos estadísticos sobre los mismos.
 * 
 * Al iniciarse el programa se presentara al usuario en un menú como el que se indica a continuación:
 * 	1. Nuevo precio
 * 	2. Precio medio
 * 	3. Precio máximo
 * 	4. Precio mínimo
 * 	5. Mostrar todos los precios
 * 	0. Salir
 * 
 * Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así hasta que elija ”salir”
 * 
 * Con la opción 1 se le pedirá al usuario que introduzca el precio que quiere almacenar, mientras que las demás opciones mostraran los datos solicitados. 
 * Como veremos a continuación en el listado de código, en vez de incluir todo el código en el interior del método main() se realizara la gestión de cada 
 * una de las opciones en métodos independientes para facilitar la claridad del código y hacerlo mas estructurado.
 *
 */

public class Main {
	
	public static void main (String[] args){
		
		//Objecto de la clase Precios
		Precios Precios = new Precios();
		
		//Sólo llamamos al método mostrar menú
		Precios.mostrarMenu();
	
	}
	
}
