package ip2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ip2.controller.ExitController;
import ip2.model.Model;
import ip2.view.DoubleSlidedapp;
import ip2.controller.ExitController;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Model m= new Model();
final DoubleSlidedapp dsa = new DoubleSlidedapp(m);
 
dsa.addWindowListener(new WindowAdapter() {
	

	
		public void windowClosing(WindowEvent e) {
	if (new ExitController().confirm(dsa)) {
		dsa.dispose();
			}
		}      
	});

	dsa.setVisible(true);	
 
}
}
