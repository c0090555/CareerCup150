import java.util.Stack;

public class sortStack {
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer>  r = new Stack<Integer>();
		while(!s.isEmpty()){
			Integer tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}
}
