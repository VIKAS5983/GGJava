import java.util.ArrayList;
import java.util.Arrays;


public class Board {

	private int width;
	private int height;
	
	ArrayList<BattleShip> allBattleShips=new ArrayList<BattleShip>();
	
	BoardCell[][] map;
	
	public boolean destroyedAll=false;
	
	public boolean isAllDestroyed(){
		return destroyedAll;
	}
	
	public void addBattleShip(BattleShip ship){
		this.allBattleShips.add(ship);
		
		int startWidth=ship.getDimention().getRow()-'A';
		int startHeight=ship.getDimention().getColumn();
		
//		System.out.println("startWidth " + startWidth);
//		System.out.println("startHeight " + startHeight);

		for(int i=0;i<ship.getLength();i++){
			for(int j=0;j<ship.getWidth();j++){
				this.map[startHeight+j][i+startWidth]= new BoardCell();
				this.map[startHeight+j][i+startWidth].setShip(ship);
			}
		}
	}
	
	public BoardCell[][] getBoardMap(){
		return map;
	}
	
	public Board(char ch,int h){
		
		this.width=ch-'A';
		this.height=h;
		map=new BoardCell[this.width][this.height];
	}
	
	public boolean isTargethit(char ch, int j){
		int i=ch-'A';
		if(map[i][j].getStrength()==1 || map[i][j].getStrength()==2){
			
			map[i][j].hit();
			
			if(map[i][j].getStrength()==0)
				updateDestroyedStatus(map[i][j].getShip(),map);

			return true;
		}
		
		return false;
	}
	
	
	public  void updateDestroyedStatus(BattleShip bs,BoardCell[][] map){

		for(int i=0;i<bs.getLength();i++){
			for(int j=0;j<bs.getWidth();j++)
				if(map[bs.getDimention().getRow()-'A'][bs.getDimention().getColumn()].getStrength()!=0)
					return ;
		}
		bs.setDestroyed(true);
		
		for(int i=0;i<allBattleShips.size();i++){
			if(!allBattleShips.get(i).isDestroyed())
				return ;
		}
		this.destroyedAll=true;
	}
	
}
