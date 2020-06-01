package clase2;

import clase3.PrototipoClonable;

public abstract class Maquinista implements PrototipoClonable {
	String nombre;
	
	public Maquinista(String n)
	{
		nombre=n;	
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void estoyListo(){
		System.out.println(nombre+" preparado para llevar el tren a destino. ");
	}
	
	public abstract Maquinista clonar();
	
	public void todoEnOrden(){
		System.out.println("Todo está en perfectas condiciones. ");
	}
	
	public void existenFallas(){
		System.out.println("Hay fallas en la locomotora. ");
	}
}
