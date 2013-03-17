package Recursion;

import java.util.*;

public class EightQueens {
	static int GRID_SIZE = 8;
	
	public void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results){
		if(row == GRID_SIZE){
			results.add(columns.clone());
		}
		else{
			for(int col = 0; col < GRID_SIZE; col++){
				if(checkValid(columns, row, col)){
					columns[row] = col; //Place queen
					placeQueens(row + 1, columns, results);
					columns[row] = -1; //Clear queen
				}
			}
		}
	} 
	
	public boolean checkValid(Integer[] columns, int row, int col){
		for(int row2 = 0; row2 < row; row2++){
			int col2 = columns[row2];
			if(col2 == col) return false;
			
			int columnDistance = Math.abs(col2 - col);
			int rowDistance = row - row2;
			if(columnDistance ==  rowDistance) return false;
			
		}
		return true;
		
		
	}
	
}