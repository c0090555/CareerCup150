package Recursion;

import java.util.*;

public class GetPermutionOfAString {
	public static ArrayList<String> getPerms(String s){
		ArrayList<String> permutations = new ArrayList<String>();
		if(s == null){
			return null; //error
		}
		else if(s.length() == 0){
			permutations.add("");
			return permutations;
		}
		
		
		char first = s.charAt(0);
		String remainder = s.substring(1);
		ArrayList<String> words = getPerms(remainder);
		for(String word : words){
			for(int j = 0; j <= s.length(); j++){
				permutations.add(insertCharAt(word, first, j));
			}
		}
		
		return permutations;
		
	}
	
	public static String insertCharAt(String word, char c, int i){
		String a = word.substring(0, i-1);
		String b = word.substring(i);
		return a + c + b;
	}
	
}
