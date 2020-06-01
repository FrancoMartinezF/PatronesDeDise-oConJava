package clase2;

public class PersonalDeBoleteriaAntiguo extends Personal {
	public PersonalDeBoleteriaAntiguo(String n){
		super(n);
	}
	
	public void firmarEntrada(){
		System.out.println("Personal de boleteria antiguo "+this.getNombre()+", llegando a trabajar. ");
	}

}