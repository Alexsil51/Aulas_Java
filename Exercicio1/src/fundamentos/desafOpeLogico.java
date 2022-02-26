package fundamentos;

public class desafOpeLogico {
	
	public static void main(String[] args) {
		
		//Trabalho na Terça  (V ou F)
		//Trabalho na Quinta  (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean MaisSaldável = !comprouSorvete; //Operadores unário!
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		
		System.out.println("Mais Saldável? " + MaisSaldável);
		
	}
	
	}


