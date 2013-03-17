package ObjectOrientedDesign;

public class Othello {
	private final int white = 1;
	private final int black = 2;
	private int[][] board;
	
	public void start(){}
	
	private int won(){
		if(!canGo(white) && !canGo(black)){
			int count = 0;
			for(int i = 0; i < 8; i++)
				for(int j = 0; j < 8; j++){
					if(board[i][j] == white)
						count++;
					if(board[i][j] == black)
						count--;
				}
		
		if(count > 0) return white;
		if(count < 0) return black;
		return 3;
		}
		return 0;
	}
	
	private boolean canGo(int color){
		return true;
	}
	
	private boolean isValid(int color, int x, int y){
		return true;
	}
	
	private void getMove(int color) throws Exception{}
	
	private void add(int x, int y, int color){}
	
	private void game(){
		printBoard();
		while(won == 0){
			boolean valid = false;
			while(!valid){
				try{
					getMove(black);
					valid = true;
				}
				catch(Exception e){
					System.out.println("Enter a valid coordinate!");
				}
			}
			valid = false;
			printBoard();
			while(!valid){
				try{
					getMove(white);
					valid = true;
				}
				catch(Exception e){
					System.out.println("Enter a valid coordinate!");
				}
			}
			pirntBoard();
		}
		if(won != 3){
			System.out.println(won() == 1 ? "white" : "black" + "won!");
		}
		else{
			System.out.println("It's a draw");
		}
	}
	
	
	
}
