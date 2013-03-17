package SortingAndSearching;

import java.util.*;



public class SortStringArrayForAnagrams implements Comparator<String> {
	public String sortChars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);		
	}
	public int compare(String s1, String s2){
		return sortChars(s1).compareTo(sortChars(s2));
	}
	public void sort(String[] array){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		
		//Group words by anagrams
		for(String s: array){
			String key = sortChars(s);
			if(!hash.contains(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams= hash.get(key);
			anagrams.push(s);
		}
		
		
		//Convert hash table to array
		int index = 0;
		for(String key: hash.keySet()){
			LinkedList<String> list = hash.get(key);
			for(String t: list){
				array[index] = t;
				index++;
			}
		}									
	}
	
	
	
}
