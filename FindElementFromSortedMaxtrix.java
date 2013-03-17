package SortingAndSearching;
//import java.util.*;

public class FindElementFromSortedMaxtrix {
	public static boolean findElement(int[][] matrix, int element){ //Solution1
		int row = 0;
		int col = matrix[0].length;
		while(row < matrix.length - 1 && col >=0){
			if(element == matrix[row][col]){
				return true;
			}
			else if(element > matrix[row][col]){
				row++;
			}
			else col--;
		}			
		return false;
	}		
	
	public static Coordinate findElement2(int[][] matrix, Coordinate origin, Coordinate dest, int x){ //Solution2
		if(!origin.inbounds(matrix) || !dest.inbounds(matrix)){
			return null;
		}
		if(matrix[origin.row][origin.column] == x){
			return origin;
		}
		else if(!origin.isBefore(dest)){
			return null;
		}
		
		
		Coordinate start = (Coordinate) origin.clone();
		int diagDist = Math.min(dest.row - origin.row, dest.column-origin.column);
		Coordinate end = new Coordinate(start.row + diagDist, start.column + diagDist);
		Coordinate p = new Coordinate(0, 0);
		
		//Binary Search
		while(start.isBefore(end)){
			p.setToAverage(start, end);
			if(x == matrix[p.row][p.column])
				return p;
			else if(x > matrix[p.row][p.column]){
				start.row = p.row + 1;
				start.column = p.column + 1;
			}
			else {
				end.row = p.row - 1;
				end.column = p.column - 1;
			}						
		}
		
		
		return partitionAndSearch(matrix, origin, dest, start, x);					
	}
	
	public static Coordinate partitionAndSearch(int[][] matrix, Coordinate origin, Coordinate dest, Coordinate pivot, int elem){
		Coordinate lowerLeftOrigin= new Coordinate(pivot.row, origin.column);
		Coordinate lowerLeftDest = new Coordinate(dest.row, pivot.column - 1);
		Coordinate upperRightOrigin = new Coordinate(origin.row, pivot.column);
		Coordinate upperRightDest = new Coordinate(pivot.row, dest.column);
		
		Coordinate lowerLeft = findElement2(matrix, lowerLeftOrigin, lowerLeftDest, elem);
		if(lowerLeft == null){
			return findElement2(matrix, upperRightOrigin, upperRightDest, elem);
		}
		return lowerLeft;
	}
	
	public static Coordinate findElement2(int[][] matrix, int x){
		Coordinate origin = new Coordinate(0, 0);
		Coordinate dest = new Coordinate(matrix.length - 1, matrix[0].length - 1);
		return findElement2(matrix, origin, dest, x);
		
	}

	
	
}

class Coordinate implements Cloneable{
	public int row; 
	public int column;
	public Coordinate(int r, int c){
		row = r;
		column = c;
	}
	
	public boolean inbounds(int[][] matrix){
		return (row >= 0) && (column >= 0) && (row < matrix.length) && (column < matrix[0].length);
	}
	public boolean isBefore(Coordinate p){
		return row <= p.row && column <= p.column; 
	}
	public Object clone(){
		return new Coordinate(row, column);
	}
	public void setToAverage(Coordinate min, Coordinate max){
		row = (min.row + max.row)/2;
		column = (min.column + max.column)/2;
	}
	
	
	
}
