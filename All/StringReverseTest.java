


public class StringReverseTest {
	public static String StringReverse(String str){
		int len = str.length();
		StringBuffer dest = new StringBuffer();
		
		for(int i = len -1; i >= 0; i--){
			dest.append(str.charAt(i));
			
		}
		
		return dest.toString();
	
	}
	
	
	public static void  main(String[] args){
		String a = "Adafsdaft";
		String b = StringReverseTest.StringReverse(a);
		System.out.println("b is " + b);
	}
	
}
