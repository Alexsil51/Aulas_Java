package Modulo2;

import java.util.Scanner;

public class Desafio2IfElse {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite Nome Dia da Semana: ");
         String dia = entrada.next();

		/*if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} */
         
         /*if ("domingo".equals(dia.toLowerCase())) {
			System.out.println(1);
		} */
		if (dia.equalsIgnoreCase("domingo")) {
           System.out.println(1);
		} 
		else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} 
		else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}
		else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}
		else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}
		else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}
		else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		else {
			System.out.println("Dia Invalido!");
		}
		/*else if (nota >= 4.1) {
			System.out.println("Conceito C ");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D ");
		} else {
			System.out.println("Conceito E ");
		}
		*/
		System.out.println("\nFIM ");
		entrada.close();
	}

}
