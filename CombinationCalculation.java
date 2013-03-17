package Moderate;
import java.util.*;


class ResultNew{
	public Character c;
	public Integer i;
	
	public ResultNew(Character c, Integer i){
		this.c = c;
		this.i = i;
	}
}


public class CombinationCalculation {
	private LinkedList<ResultNew> result = new LinkedList<ResultNew>();
	private Hashtable<Character, Integer> table = new Hashtable<Character, Integer>(); 
	
	public CombinationCalculation(){

	}
	
	public LinkedList<ResultNew> calculate(String s){
		Character element;
		
		for(int i = 0; i <= s.length() - 1; i++){
			element = s.charAt(i);
			if(table.containsKey(element)){
				Integer num = table.get(element);
				num = Integer.valueOf(num.intValue() + 1);
				//System.out.println("num " + num);
				table.put(element, num);
			}
			else{
				Integer num = new Integer(1);
				table.put(element, new Integer(1));
				//System.out.println("num " + num);
			}
		}
		
		Enumeration<Character> e = table.keys();
		while(e.hasMoreElements()){
			Character next = e.nextElement();
			//System.out.println("#####" + next);
			result.add(new ResultNew(next, table.get(next)));
		}
		
		return result;
	}

	
	public void printNodes(){
		 LinkedList<ResultNew> res = (LinkedList<ResultNew>)result.clone();
		
		while(!res.isEmpty()){
			ResultNew e = (ResultNew)res.pop();

			//System.out.println("ddd" + "character " + e.c);
			//System.out.println("ddd" + "num " + e.i);
		}
	}
	
	public void printCombinations(){
		int sum = 1;
		System.out.println("aa");
		LinkedList<ResultNew> res = (LinkedList<ResultNew>)result.clone();
		
		
		
		while(!res.isEmpty()){
			ResultNew e = res.pop(); 
			sum *= (e.i + 1);
			System.out.println(sum);
					
		}
		
		for(int i = 1; i <= sum; i++){
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args){
		CombinationCalculation a = new CombinationCalculation();
		
		
		String s = "122244";
		a.result=a.calculate(s);
		a.printNodes();
		a.printCombinations();
		
	}

}



