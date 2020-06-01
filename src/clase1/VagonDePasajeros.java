package clase1;


public class VagonDePasajeros extends Vagon {
	
	int cantidadAsientos;
	Vagon primero, actual;
	int cantPasajeros=0;
	
	public VagonDePasajeros(String c, int asientos)
	{
		super(c);
		cantidadAsientos=asientos;
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
	
	public int getCantidadAsientos()
	{
		return cantidadAsientos;
	}
	
	public void setCantidadAsientos(int cant)
	{
		cantidadAsientos=cant;
		System.out.println("Este vagon tiene ahora: "+ cantidadAsientos +" asientos. ");
	}
	
	public String toString()
	{
		String msj="";
		
		if (siguienteVagon==null)
		{
			msj="Vagon de pasajeros con capacidad "+cantidadAsientos+" asientos. ";
			return msj;
		}
		else{
			msj="Vagon de pasajeros con capacidad "+cantidadAsientos+" asientos. "+siguienteVagon.toString();
			return msj;
		}
	}
	
	@Override
	public Vagon clonar(){
		if(this.getSiguienteVagon()==null){
			return null;
		}
		Enganchable v = (Enganchable) this.getSiguienteVagon().clonar();
		Vagon vagon = new VagonDePasajeros(this.getColor(), this.getCantidadAsientos());
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
	
	public void subo(){
		cantPasajeros++;
		System.out.println("En el vagon hay: "+cantPasajeros+" pasajeros. ");
	}
}
