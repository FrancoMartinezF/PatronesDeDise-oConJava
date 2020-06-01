package clase2;

import clase1.Tren;
import clase5.Caracteristica;
import clase5.TrenFacade;

public abstract class Anden {
	
	int numero;
	Tren tren=null;
	Caracteristica deco;
	
	public Anden(int n){
		numero=n;
	}
	
	public void llegaUnTren(Tren t){
		tren=t;
		deco.llegaUnTren();
	}
	
	public int getNumero(){
		return numero;
	}
	
	public boolean estaOcupado(){
		if (tren==null){
			return false;
		}
		else{
			return true;
		}
	}
	
	public void saleElTren(){
		tren=null;
	}
	
	public Tren getTren(){
		return tren;
	}
	
	public void agregarDecoracion(Caracteristica c){
		deco=c;
	}
}
