package clase2;
import clase1.Enganchable;
import clase1.Locomotora;
import clase3.Motor;

public class LocomotoraAVapor extends Locomotora {
	public LocomotoraAVapor(int num, Maquinista maq){
		super(num,maq);
	}
	
	public void encenderMotor(){
		System.out.println("Caldera antigua preparada. ");
	}
	
	public void enMarcha()
	{
		//maquinista.estoyListo();
		System.out.println("Quemando carbón. ");
	}
	
	@Override
	public Locomotora clonar(){
		Maquinista maq = this.getMaquinista().clonar();
		Motor mot = this.getMotor().clonar();
		Enganchable en = (Enganchable) this.getPrimerVagon().clonar();
		Locomotora loco = new LocomotoraAVapor(this.getNumero(), maq);
		loco.setMotor(mot);
		loco.setPrimerVagon(en);
		return loco;
	}
	

}
