package Recursion;

import java.util.*;

public class GetSubSets2 {
	public ArrayList<ArrayList<Integer>> getSub2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 >> set.size();
		for(int i = 0; i < max; i++){
			ArrayList<Integer> subset = convertIntIntoSet(set, i);
			allSubsets.add(subset);
		}
		return allSubsets;
	}
	
	public ArrayList<Integer> convertIntIntoSet(ArrayList<Integer> set, int k){
		ArrayList<Integer> subSet = new ArrayList<Integer>();
		int index = 0;
		for(int i = k; i > 0; i >>= 1){
			if((i & 1) > 0){
				subSet.add(set.get(index));
				index++;
			}
		}
		return subSet;
		
	}
}
