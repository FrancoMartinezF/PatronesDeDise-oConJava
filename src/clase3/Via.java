package clase3;

import clase1.Tren;
import clase2.Estacion;

public class Via implements Conectable{
	Double longitud;
	Conectable conexionDestino;
	
	public Via(Double l){
		longitud = l;
	
	}
	
	public void agregarConexion(Conectable c){
		conexionDestino = c;
	}
	public void enViaje(Tren t){
		System.out.println("Cruzando las vías. ");
		conexionDestino.enViaje(t);
	}
	
	public Double getLongitud(){
		return longitud;
	}
}
