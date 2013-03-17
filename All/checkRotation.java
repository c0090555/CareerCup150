
public class checkRotation {
	public static boolean isRotation(String s1, String s2){
		if(s1.length() != s2.length() | s1.length() == 0 | s2.length() == 0)
			return false;
		String s1s1 = s1 + s1;
		int result = s1s1.indexOf(s2);
		if(result == -1) return false;
		else return true;
	}
	
	public static void main(String[] args){
		String a1 = new String();
		String a2 = new String();
		boolean result;
		
		a1 = "";
		a2 = "";
		
		result = checkRotation.isRotation(a1, a2);
		System.out.println("result is " + result);
	}
	
}
