package Recursion;

import java.util.HashMap;
import java.util.ArrayList;

public class FindMaxStackDP {
	public ArrayList<Box> createMaxStack(Box[] boxes, Box bottom, HashMap<Box, ArrayList<Box>> stack_map){
		if(bottom != null && stack_map.containsKey(bottom)){
			return stack_map.get(bottom);
		}
		
		int max_height = 0;
		ArrayList<Box> max_stack = null;
		for(int i = 0; i < boxes.length; i++){
			if(boxes[i].canBeAbove(bottom)){
				ArrayList<Box> new_stack = createMaxStack(boxes, boxes[i], stack_map);
				int new_height = new_stack.size();
				if(max_height < new_height){
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
		
		stack_map.put(bottom, max_stack);
		return (ArrayList<Box>)max_stack.clone();
		
	}

}
