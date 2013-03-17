package Recursion;

import java.util.ArrayList;

public class FindMaxStack {
	public ArrayList<Box> createStack(Box[] boxes, Box bottom){
		int max_height = 0;
		ArrayList<Box> max_stack = null;
		for(int i = 0; i < boxes.length; i++){
			if(boxes[i].canBeAbove(bottom)){
				ArrayList<Box> new_stack = createStack(boxes, boxes[i]);
				int new_height = new_stack.size();
				if(new_height > max_height){
					max_stack = new_stack;
					max_height = new_height;
				}
			}
		}
		if(max_stack == null){
			max_stack = new ArrayList<Box>(); 
		}
		if(bottom != null){
			max_stack.add(0, bottom);
		}
	
		return max_stack;
		
	}
	

}


class Box{
	public int width;
	public int height;
	public int depth;
	Box(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public boolean canBeAbove(Box below){
		if((width < below.width) && (height < below.height) && (depth < below.depth) )
			return true;
		else return false; 
	}
	
}