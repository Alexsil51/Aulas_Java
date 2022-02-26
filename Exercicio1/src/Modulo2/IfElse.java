package Modulo2;

import javax.swing.JOptionPane;

public class IfElse {

	
	public static void main(String[] args) {
		
		
		String valor = JOptionPane.showInputDialog("Informe o Número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}
		
		//if(numero % 2 == 1) {
		//	System.out.println("Número impar!");
	//	}
	else {
			System.out.println("Número impar!");
		}
		}
	}


