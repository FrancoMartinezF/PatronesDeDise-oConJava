package clase2;

public abstract class FabricaDeEstacion {
	
	public static Estacion crearEstacion(int cualEstacion){
		FabricaDeEstacion fabricaDeEstaciones = null;
		
		switch(cualEstacion){
		case 1:
			fabricaDeEstaciones = new FabricaDeEstacionDePasajeros();
			break;
		case 2:
			fabricaDeEstaciones = new FabricaDeEstacionDeCarga();
			break;
		case 3: 
			fabricaDeEstaciones = new FabricaDeEstacionAntigua();
			break;
		}
		
		return fabricaDeEstaciones.crearEstacion();
		
	}
	
	public abstract Estacion crearEstacion();
}
