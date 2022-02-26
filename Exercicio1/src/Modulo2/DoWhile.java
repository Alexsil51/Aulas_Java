package Modulo2;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		
		/* if(...) sentença; ou {}
		 * While(...) sentença; ou {}
		 * for(...;...;...) sentença; ou {}
		 * do sentença; ou {} while(...);
		 */
		
		//syso atalho do println
		//System.out.println();
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Você precisa falar" + 
		"as palavras mágicas...");
			System.out.print("Quer Sair?");
			texto = entrada.nextLine();
			
		}while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
		
	}

}
