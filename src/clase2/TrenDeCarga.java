package clase2;

import java.util.Scanner;

import clase1.Locomotora;
import clase1.Vagon;
import clase1.VagonDeCarga;

public class TrenDeCarga implements TrenAbstractFactory {
	@Override
	public Locomotora crearLocomotora() {
		System.out.print("Ingresa el número de la locomotora: ");
		Scanner lectura = new Scanner(System.in);
		int num = lectura.nextInt();
		return new LocomotoraDiesel(num,this.crearMaquinista());
	}
	@Override
	public Vagon crearVagon() {
		Scanner lectura = new Scanner(System.in);
		System.out.print("Ingresa el color del vagón: ");
		String color = lectura.next();
		System.out.print("Ingresa el tipo de carga del vagón: ");
		String carga = lectura.next();
		return new VagonDeCarga(color,carga);
	}
	@Override
	public Maquinista crearMaquinista() {
		System.out.print("Ingresa el nombre del maquinista: ");
		Scanner lectura = new Scanner(System.in);
		String nom = lectura.next();
		return new EspecialistaEnElectrica(nom);
	}
}
