package ip2.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import ip2.view.PuzzleView;

public class Model {
	
	public Tile selected = null;
	public Tile mytiles[]=new Tile[9];
	public Tile  winningconfig[]= new Tile[9];
	PuzzleView puzzle;
	
	public int moveCount =0;
	
	 
	public Model() {
mytiles[0] =new Tile(1,4,false, new Location(0,0), Color.gray);
mytiles[1] = new Tile(4,1,false, new Location(0,1), Color.gray);
mytiles[2] = new Tile(3,2,false, new Location(0,2), Color.black);
mytiles[3] = new Tile(2,3,false, new Location(1,0), Color.gray);
mytiles[4] = new Tile(1,4,false, new Location(1,1), Color.gray);
mytiles[5] = new Tile(2,3,false, new Location(1,2), Color.black);
mytiles[6] = new Tile(3,2,false, new Location(2,0), Color.gray);
mytiles[7] = new Tile(4,1,false, new Location(2,1), Color.gray);
mytiles[8] = new Tile(' ',' ',false, new Location(2,2), Color.yellow);

 
}
	public Tile getTile(int x) {
		return mytiles[x];
	}
	public void resetCounter() {
		this.moveCount =0;
		
		// TODO Auto-generated method stub
		
	}
	
	public void incrementCounter() {
		this.moveCount += 1;
	}
	
	
	
	
	
	
	public int moves() {
		return this.moveCount;
	}


public void setTile(int tilenum, int firstnum,int secondnum,int LocationRow,int LocCol, int col) {
	
	if( col==0) {
	mytiles[tilenum]= new Tile(firstnum,secondnum,false, new Location(LocationRow,LocCol), Color.gray ) ;
	}
	
	else if(  col==1) {
		mytiles[tilenum]= new Tile(firstnum,secondnum,false, new Location(LocationRow,LocCol), Color.black ) ;
	}
	
	else if(  col==2) {
		mytiles[tilenum]= new Tile(firstnum,secondnum,false, new Location(LocationRow,LocCol), Color.yellow ) ;
	}
	
	else {
		return;
	}
}
	
	public int whattile(Location loc) {
		for (int x=0; x<9;  x++) {
			if (mytiles[x].location.row == loc.row && mytiles[x].location.col == loc.col) {
				return x;
			}
		}
		
		return 0 ; 
	}
	
	public PuzzleView getPuzzle () {
		return puzzle;
	}
	
	
	public Location getLocation(Tile tile ) {
		return tile.location;
	}
}
	


	
	
	
	// Return pieces using @return iterator of pieces
	




	
	
	



