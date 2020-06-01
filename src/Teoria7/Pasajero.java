package Teoria7;

import clase2.Estacion;

public class Pasajero implements Observador {
	public void ingresar(Estacion e){
		e.ingresoDePasajero(this);
	}
	public void actualizar(Observado o){
		
	}
}
