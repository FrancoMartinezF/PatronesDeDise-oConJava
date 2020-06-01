package clase2;
import clase1.Locomotora;
import clase1.Vagon;

public interface TrenAbstractFactory {
	Locomotora crearLocomotora();
	Vagon crearVagon();
	Maquinista crearMaquinista(); 
}
