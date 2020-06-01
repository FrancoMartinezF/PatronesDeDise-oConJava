package clase1;

import Teoria7.Iterador;
import clase3.PrototipoClonable;

public abstract class Vagon implements Enganchable, PrototipoClonable, Iterador
{
	String color;
	Enganchable siguienteVagon=null;
	
	public Vagon(String c)
	{
		color=c;
	}
	
	public Enganchable getSiguienteVagon(){
		return siguienteVagon;
	}
	
	public void setSiguienteVagon(Enganchable e){
		siguienteVagon=e;
	}

	public void enganchar(Enganchable v)
	{
		siguienteVagon=v;
	}
	
	public void desenganchar()
	{
		siguienteVagon=null;
	}

	public String getColor()
	{
		return color;
	}
	
	public void setColor(String c)
	{
		color=c;
		System.out.println("El color del vagon ha sido cambiado a: "+color);
	}
	
	public abstract Vagon clonar();
	
	public void reportarEstado(){
		System.out.println("Todo va bien. ");
	}
	
	public void reportarProblemas(){
		System.out.println("No hay inconvenientes. ");
	}
	
	public void revisarFrenos(){
		System.out.println("Deben revisarse los frenos. ");
	}
}
