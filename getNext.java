 package BitManipulation;

public class getNext {
	public static boolean getBit(int n, int index){
		return ((n & (1<<index)) > 0); //true for one, false for zero
	}
	
	public static int setBit(int n, int index, boolean b){
		if(b){
			return n | (1<<index);
		}
		else{
			int mask = ~(1<<index);
			return n & mask;
		}
	}
	
	
	public static int getNextSmallest(int n){
		if(n <= 0) return -1;
		
		int index = 0;
		int countOnes = 0;
		
		//find the first one
		while(!getBit(n, index)){
			index++;
		}
		
		//System.out.println("1 index:" + index);
		
		
		//turn on the next zero
		while(getBit(n, index)){
			index++;
			countOnes++;
		}
		//System.out.println("2 index:" + index);
		
		n = setBit(n, index, true);
		//System.out.println("1 n:" + n);
		index --;
		n = setBit(n, index, false);
		countOnes--;
		
		//System.out.println("2 n:" + n);
		//System.out.println("3 index:" + index);
		//System.out.println("3 countOnes:" + countOnes);
		
		
		for(int i = index - 1 ; i >= countOnes; i--){
			n = setBit(n, i, false);
		}
		//System.out.println("2.5 n:" + n);
		
		for(int i = countOnes - 1; i >= 0; i--){
			n = setBit(n, i, true);
		}
		//System.out.println("3 n:" + n);
		
		return n;
	}
	
	public static int getNextLargest(int n){
		if(n <= 0) return -1;
		
		int index = 0;
		int countZeros = 0;
		
		//find the first zero
		while(getBit(n, index)){
			index++;
		}
		
		//turn off the first one
		while(!getBit(n, index)){
			index++;
			countZeros++;
		}
		n = setBit(n, index, false);
		
		
		//turn on the next zero
		index--;
		n = setBit(n, index, true);
		countZeros--;
		
		for(int i = index - 1; i >= countZeros; i--){
			n = setBit(n, i, true);
		}
		for(int i = countZeros - 1; i >= 0; i--){
			n = setBit(n, i, false);
		}
		
		return n;
	}
	
	public static void main(String[] args){
		int a = 19;
		System.out.println("nextSmallest is " + getNextSmallest(a));
		System.out.println("nextLargest is " + getNextLargest(a));
	}
	
	
}
