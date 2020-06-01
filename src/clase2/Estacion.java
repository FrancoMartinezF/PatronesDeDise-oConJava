package clase2;

import java.util.ArrayList;
import java.util.Scanner;

import Teoria7.Observado;
import Teoria7.Observador;
import Teoria7.Pasajero;
import clase1.Tren;
import clase3.Conectable;
import clase3.TrenClonable;
import clase5.IEstacion;
import clase5.Mecanico;
import clase5.PersonalDeSeguridad;
import clase5.SupervisorDeEstacion;
import clase5.TrenFacade;

public class Estacion implements Conectable, IEstacion, Observado {
	ArrayList<Personal> personal = new ArrayList();
	ArrayList<Anden> andenes = new ArrayList();
	ArrayList<Conectable> tramosdevia = new ArrayList();
	String nombre;
	SupervisorDeEstacion supervisor = null;
	Mecanico mecanico = null;
	PersonalDeSeguridad seguridad = null;
	ArrayList<Observador> observadores = new ArrayList<Observador>();
	TrenFacade trenreciente = null;
	ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	
	public Estacion(String n){
		nombre = n;
		Scanner lectura = new Scanner(System.in);
		System.out.print("Ingresa el nombre del supervisor: ");
		supervisor = new SupervisorDeEstacion(lectura.nextLine());
		System.out.print("Ingresa el nombre del mecanico: ");
		mecanico = new Mecanico(lectura.nextLine());
		System.out.print("Ingresa el nombre del personal de seguridad: ");
		seguridad = new PersonalDeSeguridad(lectura.nextLine());
	}
	public void agregarPersonal(Personal p){
		personal.add(p);
		p.firmarEntrada();
	}
	
	public void agregarAnden(Anden a){
		andenes.add(a);
	}
	
	public void llegaUnTren(Tren t){
		//trenreciente = new TrenFacade(t);
		System.out.println("Llega un tren. ");
		this.notificar();
		int tam = andenes.size();
		 for(int i=0; i<tam; i++){
			 Anden anden = andenes.get(i);
			 if(anden.estaOcupado() == false){
				 anden.llegaUnTren(t);
				 break;
			 }
		 }
	}
	
	public void saleUnTren(int n){
		n--;
		Anden anden = andenes.get(n);
		anden.saleElTren();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String n){
		nombre=n;
	}
	
	public void agregarConexion(Conectable o){
		tramosdevia.add(o);
	}
	
	public void asignarTren(TrenClonable t){

		Anden algunAnden=null;
		int cant = andenes.size();
		for(int i = 0;i<cant;i++){
			Anden a = andenes.get(i);
			if(a.estaOcupado()==false){
				algunAnden = a;
				break;
			}
		}
		
		algunAnden.llegaUnTren((Tren) t.clonar());
		
		}

	public void partidaDelTren(){
		Conectable conexion = tramosdevia.get(0);
		Anden anden = andenes.get(0);
		Tren t = anden.getTren();
		System.out.println("Sale el tren. ");
		conexion.enViaje(t);
	}
	
	public  void enViaje(Tren t){
		this.llegaUnTren(t);
	}
	
	public void saleTren(Tren t){
		System.out.println("Saliendo el tren. ");
		Conectable conexion = tramosdevia.get(0);
		conexion.enViaje(t);
	}
	
	public Double getLongitud(){
		return null;
	}

	public void agregarObservador(Observador o) {
		observadores.add(o);
		
	}
	
	public void quitarObservador(Observador o) {
		observadores.remove(o);
		
	}
	
	public void notificar() {
		for(Observador o: observadores)
			o.actualizar(this);
		
	}
	
	public void ingresoDePasajero(Pasajero pasajero){
		pasajeros.add(pasajero);
	}
}
