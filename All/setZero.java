
public class setZero {
	public static void setZeros(int[][] matrix){
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		
		for(int i = 0; i < rows.length; i++){
			for(int j = 0; j < columns.length; j++){
				if(matrix[i][j] == 0){
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}
		
		
		for(int i = 0; i < rows.length; i++)
			for(int j = 0; j < columns.length; j++)
				if(rows[i] == 1 | columns[j] == 1)
					matrix[i][j] = 0;
	}
	
	public static void main(String[] args){
		int[][] a = new int[][]{{1, 2, 3}, {1, 'a', 6}, {0, 8, 9}};
		
		setZero.setZeros(a);
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println(" ");
		}
	}
}