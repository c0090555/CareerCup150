import java.util.Stack;


public class HanoiTower {
	public static void main(String[] args){
		int n = 3; //Num of disks
		Tower[] tower = new Tower[n];
		
		for(int i = 0; i < 3; i++) 
			tower[i] = new Tower(i);
		
		for(int i = n-1; i >= 0; i--)
			tower[0].add(i);
		
		tower[0].moveDisks(n, tower[2], tower[1]);
		
	}
	
}

class Tower{
	private Stack<Integer> disks = new Stack<Integer>();
	private int index;
	
	Tower(int i){
		index = i;
	}
	
	public int getIndex(){
		return index;
	}
	
	public void add(int v){
		if(!disks.isEmpty()){
			if(disks.peek() <= v){
				System.out.println("Error: cannot place this disk");
			}
			else disks.push(v);
		}
		else disks.push(v);
	}
	
	public void moveTopTo(Tower t){
		if(!disks.isEmpty()){
			int top = disks.pop();
			t.add(top);
			System.out.println("Move disk" + top + " from " + this.getIndex() + " to " + t.getIndex());
		}
	}
	
	public void print(){
		System.out.println("Content of Tower" + this.getIndex());
		for(int i = disks.size() - 1; i >= 0; i--){
			System.out.println("  " + disks.get(i));
		}
	}
	
	public void moveDisks(int n, Tower destination, Tower buffer){
		if(n > 0){
			moveDisks(n-1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
	
	
	
}
