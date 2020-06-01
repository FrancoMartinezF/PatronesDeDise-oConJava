package clase2;

import java.util.Scanner;

import clase1.Locomotora;
import clase1.Vagon;
import clase1.VagonDePasajeros;

public class TrenDePasajeros implements TrenAbstractFactory {
	@Override
	public Locomotora crearLocomotora() {
		System.out.print("Ingresa el n�mero de la locomotora: ");
		Scanner lectura = new Scanner(System.in);
		int num = lectura.nextInt();
		Locomotora locoelectrica = new LocomotoraElectrica(num,this.crearMaquinista());
		return locoelectrica;
	}
	@Override
	public Vagon crearVagon() {
		Scanner lectura = new Scanner(System.in);
		System.out.print("Ingresa el color del vag�n: ");
		String color = lectura.next();
		System.out.print("Ingresa la capacidad del vag�n: ");
		int cap = lectura.nextInt();
		return new VagonDePasajeros(color,cap);
	}
	@Override
	public Maquinista crearMaquinista() {
		System.out.print("Ingresa el nombre del maquinista: ");
		Scanner lectura = new Scanner(System.in);
		String nom = lectura.next();
		return new EspecialistaEnElectrica(nom);
	}
}
