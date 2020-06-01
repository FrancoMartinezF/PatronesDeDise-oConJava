package clase5;

import Teoria7.Observado;
import Teoria7.Observador;

public class Mecanico implements Observador{
	String nombre;
	public Mecanico (String n){
		nombre=n;
	}
	
	public void llegaUnTren(TrenFacade trenF){
		trenF.existenFallas();
		trenF.revisarFrenos();
		trenF.recargarCombustible();
		trenF.hacerRevision();
	}
	
	public void actualizar(Observado o){
		
	}
}
