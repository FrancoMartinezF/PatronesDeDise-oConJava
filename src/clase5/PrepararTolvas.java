package clase5;

public class PrepararTolvas extends CaracteristicaDecorator {
	public PrepararTolvas(Caracteristica c){
		super(c);
	}
	
	@Override
	public void llegaUnTren(){
		System.out.println("Preparando las tolvas. ");
		super.llegaUnTren();
	}
}
