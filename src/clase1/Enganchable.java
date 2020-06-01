package clase1;

import clase3.PrototipoClonable;

public interface Enganchable {
	void enganchar(Enganchable e);
	void desenganchar();
	PrototipoClonable clonar();
	public void reportarEstado();
}
