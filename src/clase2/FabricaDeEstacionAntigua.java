package clase2;

import java.util.Scanner;

public class FabricaDeEstacionAntigua extends FabricaDeEstacion {
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
			Personal p = new PersonalDeBoleteriaAntiguo(nom);
			estacion.agregarPersonal(p);
		}
		
		System.out.println();
		System.out.print("Ingresa la cantidad de andenes de la estación: ");
		int ca = lectura.nextInt();
		
		for(int i=0; i<ca; i++){
			Anden anden = new AndenHistorico(i+1);
			estacion.agregarAnden(anden);
		}
		
		return estacion;
	}
}