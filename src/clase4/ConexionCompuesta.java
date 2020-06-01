package clase4;

import java.util.ArrayList;

import clase1.Tren;
import clase3.Conectable;

public class ConexionCompuesta implements Conectable{
	ArrayList<Conectable> hijos = new ArrayList();
	Conectable destino;
	
	public void agregarHijo(Conectable c){
		hijos.add(c);
		}
	
	public void enViaje(Tren t){
			hijos.get(0).enViaje(t);
		}
	
	public void agregarDestino(Conectable c){
		destino = c;
	}
	
	public Double getLongitud(){
		Double total=0.0;
		for(int i=0; i<hijos.size();i++){
			Conectable c = hijos.get(i);
			Double parcial = c.getLongitud();
			total = total + parcial;
		}
		
		return total;
	}
}


//En el for estaba invocando al metodo "ida", pero no existe, así que lo cambié por enViaje
//Quite el for porque ahora una conexion le manda un msj a la que sigue...
