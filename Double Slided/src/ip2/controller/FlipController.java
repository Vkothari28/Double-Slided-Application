package ip2.controller;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;
import ip2.view.DoubleSlidedapp;
//import ip2.view.DoubleSlidedapp;

public class FlipController extends MouseAdapter {
	Model model;
	DoubleSlidedapp app;
	
	public FlipController(DoubleSlidedapp app, Model m) {
		this.app= app;
		this.model=m;
		
	
	}
	 @Override
	public void mousePressed(MouseEvent me) {
		 
		 int clx =  (me.getX()/100);
		 
		 int cly = (me.getY()/100); 
		
		if(me.getX()>= 0 && me.getX()<=100 && me.getY()>= 0 && me.getY()<=100) {
			
			 Tile newtile = model.getTile(0);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);  
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			int lX= ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			Tile nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile now = model.getTile(model.whattile(new Location(cly,clx)));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY, uX)));
			
			if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
		
			
			
		
			
		
		
		
		app.repaint();
		System.out.println(newtile.VisibleDigit());
		}
		
		
		if(me.getX()>= 0 && me.getX()<=100 && me.getY()>= 101 && me.getY()<=200) {
			
			Tile newtile = model.getTile(1);
			
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int lX= ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			
			
			
			Tile nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile now = model.getTile(model.whattile(new Location(cly,clx)));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY , uX)));
			
			if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
		if(me.getX()>= 0 && me.getX()<=100 && me.getY()>= 201 && me.getY()<=300) {
			Tile newtile = model.getTile(2);
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			
			Tile nextToRight =model.getTile(model.whattile(new Location(rY , rX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY , uX)));
			
			
			
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile now = model.getTile(model.whattile(new Location((me.getY()/100),((me.getX()/100)))));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			
			if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now); 
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			
			}
			
			else if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			
			}
			else if( upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			
			}
			
			
			
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
		if(me.getX()>= 101 && me.getX()<=200 && me.getY()>= 0 && me.getY()<=100) {
			Tile newtile = model.getTile(3);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			
			Tile nextToLeft = model.getTile(model.whattile(new Location(lY, lX)));
			Tile nextToRight =model.getTile(model.whattile(new Location(rY , rX)));
			Tile now = model.getTile(model.whattile(new Location((me.getY()/100),((me.getX()/100)))));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			nextToRight =model.getTile(model.whattile(new Location(rY , rX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY , uX)));
			
			if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
			
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
				
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
				
			}
			
			else if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			
			}
					
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
		if(me.getX()>= 101 && me.getX()<=200 && me.getY()>= 101 && me.getY()<=200) {
			
			Tile newtile = model.getTile(4);
			
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			Tile nextToRight =model.getTile(model.whattile(new Location(rY , rX)));
			Tile now = model.getTile(model.whattile(new Location((me.getY()/100),((me.getX()/100)))));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY , uX)));
			
			
			
			if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
			
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
				
			}
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
			
			

		
		if(me.getX()>= 101 && me.getX()<=200 && me.getY()>= 201 && me.getY()<=300) {
			Tile newtile = model.getTile(5);
			
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);

			Tile nextToRight =model.getTile(model.whattile(new Location(rY , rX)));
			
			
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile now = model.getTile(model.whattile(new Location((me.getY()/100),((me.getX()/100)))));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY , uX)));
			
			
			if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			else if(nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			
		
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
		
		if(me.getX()>= 201 && me.getX()<=300 && me.getY()>= 0 && me.getY()<=100) {
			
			
			Tile newtile = model.getTile(6);
			
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));

			Tile nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile now = model.getTile(model.whattile(new Location((me.getY()/100),((me.getX()/100)))));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY, uX)));
			
			if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			else if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location (cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				upHi.setlocation(new Location(cly, clx));
			
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
	
		
		if(me.getX()>= 201 && me.getX()<=300 && me.getY()>= 101 && me.getY()<=200) {
			
			Tile newtile = model.getTile(7);
			
			
			
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			int uX = (me.getX()/100);
			int uY = ((me.getY()-100)/100);
			Tile nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			Tile now = model.getTile(model.whattile(new Location((me.getY()/100),((me.getX()/100)))));
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile upHi= model.getTile(model.whattile(new Location(uY, uX)));
			
			
			
			if( nextToRight.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToRight.getLocation());
				nextToRight.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
		
if(me.getX()>= 201 && me.getX()<=300 && me.getY()>= 201 && me.getY()<=300) {
			
			Tile newtile = model.getTile(8);
			
			int rX = ((me.getX()+100)/100);
			int rY = (me.getY()/100);
			int lX = ((me.getX()-100)/100);
			int lY = (me.getY()/100);
			int uX = ((me.getX())/100);
			int uY = ((me.getY()+100)/100);
			int loX = (me.getX()/100);
			int loY = ((me.getY()+100)/100);
			Tile downLo= model.getTile(model.whattile(new Location(loY, loX)));
			
			Tile nextToLeft =model.getTile(model.whattile(new Location(lY, lX)));
			Tile now = model.getTile(model.whattile(new Location((me.getX()/100),((me.getY()/100)))));
			Tile upHi= model.getTile(model.whattile(new Location(uY , uX)));
			Tile nextToRight =model.getTile(model.whattile(new Location(rY, rX)));
			
			if( nextToLeft.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(nextToLeft.getLocation());
				nextToLeft.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
			
			else if(nextToRight.getColor()==Color.yellow) {
					now.FlipTile(now);
					now.setlocation(nextToRight.getLocation());
					nextToRight.setlocation(new Location(cly, clx));
					
					model.incrementCounter();
					app.setCounterText("Move Count: " + String.valueOf(model.moves()));
					app.repaint();
				}
			
			else if(downLo.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(downLo.getLocation());
				downLo.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
			}
		
			
			else if(upHi.getColor()==Color.yellow) {
				now.FlipTile(now);
				now.setlocation(upHi.getLocation());
				upHi.setlocation(new Location(cly, clx));
				
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				app.repaint();
				
			}
			
			app.repaint();
			System.out.println(newtile.VisibleDigit());
			}
		
		
		
	}
	 
	/* public boolean movePiece(String eventType) {
			Tile tile = model.getSelected();
			if (canMove(tile, eventType)) {
				if (eventType == "RIGHT") {
					Location loc= new Location(tile.getLocation().getRows() + 1, tile.getLocation().getColumns());
					tile.setlocation(loc);

				} else if (eventType == "LEFT") {
					Location loc= new Location (tile.getLocation().getRows() - 1, tile.getLocation().getColumns());
					tile.setlocation(loc);

				} else if (eventType == "UP") {
					Location loc= new Location(tile.getLocation().getRows(), tile.getLocation().getColumns() - 1);
					tile.setlocation(loc);
				} else if (eventType == "DOWN") {
					Location loc= new Location(tile.getLocation().getRows(), tile.getLocation().getColumns() + 1)  ;
								
					tile.setlocation(loc);
				}
				// Update the move counter
				model.incrementCounter();
				app.setCounterText("Move Count: " + String.valueOf(model.moves()));
				// Update the display
				app.repaint();
				return true;
			}
			return false;
		}

	private boolean canMove(Tile tile, String eventType) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean openSpot(int j, int x, int y) {
		// Create an iterator to search through the pieces to see if one occupies the requested spot
		Tile newTile= model.getTile(j) ;
		Location newlocation = newTile.getLocation() ;
		if ( newlocation.getRows() == x && newlocation.getColumns()== y ) {
		return true;
		
		}
		else {
		return false;
		}
			
	}
	*/

}


