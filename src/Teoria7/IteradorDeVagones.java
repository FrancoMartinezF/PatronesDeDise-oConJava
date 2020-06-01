package Teoria7;

import clase1.Enganchable;
import clase1.Locomotora;
import clase1.Tren;
import clase1.Vagon;

public class IteradorDeVagones implements Iterador {
	Vagon primero, actual;
	public IteradorDeVagones(Tren t){
		Locomotora loco = t.getLocomotora();
		primero = (Vagon) loco.getPrimerVagon();
		actual = primero;
	}
	public void primero(){
		actual = primero;
	}
	public void siguiente(){
		actual = (Vagon) actual.getSiguienteVagon();
	}
	public boolean fin(){
		return actual == null;
	}
	public Iterable actual(){
		return (Iterable) actual;
	}

}
