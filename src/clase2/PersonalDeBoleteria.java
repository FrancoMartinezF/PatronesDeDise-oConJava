package clase2;

public class PersonalDeBoleteria extends Personal {
	public PersonalDeBoleteria(String n){
		super(n);
	}
	
	public void firmarEntrada(){
		System.out.println("Personal de boleteria "+this.getNombre()+", llegando a trabajar. ");
	}

}
