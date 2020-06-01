package clase3;

import java.util.Scanner;

import clase1.Main;
import clase1.Tren;
import clase2.Estacion;
import clase4.ConexionCompuesta;

public class DirectorDeEscenarios {
	public static RedFerroviaria construirRedSimple (ConstructorDeEscenarioAbstracto constructor)
	{
		constructor.construirRedFerroviara();
		Scanner lectura = new Scanner(System.in);
		System.out.println();
		System.out.print("Nombre de la primer estación: ");
		Estacion e1 = constructor.construirEstacion(lectura.next());
		System.out.print("Nombre de la segunda estación: ");
		Estacion e2 = constructor.construirEstacion(lectura.next());
		System.out.print("Longitud de la vía: ");
		Via v = constructor.construirVia(lectura.nextDouble());
		e1.agregarConexion(v);
		
		return constructor.obtenerRedFerroviaria();
	}
	
	public static RedFerroviaria construirRedCuadrada (ConstructorDeEscenarioAbstracto constructor){
		constructor.construirRedFerroviara();
		Scanner lectura = new Scanner(System.in);
		System.out.println();
		System.out.print("Nombre de la primer estación: ");
		Estacion e1 = constructor.construirEstacion(lectura.next());
		System.out.print("Nombre de la segunda estación: ");
		Estacion e2 = constructor.construirEstacion(lectura.next());
		System.out.print("Nombre de la tercera estación: ");
		Estacion e3 = constructor.construirEstacion(lectura.next());
		System.out.print("Nombre de la cuarta estación: ");
		Estacion e4 = constructor.construirEstacion(lectura.next());
		System.out.print("Distancia entre "+e1.getNombre()+" y "+e2.getNombre()+" : ");
		Via v1 = constructor.construirVia(lectura.nextDouble());
		e1.agregarConexion(v1);
		v1.agregarConexion(e2);
		System.out.print("Distancia entre "+e2.getNombre()+" y "+e3.getNombre()+" : ");
		Via v2 = constructor.construirVia(lectura.nextDouble());
		e2.agregarConexion(v2);
		v2.agregarConexion(e3);
		System.out.print("Distancia entre "+e3.getNombre()+" y "+e4.getNombre()+" : ");
		Via v3 = constructor.construirVia(lectura.nextDouble());
		e3.agregarConexion(v3);
		v3.agregarConexion(e4);
		System.out.print("Distancia entre "+e4.getNombre()+" y "+e1.getNombre()+" : ");
		Via v4 = constructor.construirVia(lectura.nextDouble());
		e4.agregarConexion(v4);
		v4.agregarConexion(e1);
		
		RedFerroviaria redCuadrada = constructor.obtenerRedFerroviaria();
		
		Tren tren = Main.crearTren();
		
		redCuadrada.agregarTren(tren);
		
		e1.partidaDelTren();
		e2.partidaDelTren();
		e3.partidaDelTren();
		e4.partidaDelTren();
		
		return redCuadrada;
	}
	
	public static RedFerroviaria construirRedCompuesta(ConstructorDeEscenarioAbstracto constructor){
		constructor.construirRedFerroviara();
		
		Scanner lectura = new Scanner(System.in);
		System.out.print("Nombre de la primer estación: ");
		Estacion e1 = constructor.construirEstacion(lectura.next());
		System.out.print("Nombre de la segunda estación: ");
		Estacion e2 = constructor.construirEstacion(lectura.next());
		
		ConexionCompuesta conex = new ConexionCompuesta();
		
		Via v1 = constructor.construirVia(10.0);
		Via v2 = constructor.construirVia(15.1);
		Tunel tun = constructor.construirTunel(2.0);
		
		v1.agregarConexion(tun);
		tun.agregarConexion(v2);
		v2.agregarConexion(e2);
		
		conex.agregarHijo(v1);
		conex.agregarHijo(tun);
		conex.agregarHijo(v2);
		
		e1.agregarConexion(conex);
		conex.agregarDestino(e2);
		
		Tren tren = Main.crearTren();
		
		RedFerroviaria redCom = constructor.obtenerRedFerroviaria();
		
		redCom.agregarTren(tren);
		
		e1.saleTren(tren);
		System.out.println("La longitud total del camino es: "+conex.getLongitud());
		return redCom;
		
	}
	
	
}
