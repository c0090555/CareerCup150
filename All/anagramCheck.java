
public class anagramCheck {
	public static boolean anagrams(String a, String b){
		if(a.length() != b.length()) return false;
		if(a.length() == 0 | b.length() == 0) return false;
		
		int[] letter = new int[256];
		int num_unique_chars = 0;
		int num_completed_b = 0;
		char[] stra = new char[a.length()];
		char[] strb = new char[b.length()];
		stra = a.toCharArray();
		strb = b.toCharArray();
		
		for(char s: stra){
			if(letter[s] == 0){
				num_unique_chars++;
			}
			letter[s]++;
			
		}
		
		System.out.println("strb.length is " + strb.length);
		
		for(int i = 0; i < strb.length; i++){
			//System.out.println("letter[strb[" + i + "]]" + letter[strb[i]]);
			
			
			if(letter[strb[i]] == 0) return false;
			
			letter[strb[i]]--;
			
			
			
			if(letter[strb[i]] == 0){
				num_completed_b ++;
				if(num_unique_chars == num_completed_b){
					return (i == (strb.length - 1));
				}
			}
			
		}
		
		System.out.println("3333");
		return false;
	}

	
	public static void main(String[] args){
		String a = " ";
		String b = " d";
		boolean result;
		
		result = anagramCheck.anagrams(a, b);
		
		System.out.print("result is " + result);
	}
}
