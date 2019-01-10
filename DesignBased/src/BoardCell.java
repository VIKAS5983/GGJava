
public class BoardCell {

	int strength;
	BattleShip b;
	
	public void setShip(BattleShip ship) {
		this.b=ship;
		this.strength=ship.getShipTypeStrength();
	}
	
	public int getStrength(){
		return strength;
	}
	
	public void hit(){
		this.strength=this.strength-1;
		
	}

	public BattleShip getShip() {
		return b;
	}
	


}
