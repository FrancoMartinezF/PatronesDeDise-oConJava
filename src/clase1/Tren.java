package clase1;

import Teoria7.Iterador;
import Teoria7.IteradorDeVagones;
import clase3.PrototipoClonable;

public class Tren implements PrototipoClonable
{
	Enganchable locomotora;
	Enganchable ultimoVagon;
	
	public Tren(Enganchable l)
	{
		locomotora=l;
	}
	
	public Locomotora getLocomotora()
	{
		return (Locomotora) locomotora;
	}
	
	public void setLocomotora(Locomotora l)
	{
		locomotora=l;
	}
	
	public void agregarVagon(Enganchable v)
	{
		if (ultimoVagon==null){
			locomotora.enganchar(v);
			ultimoVagon=v;
		}
		else{
			ultimoVagon.enganchar(v);
			ultimoVagon=v;
		}
	}
	
	public String toString()
	{
		String msj=locomotora.toString();
		return msj;
	}
	
	public void realizarRecorrido()
	{
		((Locomotora) locomotora).encenderMotor();
		((Locomotora) locomotora).enMarcha();
	}
	
	public Tren clonar(){
		Tren tren = new Tren(locomotora);
		Enganchable e = locomotora; //en la teoria dice primerEnganchable, pero nunca definimos esa variable, asi que deduzco que sería la locomotora
		tren.agregarVagon((Enganchable) e.clonar());
		return tren;
	}
	
	public void horaDeArribo(String hora){
		System.out.println("El tren arriba a las: "+hora);
	}
	
	public Iterador crearIterador() {
		return new IteradorDeVagones(this);
		}
}
