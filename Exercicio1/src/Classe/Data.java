package Classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	//final int x;
	static int x;

	Data(){
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
		
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// objetos -> null
		// String s = null;
		
		//int a;
		//a = 0;
		
		//String s = null;
		//System.out.println(s);
		
		
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		//x = 3;
	}
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimiDataFormatada() {
		System.out.println(obterDataFormatada());
	
	}
}
