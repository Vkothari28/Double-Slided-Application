package ip2.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;




import javax.swing.JOptionPane;

import ip2.view.DoubleSlidedapp;

public class ExitController {
	public boolean confirm(DoubleSlidedapp app) {
		return JOptionPane.showConfirmDialog (app, "Do you wish to exit Application?") == JOptionPane.OK_OPTION;	
	}
}



