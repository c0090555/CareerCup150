package Moderate;

class Result{
	public int hits = 0;
	public int pseudoHits = 0;
	
	public String toString(){
		return new String("Hits " + hits + " PseudoHits " + pseudoHits);
	}
}



public class masterMind {
	
	
	public static int code(char c){
		switch(c){
			case 'B':
				return 0;
			case 'G': 
				return 1;
			case 'R':
				return 2;
			case 'Y':
				return 3;
			default:
				return -1;
		}		
	}
	
	
	
	public static int MAX_COLORS = 4;
	
	public static Result game(String guess, String solution){
		if(guess.length() != solution.length()) 
			return null;
		int[] color = new int[MAX_COLORS];
		int colorCode;
		Result res = new Result();
		
		for(int i = 0; i < solution.length(); i++){
			if(guess.charAt(i) == solution.charAt(i)){
				res.hits++;
			}
			else{
				colorCode = code(solution.charAt(i));
				if(colorCode >= 0) color[colorCode]++;
			}
			
		}
		
		for(int i = 0; i < guess.length(); i++){
			colorCode = code(guess.charAt(i));
			if(colorCode >= 0 && color[colorCode] > 0){
				res.pseudoHits++;
			}
			
		}
		
		return res;
	}
	
	
	public static void main(String[] args){
		Result r = new Result();
		String g = "RGBB";
		String s = "RYsa";
		r = game(g, s);
		
		System.out.println(r.toString());
		
		
		
		
	}
	
	
	
}
