
public class oneArrayToThreeStacks2 {
	oneArrayToThreeStacks2(int sSize){
		this.stackSize = sSize;
	}
	
	private int stackSize;
	private int indexUsed = 0;
	private int[] stackPointer = {-1, -1, -1};
	StackNode[] buffer =new StackNode[stackSize * 3];
	
	public void push(int stackNum, int value){
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = indexUsed;
		indexUsed++;
		buffer[stackPointer[stackNum]] = new StackNode(lastIndex, value);	
	}
	
	public int pop(int stackNum){
		int value = buffer[stackPointer[stackNum]].value;
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = buffer[stackPointer[stackNum]].previous;
		buffer[lastIndex] = null;
		indexUsed--;
		return value;		
	}
	
	public int peek(int stackNum){
		int lastIndex = stackPointer[stackNum];
		int value = buffer[stackPointer[stackNum]].value;
		return value;
	}
	
	boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == -1;
	}
	
	
	class StackNode{
		public int previous;
		public int value;
		public StackNode(int p, int v){
			previous = p;
			value = v;
		}
	}
	
}
