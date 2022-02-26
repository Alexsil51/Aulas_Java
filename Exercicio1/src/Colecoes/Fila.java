package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana");  //retorna false
		fila.offer("Bia");  // Lança uma exeção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elementos da fila (sem remover)
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exeção
		System.out.println(fila.element());
		
		
		
		// Poll e Remove -> obter o proximo elemento da fila e remove!
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); // Lança uma exeção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		        // fila.size()
				// fila.clear();
				// fila.isEmpty()
		        // fila.contains(...)
		
		
	}

}
