import java.awt.Color;
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
