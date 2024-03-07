import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public class Graphic extends Canvas {
	
	public Graphic() {
		super();
		//test
		this.setPreferredSize(new Dimension(600,800));
		
	}
	
	public void paint(Graphics g) {
		
		int originX = 75; 
		int originY = 750;
		int delta = 60;
		int taille = 40;
		for(int i = 0; i<Modele.COULEURS.length; i++) {
			g.setColor(Modele.COULEURS[i]);
			g.fillRect(originX+i*delta, originY, taille, taille);
		}
		
	}
	

}
