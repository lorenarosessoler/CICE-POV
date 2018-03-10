package com.cice.precios;

import java.util.ArrayList;
import java.util.Scanner;

public class Precios {
	
	//Atributos para los valores a introducir
	Scanner sc = new Scanner (System.in);
	int opcion = 0;

	//Para colecciones de tipo referencia valor utilizamos el ArrayList
	//ArrayList donde se almacenarán los precios
	private ArrayList <Double> precios = new ArrayList<Double>();

	
	//Método mostrar menú
	public void mostrarMenu() {		
			
		do {
			System.out.println("======================");
			System.out.println("MENÚ PRECIOS");
			System.out.println("======================");
			System.out.println("1 - Nuevo precio");
			System.out.println("2 - Precio medio");				
			System.out.println("3 - Precio máximo");
			System.out.println("4 - Precio Mínimo");
			System.out.println("5 - Mostrar todos los precios");
			System.out.println("0 - Salir");
			System.out.println("======================");
			System.out.print("Seleccione una de las opciones anteriores: ");
			opcion = sc.nextInt();	
			
			controles(opcion);
			
		} while (opcion != 0);
			
	}
	
	
	//Método controles del menú
	private void controles (int opcion) {
		switch (opcion) {
			case 0:
				System.out.println("Hasta la próxima!");
				break;
			case 1:
				nuevoPrecio();
				break;
			case 2:
				precioMedio();
				break;
			case 3:
				precioMaximo();
				break;
			case 4:
				precioMinimo();
				break;
			case 5:
				mostrarPrecios();
				break;				
			default:
				System.out.println("La opción seleccionada no es válida, por favor elija otra opción.");
				break;
		}
	}
	
	
	//Método - nuevo precio
	private void nuevoPrecio() {
		//Añade el precio introducido por usuario y lo añade al array
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un nuevo precio ");
		precios.add(sc.nextDouble());
	}
	
	
	//Método - precio medio
	private void precioMedio() {
		double preciosSumados = 0;
		for (Double precio : precios) {
			preciosSumados += precio; //preciosSumados = preciosSumados + precio;
		}
		System.out.println("El precio medio es: " +preciosSumados / +precios.size());
	}
	
	
	//Método - mostrar precios
	private void mostrarPrecios (){
		for (Double precio: precios) {
			System.out.println("Precio: " +precio);
		}
	}

	
	//Método - precio máximo
	private void precioMaximo () {
		double precioMaximo = 0;
		for (Double precio: precios) {
			precioMaximo = Math.max(precioMaximo, precio);
		}
		System.out.println("El precio máximo es : " +precioMaximo);
	}
	
	
	//Método - precio mínimo
	private void precioMinimo () {
		//preciMinimo no puede inicializarlo a 0, recuperamos el primero de ellos, el que está en la posición 0
		double precioMinimo = precios.get(0);
		for (Double precio: precios) {
			precioMinimo = Math.min(precioMinimo, precio);
		}
		System.out.println("El precio mínimo es : " +precioMinimo);
	}
}
