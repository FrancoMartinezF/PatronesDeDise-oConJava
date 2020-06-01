package clase3;

import clase1.Tren;
import clase2.Estacion;

public class Tunel implements Conectable {
	Double longitud;
	Conectable conexionDestino;
	
	public Tunel(Double l){
		longitud = l;

	}
	public void agregarConexion(Conectable c){
		conexionDestino = c;
	}
	public void enViaje(Tren t){
		System.out.println("Cruzando un tunel. " );
		conexionDestino.enViaje(t);
	}
	
	public Double getLongitud(){
		return longitud;
	}
}
