package com.cice.logica;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import com.cice.modelo.Contacto;

public class Agenda {

	//Para colecciones de tipo CLAVE-VALOR utilizamos el Hashtable
	private Hashtable <Integer, String> agenda = new Hashtable();

	
	//Método - mostrar menú
	public void mostrarMenu() {
		
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================================");
		System.out.println("LISTA DE CONTACTOS");
		System.out.println("============================================");
		
		do {
			
			System.out.println("1 - Añadir contacto");
			System.out.println("2 - Mostrar contactos");				
			System.out.println("3 - Eliminar contactos");
			System.out.println("0 - Salir");
			System.out.println("============================================");
			System.out.print("¿Que operación desea realizar?");
			opcion = sc.nextInt();	
			
			controlesMenu(opcion);
			
		} while (opcion != 0);
	}
	
	
	
	//Método - controles del menú
	private void controlesMenu (int opcion) {
		switch (opcion) {
			case 0:
				System.out.println("Gracias por utilizar nuestra agenda! Hasta Luego!");				
				break;	
			case 1:
				añadirContacto();
				break;
			case 2:
				mostrarContactos();
				break;
			case 3:
				eliminarContacto();
				break;
			default:
				System.out.println("La opción seleccionada no es válida, por favor elija otra opción.");
				break;
		}	
	}
	

	//Método - añadir contacto
	private void añadirContacto() {
		
		Scanner sc = new Scanner(System.in);
		String respuesta = null;
		Contacto contacto = new Contacto(); //Objeto Contacto - Uso el constructor sin parámetros
		
		do {
			
			contacto = new Contacto(); // si no utilizaramos la inicialización dentro del bucle nos mostraría siempre el último contacto creado
			
			//Introducimos los datos del contacto
			System.out.print("Introduce el nombre: ");
			contacto.setNombre(sc.next());
			System.out.print("Introduce el primer apellido: ");
			contacto.setPrimerApellido(sc.next());
			System.out.print("Introduce el segundo apellido: ");
			contacto.setSegundoApellido(sc.next());
			//System.out.println("El nombre completo introducio es: " +contacto.toString());
			System.out.print("Introduce el DNI (incluyendo dígitos y letra): ");
			contacto.setDni(sc.next());
			//Comprobamos si el DNI es válido llamando al método validarDNI()
			//Si el DNI es válido continuaremos, sino introduciremos el DNI otra vez
			System.out.println("**** VALIDACIÓN DNI ****");
			if (!validarDNI(contacto.getDni())) {
				System.out.print("Introduce un DNI correcto: ");
				contacto.setDni(sc.next());
				//Aqui hay algo mal
				validarDNI(contacto.getDni());
			}	
			
			//Para guardar en agenda necesitamos una clave, que es un número, pasamos DNI a formato número
			String dniSoloNum = contacto.getDni().substring(0, 8);
			Integer dniNumeros = Integer.parseInt(dniSoloNum);
			agenda.put(dniNumeros,contacto.toString());
			System.out.println("Los datos introducidos son: " +contacto.getDni()+ " - " +contacto.toString());
			
			System.out.println("-----------------------");
			System.out.println("¿Quieres crear otro contacto (s/n)");
			respuesta = sc.next();
			System.out.println("-----------------------");
			
		} while (respuesta.equals("s"));
		
	}

	
	//Método - Validar DNI llamando a calcularLetraDNI
	private boolean validarDNI (String dni) {
		
		//Validamos que el tamaño del DNI es el correcto y si contiene los número y letra necesarios
		if (dni.length() != 9 || !dni.matches("^([0-9]{8}[A-Z])")) {
			System.out.println("El formato del DNI introducido es incorrecto. Por favor comprueba que ha introducido un DNI válido");
			return false;
		}
		System.out.println("El formato DNI es correcto.");

		//Comprobamos que la letra introducida es la correcta
		if (!calcularLetraDNI(dni).equals(String.valueOf(dni.charAt(8)))) {
			System.out.println("La letra del DNI introducida es incorrecta. Por favor introduzca un DNI válido.");
			return false;
		}
		System.out.println("La letra del DNI introducida es válida");
		
		//Validación completada y devolvemos true para continuar
		System.out.println("VALIDACIÓN DEL DNI COMPLETADA SATISFACTORIAMENTE");
		System.out.println("***********************************************************");
		return true;	
	}
		
	
	//Método calcularLetraDNI
	//La letra del DNI no está elegida al azar, se calcula con un específica expresión matemática
	private static String calcularLetraDNI (String dni) {
		int DNI = Integer.parseInt(dni.substring(0, 8));
		String [] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B","N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		return letra[DNI%23];
	}
		
	
	
	//Método - eliminar contacto
	private void eliminarContacto() {
		Scanner sc = new Scanner(System.in);
		String respuesta;
		
		do {
			//Mostramos todos los contactos
			mostrarContactos();
			System.out.println("Introduce DNI o nombre del contacto a eliminar");
			String datoIntroducido = sc.nextLine();
			boolean contactoEliminado = false;

			//Borrar por DNI no funciona - REVISAR
			if (agenda.containsKey(datoIntroducido)) {
				agenda.remove(datoIntroducido);
				System.out.println("DNI encontrado: " +datoIntroducido+ " Contacto eliminado.");
				contactoEliminado = true;
			} else {
				for (int k: agenda.keySet()) {
					String value = agenda.get(k);
					if (value.equals(datoIntroducido)) {
						agenda.remove(k);
						System.out.println("Nombre encontrado: " +datoIntroducido+ " Contacto eliminado.");
						contactoEliminado = true;
					}
				}
			}
			
			if (contactoEliminado) {
				System.out.println("No se ha encontrado el contacto en la Agenda");
			}	
			
			System.out.println("-----------------------");
			System.out.println("¿Quiere eliminar otro contacto (s/n)");
			respuesta = sc.next();
			System.out.println("-----------------------");
		
			

		} while (respuesta.equals("s"));

	}


	//Método - mostrar contactos y DNIs
	private void mostrarContactos() {
		System.out.println("CONTACTOS:");
		Enumeration nombres = agenda.elements();
		Enumeration dnis = agenda.keys();
		while(nombres.hasMoreElements() || dnis.hasMoreElements()){
			  System.out.println(nombres.nextElement()+ " - " + dnis.nextElement());
		}
		System.out.println("-----------------------");

	}
}
