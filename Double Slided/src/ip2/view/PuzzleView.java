package ip2.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;

public class PuzzleView extends JPanel {
	
	 Model model= new Model();

	public PuzzleView(Model model) {
		this.model= model;
	}

	/**
	 * Create the panel.
	 * @return 
	 */
	public void paintComponent(Graphics g) {
		
		g.setFont(new Font("Comic Sans MS",Font.PLAIN,40));
		//g.drawString(""+ 18, 100, 100);
	if(model==null) {return;}	
	for(int checker=0; checker<9;checker++) {
	Tile t =model.getTile(checker);
	int num = t.VisibleDigit();
	Location loc = t.getLocation();
	
	int x= 100*loc.row;
	int y= 100*loc.col;
	g.setColor(t.getColor());
	g.fillRect(x, y, 99, 99);
	g.setColor(t.digitColor());
	g.drawString(""+ num, x+35, y+70);
	
	
	}
	
	
	}
	
}
