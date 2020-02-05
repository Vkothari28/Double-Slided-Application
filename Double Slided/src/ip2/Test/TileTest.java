package ip2.Test;

import static org.junit.Assert.*;

import java.awt.Color;

import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;

import org.junit.Test;


public class TileTest {
	
	Tile newtile = new Tile(4,1,false,null,Color.black);
     Tile flip = new Tile(1,4,true,null, Color.gray);
   Tile test=  new Tile(1,4,false, new Location(0,0), Color.gray);
     Model m;
     
    Location testlocation = new Location(1,0);
     
     
     
	@Test
	public void test() {
	 Tile s = newtile.FlipTile(newtile); 	
  
		assertEquals(s.getColor(),flip.getColor());
	}
	
	@Test
	public void test2() {
		
		Tile s = newtile.FlipTile(newtile);
		assertEquals(s.flipped, (true));
		
		

}
	
	
	
	@Test
	public void testfindup() {
		Model ma;
		 
		newtile.up = 1;
		assertEquals(newtile.up, 1);
	}
	
	@Test
	public void testfinddown() {
		 newtile.down = 4;
		 assertEquals(newtile.down,4);
	}
	@Test
	public void testColor() {
		
		newtile.setlocation(testlocation);
		
		assertEquals(newtile.getLocation(), testlocation );
	}
	
	@Test 
	
	public void testColorReal() {
		
		Tile newl = new Tile(1,4, false, new Location(1,0),Color.black );
		
		assertEquals(newl.getColor(), Color.black);
	}
	
	
	@Test
	public void testDigitColor() {
	assertEquals(newtile.VisibleDigit(), (Color.white));
	}
	
	
	
	
	
	
	
	
}
