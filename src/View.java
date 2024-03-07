import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class View extends Frame implements WindowListener{
	
	
	
	public View() {
		//test
		super();
		this.setLayout(new BorderLayout());
		
		this.addWindowListener(this);
	
		Graphic grid = new Graphic();
		this.add(grid);

		this.setTitle(" Mastermind alpha ");
		this.setResizable(false);
		this.setLocation(650, 100);
		



		
		this.pack();
		
		this.setVisible(true);
	}
	


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
