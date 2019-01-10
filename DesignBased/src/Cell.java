
public class Cell {

	private char row;
	private int column;

	public Cell(char row, int column){
		this.row=row;
		this.column=column;
	}
	
	public char getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public String toString(){
		
		return row+""+column;
	}
	
}
