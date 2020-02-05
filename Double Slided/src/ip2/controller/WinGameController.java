package ip2.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ip2.model.Location;
import ip2.model.Model;
import ip2.model.Tile;
import ip2.view.DoubleSlidedapp;

public class WinGameController extends MouseAdapter {
	
	Model model;
	DoubleSlidedapp dsa;
	Tile[] winning = new Tile[9];
	
	
	
	public WinGameController(Model m, DoubleSlidedapp a) {
		
		this.dsa= a;
		this.model=m;
		
		winning[0]= new Tile(1,4,false,new Location(0,0), Color.gray);
		winning[1]= new Tile(2,3, false, new Location(1,0), Color.gray) ;
		winning[2]= new Tile(3,2, false, new Location(2,0), Color.gray) ;
		winning[3]= new Tile(4,1, false, new Location(0,1), Color.gray) ;
		winning[4]= new Tile(' ',' ', false, new Location(1,1), Color.gray) ;
		winning[5]= new Tile(4,1, true, new Location(2,1), Color.gray) ;
		winning[6]= new Tile(3,2, true, new Location(0,2), Color.gray) ;
		winning[7]= new Tile(2,3, true, new Location(1,2), Color.gray) ;
		winning[8]= new Tile(1,4, true, new Location(2,2), Color.gray) ;
		
		
		
		
		
		
		
				
	}
	
	public void mousePressed(MouseEvent e) {
		Tile[]checker = new Tile[9];
		 
		checker[0]=model.getTile(model.whattile(new Location(0,0)));
		checker[1]=  model.getTile(model.whattile (new Location(1,0)));
		checker[2]=  model.getTile(model.whattile (new Location(2,0)));
		checker[3]=  model.getTile(model.whattile (new Location(0,1)));
		checker[4]=  model.getTile(model.whattile (new Location(1,1)));
		checker[5]=  model.getTile(model.whattile (new Location(2,1)));
		checker[6]=  model.getTile(model.whattile (new Location(0,2)));
		checker[7]=  model.getTile(model.whattile (new Location(1,2)));
		checker[8]=  model.getTile(model.whattile (new Location(2,2)));
		
		if(winner(0,checker) && winner(1,checker)&& winner(2,checker)&& winner(3, checker)&&winner(4, checker)&& winner(5, checker)&&winner(6, checker)&&winner(7, checker)&&winner(8, checker)) {
		System.out.println(" Winner Winner Chicken Dinner");	
		
		dsa.setEnabled(false);
		}
		
		else if(loser(checker)) {
			System.out.println(" Can't beat an easy game, sucker");
			
			
		}
		else {
			
			System.out.println("Keep trying");
			
			
			
			
			
		}
	}
	public boolean winner(int f, Tile []checker) {
		
		
	if(checker[f].up==winning[f].up &&checker[f].getColor()==winning[f].getColor()) {
		return true; 
		
	}
	
	return false;
	}
	

	public boolean loser(Tile checker[]) {
		
		int checkingones=0;
		int checkingtwos=0;
		int threecheck=0;
		int fourcheck=0;
		
		for(int i=0; i<9; i++) {
			
		
		if(checker[i].up== 1) {
			checkingones += checkingones;
	}
		else if(checker[i].up ==2){
			checkingtwos += checkingtwos;
		}
		
		else if(checker[i].up==3) {
			threecheck += threecheck;
		}
		
		else if(checker[i].up == 4) {
			
			fourcheck += fourcheck;
			
		}
		}
		
		if(checkingones <4 | checkingtwos <4 | threecheck <4 | fourcheck <4) {
			
			return true;
		
		
			
		}
		
		return false;
		}
	
	
public void GameWon(){
	
	
	return;
}

}
