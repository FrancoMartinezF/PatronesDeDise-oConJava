package clase5;

public class ActivarPlataformasDeAscensoYDescenso extends CaracteristicaDecorator {
	public ActivarPlataformasDeAscensoYDescenso(Caracteristica c){
		super(c);
	}
	
	@Override
	public void llegaUnTren(){
		System.out.println("Activando las plataformas. ");
		super.llegaUnTren();
	}
}
