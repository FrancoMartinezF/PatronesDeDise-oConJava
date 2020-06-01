package clase2;

import clase1.Tren;
import clase5.TrenFacade;

public class AndenHistorico extends Anden {
	public AndenHistorico(int n){
		super(n);
	}
	
	public void llegaUnTren(Tren t){
		System.out.println("Los pasajeros suben y bajan en anden numero "+this.getNumero()+". ");
		super.llegaUnTren(t);
	}
	
	public void saleElTren(){
		super.saleElTren();
		System.out.println("El tren sale del anden historico numero "+this.getNumero()+". ");
	}
}
