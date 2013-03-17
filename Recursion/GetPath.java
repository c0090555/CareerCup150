package Recursion;

import java.util.*;
import java.awt.*;

public class GetPath {
	static ArrayList<Point> current_path = new ArrayList<Point>();
	public static boolean getPath(int x, int y){
		Point p = new Point(x, y);
		current_path.add(p);
		if(x == 0 & y == 0) return true; //current_path
		boolean success = false;
		if(x >= 1 && is_free(x-1, y)){ //try right
			success = getPath(x-1, y);
		}
		if(!success && y >= 1 && is_free(x, y-1)){//try down
			success = getPath(x, y-1);
		}
		if(!success){
			current_path.remove(p);
		}
		return success;
	}
}
