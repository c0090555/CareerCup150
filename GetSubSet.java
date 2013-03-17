package Recursion;

import java.util.*;

public class GetSubSet {
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allSubsets;
		if(set.size() == index){
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}
		else{
			allSubsets = getSubsets(set, index + 1);
			int item = set.get(index);
		
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			
			for(ArrayList<Integer> subset: allSubsets){
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(item);
				moreSubsets.add(newSubset);
			}
			allSubsets.addAll(moreSubsets);
			
		}
		return allSubsets;
	}

}
