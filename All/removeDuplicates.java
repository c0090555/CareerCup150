
public class removeDuplicates {
	public static int removeDups(char[] str){
		if(str == null) return 0;
		int len = str.length;
		if(len == 1) return 1;
		
		int tail = 1;
		
		for(int i = 1; i <= len -1; i++){
			int j;
			for(j = 0; j < tail; j++){
				if(str[i] == str[j]) break;
			}	
			if(j == tail){
					str[tail] = str[i];
					tail++;
			}
		}
		
		return tail;
		
	}
	
	
	public static void main(String[] args){
		char[] s = new char[25];
		String b = "aadsfaserwqdfasdffdasf";
		
		s = b.toCharArray();
		
		int len = s.length;
		
		System.out.println("len is " + len);
		for(int i = 0; i < len; i++){
			System.out.println("aa " + s[i]);
		}
		
		//System.out.println("s is " + s);
		
		int newLen = removeDuplicates.removeDups(s);
		
		System.out.println("new len is " + newLen);
		
		for(int i = 0; i < newLen; i++){
			System.out.println("bb " + s[i]);
		}
	}
	
	
}
