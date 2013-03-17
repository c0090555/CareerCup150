package Recursion;

import java.util.*;

public class PrintParentheses {
	public static void addParens(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count){
		if(leftRem < 0 || leftRem > rightRem) return; //invalid state
		if(leftRem == 0 && rightRem == 0) {
			String s = String.copyValueOf(str);
			System.out.println("*****"+leftRem + " " + rightRem);
			list.add(s);
		}
		else{
			if(leftRem > 0){
				str[count] = '(';
				System.out.println("1 " + leftRem + " " + rightRem + " count:" + count);
				addParens(list, leftRem - 1, rightRem, str, count + 1);
				
			}
			if(rightRem > leftRem){
				str[count] = ')';
				System.out.println("2 " + leftRem + " " + rightRem + " count:" + count);
				addParens(list, leftRem, rightRem - 1, str, count + 1);
				
			}
			
		}				
	}
	
	public static ArrayList<String> generateParens(int count){
		ArrayList<String> list = new ArrayList<String>();
		char[] str = new char[count * 2];
		addParens(list, count, count, str, 0);
		//System.out.println("ddd" + list.size());
		return list;
	}
	
	public static void main(String[] argvs){
		ArrayList<String> listInstance = new ArrayList<String>();
		int count = 3;
		listInstance = generateParens(count);
		System.out.println(listInstance);
		

			
		
	}
	
}
