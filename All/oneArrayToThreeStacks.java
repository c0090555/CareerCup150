
public class oneArrayToThreeStacks {
	oneArrayToThreeStacks(int sSize){
		this.stackSize = sSize;
	}
	
	private int stackSize;
	private int[] buffer = new int[stackSize * 3];
	private int[] stackPointer = {0, 0, 0}; //point to the top elements of three stacks
	
	
	public void push(int stackNum, int value){
		int index = stackNum * stackSize + stackPointer[stackNum] + 1;
		stackPointer[stackNum]++;
		buffer[index] = value;
	}
	
	public int pop(int stackNum){
		int index = stackNum * stackSize + stackPointer[stackNum];
		buffer[index] = 0; //restore to default value of int type
		stackPointer[stackNum]--;
		return buffer[index];
	}
	
	public int pee(int stackNum){
		int index = stackNum * stackSize + stackPointer[stackNum];
		return buffer[index];
	}
	
	boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == 0;
	}
	
	
}
