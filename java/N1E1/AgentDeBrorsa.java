package N1E1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AgentDeBrorsa {
	private boolean borsa;
	private PropertyChangeSupport suport;
	
	AgentDeBrorsa() {
		this.suport = new PropertyChangeSupport(this);
	}
	
	public void escoltadorNou(PropertyChangeListener escoltador) {
		suport.addPropertyChangeListener(escoltador);
	}
	
	public void escoltadorFora(PropertyChangeListener escoltador) {
		suport.removePropertyChangeListener(escoltador);
	}
	
	public boolean getBorsa() {
		return this.borsa;
	}
	
	public void setBorsa(boolean borsaNova) {
		suport.firePropertyChange("a", this.borsa, borsaNova);
		this.borsa = borsaNova;
	}
	
	
}
