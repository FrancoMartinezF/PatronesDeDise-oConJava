package clase5;

import clase1.Enganchable;
import clase1.Locomotora;
import clase1.Tren;
import clase1.Vagon;
import clase2.Maquinista;
import clase3.Motor;

public class TrenFacade {
	Tren tren;
	Locomotora primerLocomotora;
	Motor motor;
	Maquinista maquinista;
	Enganchable primerVagon;

	public TrenFacade(Tren t){
		tren = t;
		primerLocomotora = tren.getLocomotora();
		motor = primerLocomotora.getMotor();
		maquinista = primerLocomotora.getMaquinista();
		primerVagon =primerLocomotora.getPrimerVagon();
	}

	public void horaDeArribo(String hora){
		tren.horaDeArribo(hora);
	}
	public void todoEnOrden (){
		maquinista.todoEnOrden();
	}
	public void reportarEstado (){
		primerLocomotora.reportarEstado();
		primerVagon.reportarEstado();
	}
	
	public void reportarProblemas(){
		((Vagon) primerVagon).reportarProblemas();
		
	}
	
	public void existenFallas(){
		maquinista.existenFallas();
	}
	
	public void revisarFrenos(){
		((Vagon) primerVagon).revisarFrenos();
	}
	
	public void recargarCombustible(){
		((Locomotora) primerLocomotora).recargarCombustible();
	}
	
	public void hacerRevision(){
		motor.hacerRevision();
	}
	
}
