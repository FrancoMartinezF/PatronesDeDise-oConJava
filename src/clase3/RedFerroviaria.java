package clase3;

import java.util.ArrayList;

import clase1.Tren;
import clase2.Estacion;

public class RedFerroviaria {
	ArrayList<Tren> trenes = new ArrayList();
	ArrayList<Estacion> estaciones = new ArrayList();
	static RedFerroviaria unicaRed = null;
	
	private RedFerroviaria(){
		
	}
	public void agregarTren(Tren t){
		trenes.add(t);
	}
	
	public void agregarEstacion(Estacion e){
		estaciones.add(e);
	}
	
	public static RedFerroviaria getInstance(){
		if(unicaRed == null){
			unicaRed = new RedFerroviaria();
		}
		
		return unicaRed;
	}
}
