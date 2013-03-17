package Recursion;

import java.util.HashMap;

public class AddParenthesesDP {
	public int f(String exp, boolean result, int s, int e, HashMap<String, Integer> q){
		String key = "" + result + s + e; 
		if(q.containsKey(key)){
			return q.get(key);
		}
		if(s == e){
			if(exp.charAt(s) == 1 && result){
				return 1;
			}
			if(exp.charAt(s) == 0 && !result){
				return 1;
			}
			return 0;
		}
		
		int c = 0;
		if(result){
			for(int i = s + 1; i < e; i += 2){
				if(exp.charAt(i) == '&'){
					c += f(exp, true, s, i - 1, q) * f(exp, true, i + 1, e, q);
				}
				if(exp.charAt(i) == '|'){
					c += f(exp, true, s, i - 1, q) * f(exp, true, i + 1, e, q);
					c += f(exp, true, s, i - 1, q) * f(exp, false, i + 1, e, q);
					c += f(exp, false, s, i - 1, q) * f(exp, true, i + 1, e, q);
				}
				if(exp.charAt(i) == '^'){
					c += f(exp, true, s, i - 1, q) * f(exp, false, i + 1, e, q);
					c += f(exp, false, s, i - 1, q) * f(exp, true, i + 1, e, q);
				}
			}
		}
		else{
			for(int i = s + 1; i < e; i += 2){
				if(exp.charAt(i) == '&'){
					c += f(exp, true, s, i - 1, q) * f(exp, false, i + 1, e, q);
					c += f(exp, false, s, i - 1, q) * f(exp, true, i + 1, e, q);
					c += f(exp, false, s, i - 1, q) * f(exp, false, i + 1, e, q);
				}
				if(exp.charAt(i) == '|'){
					c += f(exp,false, s, i - 1, q) * f(exp, false, i + 1, e, q);
				}
				if(exp.charAt(i) == '^'){
					c += f(exp,true, s, i - 1, q) * f(exp, true, i + 1, e, q);
					c += f(exp, false, s, i - 1, q) * f(exp, false, i + 1, e, q);
				}
			}
		}
		
		q.put(key, c);
		return c;
		
		
		
	}
	
}
