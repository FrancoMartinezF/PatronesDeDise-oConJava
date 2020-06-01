package clase2;

public class MaquinistaJubilado extends Maquinista {
	public MaquinistaJubilado(String nom){
		super(nom);
	}
	
	public void estoyListo(){
		System.out.println(nombre+" preparado para llevar el tren a destino. ");
	}
	
	@Override
	public Maquinista clonar(){
		return new MaquinistaJubilado(this.getNombre());
	}
}
