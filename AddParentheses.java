package Recursion;

public class AddParentheses {
	public int f(String exp, boolean result, int s, int e){ //s: start position, e: end position
		if(s == e){
			if(exp.charAt(s) == '1' && result){
				return 1;
			}
			if(exp.charAt(e) == '0' && !result){
				return 1;
			}
			return 0;
		}
		
		int c = 0;
		if(result){
			for(int i = s + 1; i < e; i += 2){
				if(exp.charAt(i) == '&'){
					c += f(exp, true, s, i - 1) * f(exp, true, i + 1, e);
				}
				else if(exp.charAt(i) == '|'){
					c += f(exp, true, s, i - 1) * f(exp, true, i + 1, e);
					c += f(exp, true, s, i - 1) * f(exp, false, i + 1, e);
					c += f(exp, false, s, i - 1) * f(exp, true, i + 1, e);
				}
				else if(exp.charAt(i) == '^'){
					c += f(exp, true, s, i - 1) * f(exp, false, i + 1, e);
					c += f(exp, false, s, i - 1) * f(exp, true, i + 1, e);
				}
			}
		}
		else{
			for(int i = s + 1; i < e; i += 2){
				if(exp.charAt(i) == '&'){
					c += f(exp, true, s, i - 1) * f(exp, false, i + 1, e);
					c += f(exp, false, s, i - 1) * f(exp, true, i + 1, e);
					c += f(exp, false, s, i - 1) * f(exp, false, i + 1, e);
				}
				else if(exp.charAt(i) == '|'){
					c += f(exp, false, s, i - 1) * f(exp, false, i + 1, e);
				}
				else if(exp.charAt(i) == '^'){
					c += f(exp, true, s, i - 1) * f(exp, true, i + 1, e);
					c += f(exp, false, s, i - 1) * f(exp, false, i + 1, e);
				}
				
			}
		}
	
	return c;
	
	}

}
