package com.cice.colecciones;

import java.util.PriorityQueue;

public class Colas {
	
	public static void main (String [] args) {
		
		//Salen en orden
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(10);
		pq.add(12);
		pq.add(43);
		pq.add(234);
		pq.add(1);
		pq.add(7);
		pq.add(2);
		
		//Como se lee una PriorityQueue
		//Para utilizar el poll hay que definir primero el tamaño de la cola y luego 
		//utilizar este parámetro en el for
		//Hay que poner un valor fijo para el tamaño de la cola
		final int SIZE = pq.size();
		
//		for (int i = 0; i < SIZE; i++) {
//			//Solo nos muestra por pantalla los números hasta 10
//			System.out.println(pq.poll());
//		}
//		
//		for (int i = 0; i < SIZE; i++) {
//			//Solo nos muestra por pantalla los números hasta 10
//			System.out.println(pq.peek());
//			pq.remove();
//		}

		PriorityQueue<String> pq2 = new PriorityQueue();
		pq2.add("Jose");
		pq2.add("Fede");
		pq2.add("Tere");
		pq2.add("Carmen");
		pq2.add("Sergio");
		pq2.add("Isa");
		
		final int SIZE2 = pq2.size();
		
		//Salen en orden alfabético
		for (int i = 0; i < SIZE2; i++) {
			System.out.println(pq2.peek());
			pq2.remove();
		}
	}


}
