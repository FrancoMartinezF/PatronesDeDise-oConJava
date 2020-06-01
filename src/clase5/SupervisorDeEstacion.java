package clase5;

import Teoria7.IteradorDeVagones;
import Teoria7.Observado;
import Teoria7.Observador;
import clase1.Tren;
import clase1.Vagon;

public class SupervisorDeEstacion implements Observador {
	String nombre;
	
	public SupervisorDeEstacion(String n){
		nombre=n;
	}
	public void llegaUnTren(Tren trenF){
		//trenF.horaDeArribo("11 horas");
		//trenF.todoEnOrden();
		//trenF.reportarEstado();
		IteradorDeVagones iterador = (IteradorDeVagones) trenF.crearIterador();
		while(! iterador.fin()){
			Vagon v = (Vagon) iterador.actual();
			v.reportarEstado();
			iterador.siguiente();
		}
	}
	
	public void actualizar(Observado o){
		
	}

}
