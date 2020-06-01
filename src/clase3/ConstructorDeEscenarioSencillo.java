package clase3;

import java.util.Scanner;

import clase2.Estacion;
import clase2.FabricaDeEstacion;

public class ConstructorDeEscenarioSencillo extends ConstructorDeEscenarioAbstracto {
	@Override
	public Estacion construirEstacion(String nombre) {
		//Estacion e = new Estacion(nombre);
		//rf.agregarEstacion(e);
		//return e;
		Scanner lectura = new Scanner(System.in);
		System.out.println();
		System.out.println("1- Estacion de pasajeros");
		System.out.println("2- Estacion de carga");
		System.out.println("3- Estacion antigua");
		int opcion = lectura.nextInt();
		
		Estacion estacion = FabricaDeEstacion.crearEstacion(opcion);
		rf.agregarEstacion(estacion);
		
		return estacion;
	}
	@Override
	public Via construirVia(double l) {
		return new Via(l);
	}
	
	@Override
	public Tunel construirTunel(double l){
		return new Tunel(l);
	}
}