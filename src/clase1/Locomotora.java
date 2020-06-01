package clase1;
import clase2.Maquinista;
import clase3.Motor;
import clase3.PrototipoClonable;


public abstract class Locomotora implements Enganchable, PrototipoClonable
{
	int numero;
	Enganchable primerVagon;
	Maquinista maquinista;
	Motor motor;
	
	public Locomotora(int n, Maquinista m)
	{
		numero=n;
		maquinista=m;
		motor = new Motor();
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public void setNumero(int num)
	{
		numero=num;
	}
	
	public Enganchable getPrimerVagon(){
		return primerVagon;
	}
	
	public void setPrimerVagon(Enganchable e){
		primerVagon = e;
	}
	
	public void enganchar(Enganchable v)
	{
		primerVagon=v;
		System.out.println("Enganchando a la locomotora  "+v.toString());
	}
	
	public void desenganchar()
	{
		primerVagon=null;
	}
	
	public String toString()
	{
		String msj="Locomotora numero "+numero+". "+ primerVagon.toString();
		return msj;
	}
	
	public void encenderMotor()
	{
		
	}
	
	public void enMarcha()
	{
		
	}
	
	public void setMaquinista(Maquinista m)
	{
		maquinista=m;
	}
	
	public Maquinista getMaquinista(){
		return maquinista;
	}
	
	public Motor getMotor(){
		return motor;
	}
	
	public void setMotor(Motor m){
		motor = m;
	}
	
	public abstract Locomotora clonar();
	
	public void reportarEstado(){
		System.out.println("La locomotora anda bien. ");
	}
	
	public void recargarCombustible(){
		System.out.println("Recargando combustible. ");
	}

	
}
