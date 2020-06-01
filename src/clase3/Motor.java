package clase3;

public class Motor implements PrototipoClonable {

	@Override
	public Motor clonar() {
		return new Motor();
	}
	
	public void hacerRevision(){
		System.out.println("Revisando el motor. ");
	}

}
