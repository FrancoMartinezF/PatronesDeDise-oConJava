package clase2;

public class EspecialistaEnDiesel extends Maquinista {
	public  EspecialistaEnDiesel(String n){
		super(n);
	}
	
	@Override
	public Maquinista clonar(){
		return new EspecialistaEnDiesel(this.getNombre());
	}
}
