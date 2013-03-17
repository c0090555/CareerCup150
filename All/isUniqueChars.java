

//Assuming the string is only lower case 'a' through 'z'
public class isUniqueChars {
	
	public static boolean isUnique(String str ){
		int checker = 0;
		
		
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i) - 'a';
			System.out.println("val is " + val);
			System.out.println("aaa is " + (1<<val));
			
			if((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		
	return true;
	}
	
	public static void main(String[] args){
		String a = "abcd";
		
		boolean b = isUniqueChars.isUnique(a);
		
		//System.out.println("c is " + c);
		System.out.println("b is " + b);
	}
	
	
	
}
