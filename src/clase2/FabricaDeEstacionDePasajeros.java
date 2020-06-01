package clase2;

import java.util.Scanner;

import clase5.ActivarPlataformasDeAscensoYDescenso;
import clase5.Caracteristica;
import clase5.CaracteristicaEnComun;
import clase5.EncenderCarteles;
import clase5.EncenderLuces;

public class FabricaDeEstacionDePasajeros extends FabricaDeEstacion {
	@Override
	public Estacion crearEstacion(){
		Scanner lectura = new Scanner(System.in);
		System.out.print("Ingresa el nombre de la estacion: ");
		Estacion estacion = new Estacion(lectura.nextLine());
		System.out.print("Ingresa la cantidad de personal de la estaci�n: ");
		int cp = lectura.nextInt();
		
		for(int i=0; i<cp; i++){
			System.out.println();
			System.out.print("Ingresa el nombre del personal: ");
			String nom = lectura.next();
			Personal p = new PersonalDeBoleteria(nom);
			estacion.agregarPersonal(p);
		}
		
		System.out.println();
		System.out.print("Ingresa la cantidad de andenes de la estaci�n: ");
		int ca = lectura.nextInt();
		
		for(int i=0; i<ca; i++){
			Caracteristica accion = new CaracteristicaEnComun();
			accion = new ActivarPlataformasDeAscensoYDescenso(accion);
			accion = new EncenderCarteles(accion);
			accion = new EncenderLuces(accion);
			Anden anden = new AndenDePasajeros(i+1);
			anden.agregarDecoracion(accion);
			estacion.agregarAnden(anden);
		}
		
		return estacion;
	}
}
