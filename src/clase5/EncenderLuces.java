package clase5;

public class EncenderLuces extends CaracteristicaDecorator {
	
	public EncenderLuces(Caracteristica c) {
		super(c);
	}

	@Override
	public void llegaUnTren(){
		System.out.println("Encendiendo las luces. ");
		super.llegaUnTren();
	}
}	