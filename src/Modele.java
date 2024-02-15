import java.awt.Color;
import java.util.ArrayList;

public class Modele {
	public static Color[] COULEURS = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	public static int N_TENTATIVES = 10;
	public static int DIFFICULTE = 4;
	enum Etat {EN_COURS,GAGNE,PERDU};
	
	Etat etat;
	Rangee combinaison;
	Rangee combinaisonInitiale;
	ArrayList<Rangee> propositions;
	int tentative;
	
	public Modele() {
		this.etat = Etat.EN_COURS;
		this.combinaisonInitiale = new Rangee();
		this.propositions = new ArrayList<>();
	}
	
	public String toString() {
		StringBuilder phrase = new StringBuilder();
		/*phrase.append("Derniere proposition : " + this.propositions.get(this.propositions.size()-1));*/
		phrase.append("\nRésultat : " + this.combinaisonInitiale);
		return phrase.toString();
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		
		System.out.println(m);
		
	}
	
	
}
