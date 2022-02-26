package Classe;


public class AreaCirc {

	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial){
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		//Math m = new.Math();
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
		
	}
	
}
