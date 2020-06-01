package clase2;
import clase1.Enganchable;
import clase1.Vagon;

public class VagonDePasajerosAntiguo extends Vagon {
	
	Enganchable siguientevagon;
	Vagon primero, actual;
	
	public VagonDePasajerosAntiguo(String color){
		super(color);
	}
	
	public void enganchar(Enganchable v)
	{
		super.enganchar(v);
		System.out.println("Enganchando "+v.toString());
	}
	
	public void desenganchar()
	{
		super.desenganchar();
	}
	
	
	public String toString()
	{
		String msj="";
		
		if (siguientevagon==null)
		{
			msj="Vagon de pasajeros antiguo. ";
			return msj;
		}
		else{
			msj="Vagon de pasajeros antiguo. "+siguientevagon.toString();
			return msj;
		}
	}
	
	@Override
	public Vagon clonar(){
		Enganchable v = (Enganchable) this.getSiguienteVagon().clonar();
		Vagon vagon = new VagonDePasajerosAntiguo(this.getColor());
		vagon.setSiguienteVagon(v);
		return vagon;
	}
	
	public void primero(){
		actual = primero;
	}
	public void siguiente(){
		actual = (Vagon) actual.getSiguienteVagon();
	}
	public boolean fin(){
		return actual == null;
	}
	public Iterable actual(){
		return (Iterable) actual;
	}
}
