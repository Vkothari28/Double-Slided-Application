package ip2.controller;

import java.awt.Color;

import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;
import ip2.view.DoubleSlidedapp;


	public class ResetController {
		/** Attributes **/
		Model model;
		DoubleSlidedapp app;
		
		/** Constructor **/
		public ResetController(Model m, DoubleSlidedapp a) {
			this.model = m;
			this.app = a;
		}
		
		//public void setTile(int tilenum, int firstnum,int secondnum,int LocationRow,int LocCol, int col) {
			
		
		public void resetPuzzle() {
			// Reset the puzzle
			
			
model.setTile(0, 1, 4, 0, 0, 0);
model.setTile(1, 4, 1, 0, 1, 0);
model.setTile(2, 3, 2, 0, 2, 1);
model.setTile(3, 2, 3, 1, 0, 0);
model.setTile(4, 1, 4, 1, 1, 0);
model.setTile(5, 2, 3, 1, 2, 1);
model.setTile(6, 3, 2, 2, 0, 0);
model.setTile(7, 4, 1, 2, 1, 0);
model.setTile(8, ' ', ' ', 2, 2, 2);

			
			
			model.resetCounter();
			app.setCounterText("Move Counter: " + String.valueOf(model.moves()));
			
			
			app.repaint();
		}
	}


