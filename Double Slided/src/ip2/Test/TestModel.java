package ip2.Test;

import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;

public class TestModel {
Location here	= new Location(1,1);
	@Test
	public void TestIncrementmoves() {
	
		Model m= new Model();
		m.incrementCounter();
		assertEquals(m.moveCount, 1);
	}
	
	@Test
	public void  TestGetLocation() {
		Model mod = new Model();
		Tile mytiles[] = new Tile[9];
		mytiles[0] =new Tile(1,4,false, new Location(0,0), Color.gray);
		mytiles[1] = new Tile(4,1,false, new Location(0,1), Color.gray);
		mytiles[2] = new Tile(3,2,false, new Location(0,2), Color.black);
		mytiles[3] = new Tile(2,3,false, new Location(1,0), Color.gray);
		mytiles[4] = new Tile(1,4,false, new Location(1,1), Color.gray);
		mytiles[5] = new Tile(2,3,false, new Location(1,2), Color.black);
		mytiles[6] = new Tile(3,2,false, new Location(2,0), Color.gray);
		mytiles[7] = new Tile(4,1,false, new Location(2,1), Color.gray);
		mytiles[8] = new Tile(' ',' ',false, new Location(2,2), Color.yellow);

		 
		assertEquals(mod.getLocation(mytiles[0]).row, mod.mytiles[0].getLocation().row);
		assertEquals(mod.getLocation(mytiles[0]).col, 0);
		
		}
	@Test
	public void TestReset() {
		
		Model mod = new Model();
		
		mod.resetCounter();
		assertEquals(mod.moveCount,0);
	}
	
	@Test
	public void TestSetTile() {
		
		Model mod = new Model();
		Tile n =new Tile(0, 1,true, new Location(0,0), Color.gray ) ;
	 mod.setTile(0, 1, 1, 1, 1, 1);
	assertEquals( mod.mytiles[0].getColor(), Color.black);
	assertEquals((mod.mytiles[0].flipped), false);
	
	
	
	
	}
	
}




