package clase2;

import clase1.Tren;
import clase5.TrenFacade;

public class AndenDePasajeros extends Anden {
	public AndenDePasajeros(int n){
		super(n);
	}
	
	public void llegaUnTren(Tren t){
		super.llegaUnTren(t);
		System.out.println("Los pasajeros suben y bajan en anden numero "+this.getNumero()+". ");
		
	}
	
	public void saleElTren(){
		super.saleElTren();
		System.out.println("El tren está dejando el anden de pasajeros numero "+this.getNumero()+". ");
	}
	
	
}
