package Modulo2;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
			
			//Vesão de desafio
			//Não pode usar valor numérico para controlar laço!
			
			for(String v = "#"; !v.equals("######"); v += "#") {
				System.out.println(v);
			}
		}
	}

}
