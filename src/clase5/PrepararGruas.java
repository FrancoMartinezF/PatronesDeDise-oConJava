package clase5;

public class PrepararGruas extends CaracteristicaDecorator {
	public PrepararGruas(Caracteristica c){
		super(c);
	}
	
	@Override
	public void llegaUnTren(){
		System.out.println("Preparando las gruas. ");
		super.llegaUnTren();
	}
}

