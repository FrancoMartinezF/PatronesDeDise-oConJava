package clase2;

public class EspecialistaEnElectrica extends Maquinista {
	public EspecialistaEnElectrica(String n){
		super(n);
	}
	
	@Override
	public Maquinista clonar(){
		return new EspecialistaEnElectrica(this.getNombre());
	}
}
