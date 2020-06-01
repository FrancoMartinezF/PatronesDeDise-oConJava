package clase5;

import clase1.Tren;
import clase2.Anden;
import clase2.Personal;
import clase3.Conectable;
import clase3.TrenClonable;

public interface IEstacion {
	void llegaUnTren(Tren t);
	void agregarConexion(Conectable c);
	void agregarPersonal(Personal p);
	void agregarAnden(Anden a);
	void saleUnTren(int n);
	String getNombre();
	void setNombre(String n);
	void asignarTren(TrenClonable tc);
	void partidaDelTren();
	void enViaje(Tren t);
	void saleTren(Tren t);
	Double getLongitud();
}
