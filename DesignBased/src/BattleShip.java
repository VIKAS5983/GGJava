
public class BattleShip {
	private boolean destroyed=false;
	
	private char shipType;
	
	private Cell dimention;
	
	private int length;
	
	private int width;
	
	public BattleShip(char shipType,String dimension,int length,int width){
		this.setDestroyed(false);
		this.setShipType(shipType);
		this.setDimention(dimension);
		this.setLength(length);
		this.setWidth(width);
	}
	public int getShipTypeStrength(){
		if(shipType=='P')
			return 1;
		
		if(shipType=='Q')
			return 2;
		return -1;
	}
	
	public boolean isDistroyed(){
		return destroyed;
	}
	
	public char shipType(){
		return shipType;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public char getShipType() {
		return shipType;
	}

	public void setShipType(char shipType) {
		this.shipType = shipType;
	}

	public Cell getDimention() {
		return dimention;
	}

	//A1
	public void setDimention(String str) {
		char row=str.charAt(0);
		int column=str.charAt(1)-'1';
	//	System.out.println("Dimension " + row+" : "+ column );
		this.dimention = new Cell(row, column);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
	
}
