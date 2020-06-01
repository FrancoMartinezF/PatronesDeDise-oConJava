package Teoria7;

public interface Observado {
	void agregarObservador(Observador o);
	void quitarObservador(Observador o);
	void notificar();
}
