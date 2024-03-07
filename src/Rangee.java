import java.awt.Color;
import java.util.Iterator;
import java.util.Random;

public class Rangee {
	
	public Color[] jetons = new Color[Modele.DIFFICULTE];
	public int indiceJeton;
	public Color[] resultat = new Color[Modele.DIFFICULTE];
	
	public Rangee() {
		this.indiceJeton = 0;
		Random r = new Random();
		for (int i = 0; i < Modele.DIFFICULTE; i++) {
			this.jetons[i] = Modele.COULEURS[r.nextInt(0,Modele.COULEURS.length)];
		}
	}
	
	public Rangee(Color c1, Color c2, Color c3, Color c4) {
		this.jetons[0] = c1;
		this.jetons[1] = c2;
		this.jetons[2] = c3;
		this.jetons[3] = c4;
	}
	
	public boolean Rangee(Color c) {
		if (this.indiceJeton == 4) {
			return false; //Signifie qu'il faut créer une nouvelle rangée
		} else {
			this.jetons[this.indiceJeton] = c;
			this.indiceJeton++;
			return true;
		}
	}
	
	public String toString() {
		StringBuilder phrase = new StringBuilder();
		for (int i = 0; i < Modele.DIFFICULTE; i++) {
			phrase.append(" | " + this.jetons[i]);
		}
		phrase.append(" | ");
		return phrase.toString();
	}

	

}
