package clase3;

import clase2.Estacion;

public abstract class ConstructorDeEscenarioAbstracto {
	protected RedFerroviaria rf;

	public void construirRedFerroviara(){
		rf = RedFerroviaria.getInstance();
	}

	public RedFerroviaria obtenerRedFerroviaria(){
		return rf;
	}
	
	public abstract Estacion construirEstacion(String nombre);
	
	public abstract Via construirVia(double l);
	
	public abstract Tunel construirTunel(double l);
}
