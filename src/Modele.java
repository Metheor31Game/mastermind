import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

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
	
	public void ajouterProposition(Rangee r) {
		/*Ne pas oublier de vérifier si il reste des tentatives, mais je sais pas si je l'ajoute maintenant ou non */
		if (this.tentative < Modele.N_TENTATIVES) {
			this.propositions.add(r);
			this.tentative-=1;
			// TODO Appel fonction de vérification
		} else {
			// TODO Appeler fonction de defaite
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
		/*phrase.append("Derniere proposition : " + this.propositions.get(this.propositions.size()-1));*/
		phrase.append("\nRésultat : " + this.combinaisonInitiale);
		phrase.append("\nPropositions : \n" + this.propositions.toString());
		return phrase.toString();
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		
		System.out.println(m);
		
		m.ajouterProposition(new Rangee(Color.yellow,Color.green,Color.blue,Color.red));
		
		System.out.println(m);
		
	}
	
	
}
