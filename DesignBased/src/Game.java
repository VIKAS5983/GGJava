import java.util.Scanner;


public class Game {
	
	public static void main(String args[]){
	
		/*
		 * 
5 E
2
Q 1 1 A1 B2
P 2 1 D4 C3
A1 B2 B2 B3
A1 B2 B3 A1 D1 E1 D4 D4 D5 D5*/
		
		Scanner sc=new Scanner(System.in);
		
		int boardLength=sc.nextInt();
		char boardHeight=sc.next().charAt(0);
		
		//System.out.println(boardHeight+" : "+ boardLength);
		Player p1= new Player("P1",new Board(boardHeight, boardLength));
		Player p2= new Player("P2", new Board(boardHeight, boardLength));
		
		int nBattleShips=sc.nextInt();
		
	//	System.out.println("BattleShips " + nBattleShips);
		sc.nextLine();
		for(int i=0;i<nBattleShips;i++){
			String str1=sc.nextLine();
			//System.out.println("str1 "+str1);
			addBattleShipToPlayers(p1, p2, str1);
		}
		
		p1.setFiringPositions(sc.nextLine());
		p2.setFiringPositions(sc.nextLine());
		
		startGame(p1,p2);
	}
	
	public static void startGame(Player p1, Player p2){
		
		
	}
	
	public static  void addBattleShipToPlayers(Player p1, Player p2,String str){
		
		char shipType1=str.split(" ")[0].charAt(0);
		int l=Integer.parseInt(str.split(" ")[1]);
		int w=Integer.parseInt(str.split(" ")[2]);
		String locationbs1=str.split(" ")[3];
		String locationbs2=str.split(" ")[4];		
		
		BattleShip bs1=new BattleShip(shipType1, locationbs1, l, w);
		BattleShip bs2=new BattleShip(shipType1, locationbs2, l, w);
		
		p1.getBoard().addBattleShip(bs1);
		p2.getBoard().addBattleShip(bs2);

	}
}
