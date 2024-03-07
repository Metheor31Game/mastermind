import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public class Graphic extends Canvas {
	
	public Graphic() {
		super();
		this.setPreferredSize(new Dimension(600,800));
		
	}
	
	public void paint(Graphics g) {
		
		
		g.drawRect(0, 0, 25, 25);
		
	}
	

}
