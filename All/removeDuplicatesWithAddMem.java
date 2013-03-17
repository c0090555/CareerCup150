

public class removeDuplicatesWithAddMem {

	public static int rmDupWithAddMem(char[] str){
		if (str == null) return 0;
		int len = str.length;
		boolean[] hit= new boolean[256];
		
		//for(int i = 0; i <= 255; i++)
			//System.out.print(hit[i] + "\t");
		
		
		if (len == 1) return 1;
		
		hit[str[0]] = true;
		int tail = 1;
		
		for(int i = 1; i < len; i++){
			if(!hit[str[i]]){
				hit[str[i]] = true;
				str[tail] = str[i];
				tail++;
			}
			
		}
		
		return tail;
	}
	
	public static void main(String[] args){
		String s = new String();
		s = "\u0000";
		
		char[] st = new char[300];
		
		
		
		for(int i = 0; i <= 299; i++)
			System.out.print(st[i] + "\t");
		
		//st = null;
		int newLen;
		
		//st = s.toCharArray();
		newLen = removeDuplicatesWithAddMem.rmDupWithAddMem(st);
		System.out.println("newLen is " + newLen);
		
		if(newLen == 0){
			System.out.println("input char[] is null");
		}
		else{
		for(int i = 0; i < newLen; i++){
			System.out.print(st[i] + "\t");
		}
		}
	}
	

}
