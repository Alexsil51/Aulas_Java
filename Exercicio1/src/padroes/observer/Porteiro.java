package padroes.observer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registarObservador(ObservadorChegadaAniversariante observador) {
		
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariente chegou? ");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				// Criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date(0));
				
				
				// notifica os observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}
		
		entrada.close();
	}
}
