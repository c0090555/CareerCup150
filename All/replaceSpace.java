
public class replaceSpace {
	public static String replaceS(String s){
		char[] str = s.toCharArray();
		int len = str.length;
		String newStr = new String();
		
		for(int i = 0; i < len; i ++){
			if(str[i] == ' '){
				newStr += "%20";
			}
			else{
				newStr += str[i];
			}
		}
		
		return newStr;
	}
	
	public static void main(String[] args){
		String a = new String("123 441 213");
		String b = new String();
		
		b = replaceSpace.replaceS(a);
		System.out.println("b is " + b);
	}
}
