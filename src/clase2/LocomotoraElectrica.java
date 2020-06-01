package clase2;
import clase1.Enganchable;
import clase1.Locomotora;
import clase3.Motor;

public class LocomotoraElectrica extends Locomotora {
	
	public LocomotoraElectrica(int n, Maquinista m)
	{
		super(n,m);
	}
	
	public void encenderMotor(){
		System.out.println("Electrica enchufada. ");
	}
	
	public void enMarcha()
	{
		//maquinista.estoyListo();
		System.out.println("Consumiendo electricidad. ");
	}
	
	@Override
	public Locomotora clonar(){
		Maquinista maq = this.getMaquinista().clonar();
		Motor mot = this.getMotor().clonar();
		Enganchable en = (Enganchable) this.getPrimerVagon().clonar();
		Locomotora loco = new LocomotoraElectrica(this.getNumero(), maq);
		loco.setMotor(mot);
		loco.setPrimerVagon(en);
		return loco;
	}
	
}
