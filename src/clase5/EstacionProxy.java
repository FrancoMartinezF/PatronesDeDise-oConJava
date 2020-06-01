package clase5;

import java.util.ArrayList;

import clase1.Tren;
import clase2.Anden;
import clase2.Estacion;
import clase2.Personal;
import clase3.Conectable;
import clase3.TrenClonable;

public class EstacionProxy implements IEstacion {
	String nombre;
	private Estacion estacionReal = null;
	private ArrayList<Conectable> conexiones;
	private ArrayList<Personal> personal;
	private ArrayList<Anden> andenes;
	
	
	public EstacionProxy(String n){
		nombre=n;
	}
	@Override
	public void llegaUnTren(Tren t) {
		if(estacionReal==null){
			estacionReal = new Estacion("Nombre de la estacion. ");
			for(Anden a : andenes){
				estacionReal.agregarAnden(a);
			}
			for(Personal p : personal){
				estacionReal.agregarPersonal(p);
			}
			for(Conectable c : conexiones){
				estacionReal.agregarConexion(c);
			}
		}
		
		estacionReal.llegaUnTren(t);
	}

	@Override
	public void agregarConexion(Conectable c) {
		if(estacionReal == null)
			conexiones.add(c);
			else
				estacionReal.agregarConexion(c);
	}

	@Override
	public void agregarPersonal(Personal p) {
		if(estacionReal == null)
			personal.add(p);
		else
			estacionReal.agregarPersonal(p);
	}

	@Override
	public void agregarAnden(Anden a) {
		if(estacionReal == null)
			andenes.add(a);
		else
			estacionReal.agregarAnden(a);
	}

	@Override
	public void saleUnTren(int n) {
		
	}

	@Override
	public String getNombre() {
		return null;
	}

	@Override
	public void setNombre(String n) {
		
	}

	@Override
	public void asignarTren(TrenClonable tc) {
		
	}

	@Override
	public void partidaDelTren() {
		
	}

	@Override
	public void enViaje(Tren t) {
		
	}

	@Override
	public void saleTren(Tren t) {
		
	}

	@Override
	public Double getLongitud() {
		return null;
	}

}
