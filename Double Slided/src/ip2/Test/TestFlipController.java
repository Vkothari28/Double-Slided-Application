package ip2.Test;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.awt.event.MouseEvent;

import org.junit.Test;

import ip2.controller.FlipController;
import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;
import ip2.view.DoubleSlidedapp;

public class TestFlipController {
	
	@Test
	public void TestFunc() {
		
		Model model= new Model();
		DoubleSlidedapp app = new DoubleSlidedapp(model);
		
		FlipController f = new FlipController(app, model);
		MouseEvent e;
		Tile mytiles[]= new Tile[9];
		mytiles[0] =new Tile(1,4,false, new Location(0,0), Color.gray);
		mytiles[1] = new Tile(4,1,false, new Location(0,1), Color.gray);
		mytiles[2] = new Tile(3,2,false, new Location(0,2), Color.black);
		mytiles[3] = new Tile(2,3,false, new Location(1,0), Color.gray);
		mytiles[4] = new Tile(1,4,false, new Location(1,1), Color.gray);
		mytiles[5] = new Tile(2,3,false, new Location(1,2), Color.black);
		mytiles[6] = new Tile(3,2,false, new Location(2,0), Color.gray);
		mytiles[7] = new Tile(4,1,false, new Location(2,1), Color.gray);
		mytiles[8] = new Tile(' ',' ',false, new Location(2,2), Color.yellow);

		e= new MouseEvent(app, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0,150,250,1,false);
		f.mousePressed(e);
		
		assertEquals(model.getLocation(model.getTile(8)).row,1);
		assertEquals(model.getLocation(model.getTile(8)).col,2);
		
	}

}
