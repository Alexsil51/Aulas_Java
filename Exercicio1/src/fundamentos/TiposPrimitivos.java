package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informa��es do funcionario
		
		// Tipos n�mericos interiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuldas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuldas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("F�rias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
		
	}

}
