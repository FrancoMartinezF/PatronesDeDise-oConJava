package clase5;

import Teoria7.Observado;
import Teoria7.Observador;

public class PersonalDeSeguridad implements Observador{
	String nombre;
	public PersonalDeSeguridad(String n){
		nombre = n;
	}
	
	public void llegaUnTren(TrenFacade trenF){
		trenF.todoEnOrden();
		trenF.reportarProblemas();
	}
	
	public void actualizar(Observado o){
		
	}
}
