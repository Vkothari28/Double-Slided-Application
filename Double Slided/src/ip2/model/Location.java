package ip2.model;

public class Location {
	public final int row;
	public int col;

	public Location(int r, int c) {
		this.row= c;
		this.col=r;
		
	}
	
	public int getColumns() {
		return this.col;
	}
	
	public int getRows() {
		return this.row;
	}
}
