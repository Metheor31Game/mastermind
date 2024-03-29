import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Modele {
	public static Color[] COULEURS = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	public static int N_TENTATIVES = 10;
	public static int DIFFICULTE = 4;
	enum Etat {EN_COURS,GAGNE,PERDU};
	
	Etat etat;
	Rangee combinaison; //combinaison actuelle : devient une proposition quand la combinaison est terminee
	Rangee combinaisonInitiale; // combinaison solution
	ArrayList<Rangee> propositions; // liste des propositions / combinaisons du joueur
	int tentative; //Nombre de tentatives : commence a 0
	
	public Modele() {
		this.etat = Etat.EN_COURS;
		this.combinaisonInitiale = new Rangee(true);
		this.propositions = new ArrayList<>();
		this.combinaison = new Rangee();
		this.tentative = Modele.N_TENTATIVES;
	}
	
	public void ajouterProposition(Color c) {
		if (this.combinaison.ajouterCouleur(c)) {
			this.propositions.add(combinaison);
			this.combinaison = new Rangee();
			this.tentative--;
		}
	}
	
	public Color[] verifierProposition() {
		Color[] correction = {null,null,null,null};
		int indice = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (this.propositions.get(this.propositions.size()-1).equals(this.combinaisonInitiale)) {
					if (i == j) {
						correction[indice] = Color.white;
					} else {
						correction[indice] = Color.black;
						
					}
				indice++;
				}
			}
		}
		return correction;
	}
	
	public String toString() {
		StringBuilder phrase = new StringBuilder();
		phrase.append("\nRésultat : " + this.combinaisonInitiale);
		phrase.append("\nPropositions : \n" + this.propositions.toString());
		return phrase.toString();
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		View v = new View();
		System.out.println(m);
		
		m.ajouterProposition(Color.black);
		m.ajouterProposition(Color.white);
		
		System.out.println(m);
		
		m.ajouterProposition(Color.black);
		m.ajouterProposition(Color.white);
		
		System.out.println(m);
		
		m.ajouterProposition(Color.red);
		m.ajouterProposition(Color.red);
		m.ajouterProposition(Color.red);
		m.ajouterProposition(Color.red);
		
		System.out.println(m);
		
	}
	
	
}
