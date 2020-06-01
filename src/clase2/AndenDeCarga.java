package clase2;

import clase1.Tren;
import clase5.TrenFacade;

public class AndenDeCarga extends Anden {
	public AndenDeCarga(int n){
		super(n);
	}
	
	public void llegaUnTren(Tren t){
		super.llegaUnTren(t);
		System.out.println("Cargando y descargando mercaderia en anden numero "+this.getNumero()+". ");
		
	}
	
	public void saleElTren(){
		super.saleElTren();
		System.out.print("El tren está dejando el anden de carga numero "+this.getNumero()+" .");
	}

}
