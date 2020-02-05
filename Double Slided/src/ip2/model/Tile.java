package ip2.model;

import java.awt.Color;

public class Tile {
  public  int up;
  public int down;
 public boolean flipped;
Location location;
public Color tilecolor;

public Tile(int up, int down, boolean flipped, Location location, Color tilecolor) {
this.up= up;
this.down= down;
this.flipped= false;
this.location =location;
this.tilecolor=tilecolor;

}
public void setlocation(Location loc) {
	location=loc;
}

public Location getLocation() {
	return location;
}

public int VisibleDigit() {
	if(up== ' ' || down == ' ') {
return 0;		
	}
	else {
		return up;
	}
	
}

public Color getColor() {
	return this.tilecolor;
}
public Color digitColor() {
	if(tilecolor ==Color.black) {
		return Color.white;
	}
	else if(tilecolor== Color.gray) {
		return Color.black;
		
	}
	return Color.yellow;
	

}

public Tile FlipTile(Tile t) {

	int startup = t.up;
	int startdown =t.down;
	t.up= 5- startup;
	t.down = 5- startdown;
	//t.flipped = !(t.flipped);
	if(t.flipped == false) {
		t.flipped = true; 
	}
	else {
		t.flipped= false;
	}
	
		if(t.getColor()==Color.black) {
			t.tilecolor = Color.gray;
			
		}
		
		else if(t.getColor()==Color.gray) {
			t.tilecolor=Color.black;
		}
		
		else {
			t.tilecolor =Color.yellow;
		}
		
		return t;
	}




}