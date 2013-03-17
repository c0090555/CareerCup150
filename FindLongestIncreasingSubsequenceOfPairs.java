package SortingAndSearching;

import java.util.ArrayList;
import java.util.Collections;


public class FindLongestIncreasingSubsequenceOfPairs {
	ArrayList<HtWt> getIncreasingSequence(ArrayList<HtWt> items){
		Collections.sort(items);
		return longestIncreasingSubsequence(items);
	}
	
	
	//solutions[] indicates the longest sequences ending with every element  
	public void longestIncreasingSubsequence(ArrayList<HtWt> array, ArrayList<HtWt>[] solutions, int current_index){
		if(current_index >= array.size() || current_index < 0){
			return;
		}
		
		HtWt current_element = array.get(current_index);
		//Find longest subsequence we can append current_element to		
		ArrayList<HtWt> bestSequence = null;
		for(int i = 0; i < current_index; i++){
			if(array.get(i).isBefore(current_element)){
				bestSequence = seqWithMaxLength(solutions[i], bestSequence);
			}
		}
		
		//Append current_element to this longest subsequence
		ArrayList<HtWt> new_solution = new ArrayList<HtWt>();
		if(!bestSequence.isEmpty()){
			new_solution.addAll(bestSequence);
		}
		new_solution.add(current_element);
		
		//Add to list and recurse
		solutions[current_index] = new_solution;
		longestIncreasingSubsequence(array, solutions, current_index + 1);
	}
	
	public ArrayList<HtWt> longestIncreasingSubsequence(ArrayList<HtWt> array){
		ArrayList<HtWt>[] solutions = new ArrayList[array.size()];
		longestIncreasingSubsequence(array, solutions, 0);
		ArrayList<HtWt> bestSequence = null;
		for(int i = 0; i < array.size(); i++){
			bestSequence = seqWithMaxLength(bestSequence, solutions[i]);
		}
		return bestSequence;
		
		
		
	}
	
	
	public ArrayList<HtWt> seqWithMaxLength(ArrayList<HtWt> a, ArrayList<HtWt> b){
		if(a == null) return b;
		if(b == null) return a;
		
		if(a.size() >= b.size())
			return a;
		else return b;
	}
	

}


class HtWt implements Comparable<HtWt>{
	int Ht;
	int Wt;
	
	public HtWt(int h, int w){
		Ht = h;
		Wt = w;
	}
	
	public int compareTo(HtWt s){
		HtWt second = (HtWt) s;
		if(this.Ht != second.Ht){
			return ((Integer)this.Ht).compareTo((Integer)second.Ht);
		}
		else
			return ((Integer)this.Wt).compareTo((Integer)second.Wt);
	}
	
	public boolean isBefore(HtWt other){
		if(this.Ht <= other.Ht && this.Wt <= other.Wt) return true;
		else return false;
	}
	
}