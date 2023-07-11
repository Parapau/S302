package N1E1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BorsaBro implements PropertyChangeListener {

	boolean borsa;
	
	public BorsaBro() {
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		setBorsa((boolean) evt.getNewValue());
	}
	
	public boolean isBorsa() {
		return borsa;
	}
	
	public void setBorsa(boolean borsa) {
		this.borsa = borsa;
	}
	
	public void status() {
		if (borsa) {
			System.out.println("Buah me estoy haciendo rico voy a usar este dinero para invertir en algo que seguro que no es una estafa piramidal");
		} else {
			System.out.println("Estoy perdiendo mi dinero, porque invertiria en esa estafa piramidal");
		}
	}
	
	
}
