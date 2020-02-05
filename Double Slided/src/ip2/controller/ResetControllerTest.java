package ip2.controller;

import static org.junit.Assert.assertEquals;

import java.awt.event.MouseEvent;

import org.junit.Before;
import org.junit.Test;

import ip2.model.Model;
import ip2.model.Tile;
import ip2.view.DoubleSlidedapp;

public class ResetControllerTest {
	DoubleSlidedapp app;
	Model model;
	
	@Before
	public void setup () {
		;
		app = new DoubleSlidedapp(model);
	}
	
	@Test
	public void testMove () {
		FlipController tileMover = new FlipController(app, model);
		tileMover.mousePressed(new MouseEvent(app.getPanel(), 0, 0, 0, 50, 50, 1, false));
		
		// Nothing happens, clicked unmoveable tile
		assertEquals(model.moves(), model.moveCount);
		
		// Click inbetween tiles
		tileMover.mousePressed(new MouseEvent(app.getPanel(), 0, 0, 0, 115, 200, 1, false));
		
		int x= model.moves();
		assertEquals(x,0 );
		
		// Click on moveable tile
		Tile tile = model.getTile(7);
		tileMover.mousePressed(new MouseEvent(app.getPanel(), 0, 0, 0, 121, 250, 1, false));
		assertEquals(model.moves(), 1);
		assertEquals(tile, model.getTile(6));
	}
}


