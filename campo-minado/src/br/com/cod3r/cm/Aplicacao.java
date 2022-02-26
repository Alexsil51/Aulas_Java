package br.com.cod3r.cm;

import modelo.Tabuleiro;
import visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
	new TabuleiroConsole(tabuleiro);	
		
//		tabuleiro.abrir(3, 3);
//		tabuleiro.alterarMarcacao(4, 4);
//		tabuleiro.alterarMarcacao(4, 5);
		//tabuleiro.abrir(3, 3);
		
//		System.out.println(tabuleiro);
	}

}
