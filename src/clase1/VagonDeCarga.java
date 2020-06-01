package clase1;

public class VagonDeCarga extends Vagon {
	
	String tipoDeCarga;
	Vagon primero, actual;
	
	public VagonDeCarga(String c, String carga)
	{
		super(c);
		tipoDeCarga=carga;
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
	
	public String getTipoDeCarga()
	{
		return tipoDeCarga;
	}
	
	public void setTipoDeCarga(String carganueva)
	{
		tipoDeCarga=carganueva;
		System.out.println("La nueva carga del vagón es: "+tipoDeCarga);
	}
	
	public String toString()
	{
		String msj="";
		if (siguienteVagon==null)
		{
			msj="Vagon de carga del tipo "+tipoDeCarga+". ";
			return msj;
		}
		else{
			msj="Vagon de carga del tipo "+tipoDeCarga+". "+siguienteVagon.toString();
			return msj;
		}
	}
	
	@Override
	public Vagon clonar(){
		Enganchable v = (Enganchable) this.getSiguienteVagon().clonar();
		Vagon vagon = new VagonDeCarga(this.getColor(), this.getTipoDeCarga());
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
