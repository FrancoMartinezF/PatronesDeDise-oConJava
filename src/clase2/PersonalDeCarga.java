package clase2;

public class PersonalDeCarga extends Personal{
	public PersonalDeCarga(String n){
		super(n);
	}
	
	public void firmarEntrada(){
		System.out.println("Personal de carga "+this.getNombre()+", llegando a trabajar. ");
	}

}
