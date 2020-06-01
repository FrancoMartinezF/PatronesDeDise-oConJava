package clase3;

import clase1.Tren;

public class Puente implements Conectable{
	Double longitud;
	String tipo;
	
	public Puente(Double l, String t){
		longitud = l;
		tipo = t;
	}
	
	public void enViaje(Tren t){
		
	}
	
	public Double getLongitud(){
		return longitud;
	}
}
