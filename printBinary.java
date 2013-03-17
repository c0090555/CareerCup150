package BitManipulation;

public class printBinary {
	public static String print(String n){
		int int_part = Integer.parseInt(n.substring(0, n.indexOf('.')));
		double dec_part = Double.parseDouble(n.substring(n.indexOf('.'), n.length()));
		String int_str = new String();
		StringBuffer dec_str = new StringBuffer();
		
		int_str = Integer.toBinaryString(int_part);
		
		double dec_temp;
		
		
		
		while(dec_part > 0){
			//System.out.println("dec_part: " + dec_part);
			if(dec_str.length() > 32)
				return "ERROR";
				
			if(dec_part == 1){
				//
				dec_str.append((int) dec_part);
				break;
			}
			dec_temp = dec_part * 2;
			if(dec_temp >= 1){
				dec_str.append('1');
				dec_part = dec_temp - 1;
			}
			else{ 
				dec_str.append('0');
				dec_part = dec_temp;
			}
			System.out.println("dec_part  " + dec_part);
			System.out.println("dec_temp: " + dec_temp);
		}

		return (int_str + "." + dec_str);
		
	}
	
	
	
	
	
	
	public static void main(String[] args){
		String a = "4.625";
		
		
		
		System.out.println(printBinary.print(a));
	}
}
