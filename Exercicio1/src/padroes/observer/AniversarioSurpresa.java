package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registarObservador(namorada);
		
		porteiro.registarObservador(e -> {System.out.println("Surpresa via lambda!!!"); 
		System.out.println("Ocorreu em: " + e.getMomento());
		});
		
		porteiro.monitorar();
	}

}
