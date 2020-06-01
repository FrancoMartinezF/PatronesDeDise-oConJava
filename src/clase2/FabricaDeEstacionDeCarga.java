package clase2;

import java.util.Scanner;

import clase5.ActivarPlataformasDeAscensoYDescenso;
import clase5.Caracteristica;
import clase5.CaracteristicaEnComun;
import clase5.EncenderCarteles;
import clase5.EncenderLuces;
import clase5.PrepararGruas;
import clase5.PrepararTolvas;

public class FabricaDeEstacionDeCarga extends FabricaDeEstacion {
	@Override
	public Estacion crearEstacion(){
		Scanner lectura = new Scanner(System.in);
		System.out.print("Ingresa el nombre de la estacion: ");
		Estacion estacion = new Estacion(lectura.nextLine());
		System.out.print("Ingresa la cantidad de personal de la estación: ");
		int cp = lectura.nextInt();
		
		for(int i=0; i<cp; i++){
			System.out.print("Ingresa el nombre del personal: ");
			String nom = lectura.nextLine();
			Personal p = new PersonalDeCarga(nom);
			estacion.agregarPersonal(p);
		}
		
		System.out.println();
		System.out.print("Ingresa la cantidad de andenes de la estación: ");
		int ca = lectura.nextInt();
		
		for(int i=0; i<ca; i++){
			Caracteristica accion = new CaracteristicaEnComun();
			accion = new PrepararGruas(accion);
			accion = new PrepararTolvas(accion);
			accion = new EncenderLuces(accion);
			Anden anden = new AndenDeCarga(i+1);
			anden.agregarDecoracion(accion);
			estacion.agregarAnden(anden);
		}
		
		return estacion;
	}
}