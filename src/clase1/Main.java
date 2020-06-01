package clase1;
import clase2.Anden;
import clase2.AndenDePasajeros;
import clase2.Estacion;
import clase2.FabricaDeEstacion;
import clase2.FabricaDeEstacionDeCarga;
import clase2.LocomotoraDiesel;
import clase2.LocomotoraElectrica;
import clase2.Maquinista;
import clase2.TrenAbstractFactory;
import clase2.TrenDeCarga;
import clase2.TrenDePasajeros;
import clase2.TrenDePasajerosAntiguo;
import clase3.ConstructorDeEscenarioAbstracto;
import clase3.ConstructorDeEscenarioSencillo;
import clase3.DirectorDeEscenarios;
import clase3.Puente;
import clase3.RedFerroviaria;
import clase3.Tunel;
import clase3.Via;
import clase4.ConexionCompuesta;
import clase5.ActivarPlataformasDeAscensoYDescenso;
import clase5.Caracteristica;
import clase5.CaracteristicaEnComun;
import clase5.EncenderCarteles;
import clase5.EncenderLuces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Tren crearTren()
	{
		TrenAbstractFactory fabrica = null;
		System.out.println("1- Tren de pasajeros");
		System.out.println("2- Tren de carga");
		System.out.println("3- Tren antiguo");
		
		Scanner lectura = new Scanner(System.in);
		int opcion = lectura.nextInt();
		
		switch(opcion){
			case 1:
				fabrica = new TrenDePasajeros();
				break;
				
			case 2:
				fabrica = new TrenDeCarga();
				break;
				
			case 3:
				fabrica = new TrenDePasajerosAntiguo();
				break;
		}
		
		
		Locomotora loco = fabrica.crearLocomotora();
		Tren tren = new Tren(loco);
		System.out.print("Ingresa la cantidad de vagones que poseerá el tren: ");
		int cant = lectura.nextInt();
		
		for(int i=0; i<cant;i++){
			Vagon vagon = fabrica.crearVagon();
			tren.agregarVagon(vagon);
		}
		
		//Tren trenClonado = tren.clonar();
		
		return tren;
	}

	public static Estacion crearEstacion(){
		Scanner lectura = new Scanner(System.in);
		System.out.println();
		System.out.println("1- Estacion de pasajeros");
		System.out.println("2- Estacion de carga");
		System.out.println("3- Estacion antigua");
		int opcion = lectura.nextInt();
		
		Estacion estacion = FabricaDeEstacion.crearEstacion(opcion);
		
		return estacion;
	}
	
	public static void trenesEnMovimiento(){
		Estacion estacion = crearEstacion();
		System.out.println();
		System.out.println();
		System.out.print("Ingresa la cantidad de trenes a crear: ");
		Scanner lectura = new Scanner(System.in);
		int cant = lectura.nextInt();
		ArrayList<Tren> trenes = new ArrayList();
		
		for(int i=0;i<cant;i++){
			Tren tren = crearTren();
			trenes.add(tren);
		}
		
		while(true){
			System.out.println();
			System.out.println("1- Llegada de un tren");
			System.out.println("2- Salida de un tren");
			System.out.println("3- Finalizar simulación");
		
			int d = lectura.nextInt();
		
			switch(d){
			case 1:
				System.out.print("Ingresa la posicion del tren que arriba: ");
				int t = lectura.nextInt();
				t--;
				Tren tren = trenes.get(t);
				estacion.llegaUnTren(tren);
				break;
				
			case 2:
				System.out.print("Ingresa el numero del anden para liberar: ");
				int tr = lectura.nextInt();
				estacion.saleUnTren(tr);
				break;
			case 3:
				System.exit(0);
				break;
			}
		}
	}
	
	public static void crearEscenarioCuadrado(){

		ConstructorDeEscenarioAbstracto constructor = new ConstructorDeEscenarioSencillo();
		DirectorDeEscenarios director = new DirectorDeEscenarios();
		director.construirRedCuadrada(constructor);
		
//		Estacion e1 = FabricaDeEstacion.crearEstacion(1);
//		Estacion e2 = FabricaDeEstacion.crearEstacion(1);
//		Estacion e3 = FabricaDeEstacion.crearEstacion(1);
//		Estacion e4 = FabricaDeEstacion.crearEstacion(1);
//		
//		Scanner lectura = new Scanner(System.in);
//		System.out.print("Longitud del puente entre "+e1.getNombre()+" y "+e2.getNombre()+" : ");
//		Double d1 = lectura.nextDouble();
//		System.out.print("Tipo de puente: ");
//		String t1 = lectura.next();
//		Puente p1 = new Puente(d1,t1);
//		System.out.print("Longitud del puente entre "+e2.getNombre()+" y "+e3.getNombre()+" : ");
//		Double d2 = lectura.nextDouble();
//		System.out.print("Tipo de puente: ");
//		String t2 = lectura.next();
//		Puente p2 = new Puente(d2,t2);
//		System.out.print("Longitud del puente entre "+e3.getNombre()+" y "+e4.getNombre()+" : ");
//		Double d3 = lectura.nextDouble();
//		System.out.print("Tipo de puente: ");
//		String t3 = lectura.next();
//		Puente p3 = new Puente(d3,t3);
//		System.out.print("Longitud del puente entre "+e4.getNombre()+" y "+e1.getNombre()+" : ");
//		Double d4 = lectura.nextDouble();
//		System.out.print("Tipo de puente: ");
//		String t4 = lectura.next();
//		Puente p4 = new Puente(d4,t4);
//		
//		e1.agregarConexion(p4);
//		e1.agregarConexion(p1);
//		
//		e2.agregarConexion(p1);
//		e2.agregarConexion(p2);
//		
//		e3.agregarConexion(p2);
//		e3.agregarConexion(p3);
//		
//		e4.agregarConexion(p3);
//		e4.agregarConexion(p4);
		
	}
	
	public static void viajesDelTren(){
		ConstructorDeEscenarioSencillo constructor = new ConstructorDeEscenarioSencillo();
		DirectorDeEscenarios director = new DirectorDeEscenarios();
		
		RedFerroviaria red = director.construirRedSimple(constructor);
		
	}
		
		
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("A modo de ejemplo se debe construir una red ferroviaria que disponga de 4 estaciones. Debiéndose completar con cuidado todos los datos que el programa pida");

		ConstructorDeEscenarioSencillo constructor = new ConstructorDeEscenarioSencillo();
		DirectorDeEscenarios director = new DirectorDeEscenarios();
		
		RedFerroviaria redccuadrada = director.construirRedCuadrada(constructor);
		//Ejercicio 5 teoría 4..Comentarios agregados para seguir probando
		
		
		
		
	}

}

