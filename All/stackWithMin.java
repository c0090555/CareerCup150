import java.util.Stack;;

public class stackWithMin extends Stack<NodeWithMin>{
	public void push(int value){
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE; 
		}
		else return peek().min;
	}
	
	
	
	
	
}

class NodeWithMin{
	private int value;
	public int min;
	NodeWithMin(int v, int m){
		value = v;
		min = m;
	}
}