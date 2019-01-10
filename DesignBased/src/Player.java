import java.util.ArrayList;


public class Player {

	Board b1;
	String[] firingPositions;
	int chancesUsed=0;
	
	public  boolean won=false;
	
	public boolean isWon(){
		return won;
	}
	public Player(String name, Board b1){
		this.b1=b1;
	}
	
	public Board getBoard(){
		return b1;
	}
	
	public void setFiringPositions(String firing){
		firingPositions=firing.split(" ");
	}
	
	
	public boolean fire(Player pObj){
		
		String position=firingPositions[chancesUsed];
		System.out.println("position x: y "+ position.charAt(0) +" : "+ (position.charAt(1)-'0') );
		pObj.getBoard().isTargethit(position.charAt(0), position.charAt(1)-'1');

		 if(pObj.getBoard().isAllDestroyed()){
			 this.won=true;
		 }
		 
		chancesUsed++;
		return false;
	}
	
}
